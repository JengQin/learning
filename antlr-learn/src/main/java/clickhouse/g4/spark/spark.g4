grammar spark;

select_simple
    : ctes? queryNoWith
    ;

ctes
    : WITH namedQuery (',' namedQuery)*
    ;

namedQuery
    : '(' select_simple ')' (AS name=identifier)?
    ;

identifier
    : strictIdentifier
    | ANTI | FULL | INNER | LEFT | SEMI | RIGHT | NATURAL | JOIN | CROSS | ON
    | UNION | INTERSECT | EXCEPT | SETMINUS
    ;

strictIdentifier
    : IDENTIFIER             #unquotedIdentifier
    | quotedIdentifier       #quotedIdentifierAlternative
    ;

quotedIdentifier
    : BACKQUOTED_IDENTIFIER
    ;
