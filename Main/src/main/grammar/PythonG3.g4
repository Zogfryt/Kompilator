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
STRING_CHARACTER : '^'  LEFT_PARENTHESIS  '?' '!' .*( '\n' | '\'' )  RIGHT_PARENTHESIS.* ;
STRING : '\''  STRING_CHARACTER* '\''  | '"'  STRING_CHARACTER* '"' ;
//INTEGERS
DIGIT : '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' ;
INT : DIGIT+ ;
//FLOAT VALUES
FLOAT : DIGIT* '.' DIGIT+;
DIGIT_PART : DIGIT+ ;
FRACTION : '.' DIGIT_PART;
//WHITESPACES
fragment WHITESPACE : ' ' | '\t' | '\r';
INDENT : WHITESPACE+;


// parser

