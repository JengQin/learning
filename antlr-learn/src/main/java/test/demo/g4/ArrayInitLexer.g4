lexer grammar ArrayInitLexer;

INT : [0-9]+ ;
WS  : (' '|'\t'|'\r'|'\n')+ -> skip;