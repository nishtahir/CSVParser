grammar CSV;

options {
  output=AST;
}

@header {
    package com.nishtahir;
}

@lexer::header {
    package com.nishtahir;
}

file
    :  head row+ EOF
    ;

head
    : row
    ;

row
    :  field (',' field)* (LINE_BREAK | EOF)
    ;

field
    :  TEXT
    |  STRING
    ;

LINE_BREAK
    :  '\r'? '\n'
    |  '\r'
    ;

TEXT
    :  ~(',' | '\r' | '\n' | '"')+
    ;

STRING
    :  '"' ('""' | ~'"')* '"'
    ;