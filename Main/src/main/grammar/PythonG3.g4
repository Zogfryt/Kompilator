grammar PythonG3;

// lexer -- skaner
tokens { INDENT, DEDENT }


@lexer::members
{
    private java.util.LinkedList<Token> tokens = new java.util.LinkedList<>();
    private java.util.Stack<Integer> levels = new java.util.Stack<>();
    private int opened = 0;
    private Token lastToken = null;


    @Override
    public void emit(Token current)
    {
        super.emit(current);
        tokens.offer(current);
    }

    @Override
    public Token nextToken()
    {
        if(_input.LA(1) == EOF && !levels.isEmpty())
        {
            emit(commonToken(PythonG3Parser.NEWLINE, "\n"));

            while (!levels.isEmpty()) {
                emit(createDedent());
                levels.pop();
            }

            emit(commonToken(PythonG3Parser.EOF, "<EOF>"));
        }

        Token next = super.nextToken();

        return tokens.isEmpty() ? next : tokens.poll();
    }

private Token createDedent() {
        CommonToken dedent = commonToken(PythonG3Parser.DEDENT, "");
        dedent.setLine(lastToken.getLine());
        return dedent;
    }

    private CommonToken commonToken(int type, String text) {
        int stop = getCharIndex() - 1;
        int start = text.isEmpty() ? stop : stop - text.length() + 1;
        return new CommonToken(_tokenFactorySourcePair, type, DEFAULT_TOKEN_CHANNEL, start, stop);
    }

    static int getIndentationCount(String spaces) {
        int count = 0;
        for (char ch : spaces.toCharArray()) {
            if (ch == '\t') {
                count += 8 - (count % 8);
            } else {
                count++;
            }
        }

        return count;
    }

    boolean atStartOfInput() {
        return super.getCharPositionInLine() == 0 && super.getLine() == 1;
    }

    void openBrace(){
        opened++;
    }

    void closeBrace(){
        opened--;
    }

    void onNewLine(){
        String newLine = getText().replaceAll("[^\r\n\f]+", "");
        String spaces = getText().replaceAll("[\r\n\f]+", "");

        int next = _input.LA(1);
        int nextnext = _input.LA(2);
        if (opened > 0 || (nextnext != -1 && (next == '\r' || next == '\n' || next == '\f' || next == '#')))
        {
            skip();
        }
        else {
            emit(commonToken(PythonG3Parser.NEWLINE, newLine));
            int indent = getIndentationCount(spaces);
            int previous = levels.isEmpty() ? 0 : levels.peek();
            if (indent == previous) {
                skip();
            }
            else if (indent > previous) {
                levels.push(indent);
                emit(commonToken(PythonG3Parser.INDENT, spaces));
            }
            else {
                while(!levels.isEmpty() && levels.peek() > indent) {
                    emit(createDedent());
                    levels.pop();
                }
            }
        }
    }

}

//KEYWORDS
TRUE : 'True';
FALSE : 'False';
NULL : 'None';
IF : 'if';
ELSE : 'else';
ELSE_IF : 'elif';
FOR : 'for';
WHILE : 'while';
CONTINUE : 'continue';
BREAK : 'break';
CONST_AND : 'and';
CONST_OR : 'or';
NEGATION : 'not';
IN : 'in';
AS : 'as';
TRY : 'try';
CATCH : 'except';
//OPERATORS
PLUS : '+';
MINUS          : '-';
MULTIPLICATION : '*';
DIVISION       : '/';
MODULO         : '%';
EQUALITY          : '==' ;
INEQUALITY        : '!=' ;
GREATER           : '>' ;
GREATER_OR_EQUAL  : '>=' ;
SMALLER           : '<' ;
SMALLER_OR_EQUAL  : '<=' ;
ASSIGNMENT        : '=' ;
//SEPARATORS
LEFT_PARENTHESIS    :  '(' {openBrace();};
RIGHT_PARENTHESIS   :  ')' {closeBrace();};
COLON               :  ':';
INCREASE_ADD        : '+=';
DECREASE_SUBSTRACT  : '-=';
INCREASE_MULTIPLY   : '*=';
DECREASE_DIVISION  : '/=';
DECREASE_MODULO     : '%=';
LEFT_BRACKET        : '[' {openBrace();};
RIGHT_BRACKET       : ']' {closeBrace();};
SEPARATOR: ',';
//STRING
STRING
 : STRING_LITERAL
 ;
 STRING_LITERAL
  : ( [rR] | [uU] | [fF] | ( [fF] [rR] ) | ( [rR] [fF] ) )? ( SHORT_STRING | LONG_STRING )
  ;
NEWLINE
: ( {atStartOfInput()}?   SPACES
  | ( '\r'? '\n' | '\r' | '\f' ) SPACES?
  )
  {onNewLine();}
;
fragment SPACES
 : [ \t]+
 ;
//INTEGERS
INT : DIGIT+ ;
//FLOAT VALUES
FLOAT : DIGIT* '.' DIGIT+;

//variable ID
VARIABLE        : LETTER (LETTER|DIGIT)* ;
WS : ( SPACES | COMMENT ) -> skip;
INCORECT_CHAR: .;

fragment DIGIT : '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' ;
//WHITESPACES
fragment WHITESPACE : ' ' | '\t' | '\r' | '\n';
fragment LETTER          : ('a'..'z')|('A'..'Z')|'_';
fragment COMMENT : '#' ~[\r\n\f]*;
fragment SHORT_STRING
: '\'' ( STRING_ESCAPE_SEQ | ~[\\\r\n\f'] )* '\''
| '"' ( STRING_ESCAPE_SEQ | ~[\\\r\n\f"] )* '"'
;
fragment LONG_STRING
: '\'\'\'' LONG_STRING_ITEM*? '\'\'\''
| '"""' LONG_STRING_ITEM*? '"""'
;
fragment LONG_STRING_ITEM
: LONG_STRING_CHAR
| STRING_ESCAPE_SEQ
;
fragment LONG_STRING_CHAR
: ~'\\'
;
fragment STRING_ESCAPE_SEQ
: '\\' .
| '\\' NEWLINE
;

// parser

file_input : (NEWLINE | statement)* EOF;

statement : simple_statement
    | block_statement;
simple_statement : (increment_statement
    | assign_statement
    | CONTINUE
    | BREAK) NEWLINE;
assign_statement : (VARIABLE ASSIGNMENT)+ expression;
expression : expression CONST_OR conjunction
    | conjunction;
conjunction : conjunction CONST_AND inversion
    | inversion;
inversion: NEGATION inversion
    | comparative;
comparative : sum comparative_tail
    | sum;
comparative_tail : comparative_less
    | comparative_eq_less
    | comparative_more
    | comparative_eq_more
    | comparative_eq;
comparative_less : SMALLER sum;
comparative_eq_less : SMALLER_OR_EQUAL sum;
comparative_more : GREATER sum;
comparative_eq_more : GREATER_OR_EQUAL sum;
comparative_eq : EQUALITY sum;

sum : sum PLUS mult
    | sum MINUS mult
    | mult;

mult : mult MULTIPLICATION atom
    | mult DIVISION atom
    | atom;
atom : VARIABLE
    | INT
    | FLOAT
    | FALSE
    | TRUE
    | NULL
    | STRING
    | LEFT_PARENTHESIS expression RIGHT_PARENTHESIS;

increment_statement: VARIABLE (INCREASE_ADD | INCREASE_MULTIPLY | DECREASE_DIVISION | DECREASE_MODULO | DECREASE_SUBSTRACT) expression;

block_statement : if_statement
    | while_statement
    | for_statement
    | try_statement;

while_statement : WHILE expression COLON block;
if_statement : IF expression COLON block (ELSE_IF expression COLON block)* (ELSE COLON block);
try_statement : TRY COLON block (CATCH VARIABLE (AS VARIABLE)? COLON block)+ (CATCH COLON block)?
    | TRY COLON block CATCH COLON block;
for_statement : FOR VARIABLE IN table COLON block;
table : LEFT_BRACKET list_of_variables RIGHT_BRACKET;
list_of_variables : atom (SEPARATOR atom)*;
block : simple_statement | NEWLINE INDENT (statement)+ DEDENT;
