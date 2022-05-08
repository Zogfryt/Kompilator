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

