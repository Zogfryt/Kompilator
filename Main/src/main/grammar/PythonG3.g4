grammar PythonG3;

// lexer -- skaner

fragment DIGIT : [0-9];

fragment WHITESPACE : ' ' | '\t' | '\r';

INT : DIGIT+;
FLOAT : DIGIT* '.' DIGIT+;

// parser

