grammar Calculator;

import CalculatorL;

prog:   stat+ ;
stat:
    CLEAR NEWLINE             # clear
    | expr NEWLINE              # printExpr
    | ID '=' expr NEWLINE       # assign
    | NEWLINE                   # blank
    ;

expr: expr op=('*' | '/') expr     # MulDiv
    | expr op=('+' | '-') expr     # AddSub
    | INT                       # int
    | ID                        # id
    | '(' expr ')'              # parens
    ;

