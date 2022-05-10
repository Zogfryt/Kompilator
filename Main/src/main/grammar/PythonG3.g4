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
//STRING
STRING
 : STRING_LITERAL
 | BYTES_LITERAL
 ;
 STRING_LITERAL
  : ( [rR] | [uU] | [fF] | ( [fF] [rR] ) | ( [rR] [fF] ) )? ( SHORT_STRING | LONG_STRING )
  ;
  BYTES_LITERAL
   : ( [bB] | ( [bB] [rR] ) | ( [rR] [bB] ) ) ( SHORT_BYTES | LONG_BYTES )
   ;
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
        fragment SHORT_BYTES
         : '\'' ( SHORT_BYTES_CHAR_NO_SINGLE_QUOTE | BYTES_ESCAPE_SEQ )* '\''
         | '"' ( SHORT_BYTES_CHAR_NO_DOUBLE_QUOTE | BYTES_ESCAPE_SEQ )* '"'
         ;
         fragment LONG_BYTES
          : '\'\'\'' LONG_BYTES_ITEM*? '\'\'\''
          | '"""' LONG_BYTES_ITEM*? '"""'
          ;
          fragment LONG_BYTES_ITEM
           : LONG_BYTES_CHAR
           | BYTES_ESCAPE_SEQ
           ;
           fragment SHORT_BYTES_CHAR_NO_SINGLE_QUOTE
            : [\u0000-\u0009]
            | [\u000B-\u000C]
            | [\u000E-\u0026]
            | [\u0028-\u005B]
            | [\u005D-\u007F]
            ;
            fragment SHORT_BYTES_CHAR_NO_DOUBLE_QUOTE
             : [\u0000-\u0009]
             | [\u000B-\u000C]
             | [\u000E-\u0021]
             | [\u0023-\u005B]
             | [\u005D-\u007F]
             ;
             fragment LONG_BYTES_CHAR
              : [\u0000-\u005B]
              | [\u005D-\u007F]
              ;
              fragment BYTES_ESCAPE_SEQ
               : '\\' [\u0000-\u007F]
               ;
NEWLINE
: ( {this.atStartOfInput()}?   SPACES
  | ( '\r'? '\n' | '\r' | '\f' ) SPACES?
  )
  {this.onNewLine();}
;
fragment SPACES
 : [ \t]+
 ;
//INTEGERS
fragment DIGIT : '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' ;
INT : DIGIT+ ;
//FLOAT VALUES
FLOAT : DIGIT* '.' DIGIT+;
//WHITESPACES
fragment WHITESPACE : ' ' | '\t' | '\r' | '\n';
//variable ID
VARIABLE        : ID ;
fragment ID              : LETTER (LETTER|DIGIT)*;
fragment LETTER          : ('a'..'z')|('A'..'Z')|'_';

// parser

file_input : (NEWLINE | statement)* EOF;

statement : simple_statement NEWLINE
    | block_statement NEWLINE;
simple_statement : increment_statement
    | assign_statement;
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
block : statement | NEWLINE INDENT (statement)+ DEDENT;
