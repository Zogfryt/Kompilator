grammar PythonG3;

// lexer -- skaner



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
LEFT_PARENTHESIS    :  '(';
RIGHT_PARENTHESIS   :  ')';
COLON               :  ':';
INCREASE_ADD        : '+=';
DECREASE_SUBSTRACT  : '-=';
INCREASE_MULTIPLY   : '*=';
DECREASE_DIVISION  : '/=';
DECREASE_MODULO     : '%=';
LEFT_BRACKET        : '[';
RIGHT_BRACKET       : ']';
SEPARATOR: ',';
LEFT_CURLY: '{';
RIGHT_CURLY: '}';
//STRING
STRING
 : STRING_LITERAL
 ;
 STRING_LITERAL
  : ( [rR] | [uU] | [fF] | ( [fF] [rR] ) | ( [rR] [fF] ) )? ( SHORT_STRING | LONG_STRING )
  ;
NEWLINE
: ( '\r'? '\n' | '\r' | '\f' ) SPACES?
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
if_statement : IF expression COLON block (ELSE_IF expression COLON block)* (ELSE COLON block)?;
try_statement : TRY COLON block (CATCH VARIABLE (AS VARIABLE)? COLON block)+ (CATCH COLON block)?
    | TRY COLON block CATCH COLON block;
for_statement : FOR VARIABLE IN table COLON block;
table : LEFT_BRACKET list_of_variables RIGHT_BRACKET;
list_of_variables : atom (SEPARATOR atom)*;
block : simple_statement | NEWLINE? LEFT_CURLY (NEWLINE* statement)+ NEWLINE* RIGHT_CURLY;
