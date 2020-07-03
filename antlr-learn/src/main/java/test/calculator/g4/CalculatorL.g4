lexer grammar CalculatorL;


// Token
ID: [a-zA-Z]+   ;
INT: [0-9]+ ;
CLEAR: ('!clear') ;
NEWLINE : '\r' ? '\n' ;


MUL:    '*';
DIV:    '/';
ADD:    '+';
SUB:    '-';


WS: [ \t]+ -> skip  ;


