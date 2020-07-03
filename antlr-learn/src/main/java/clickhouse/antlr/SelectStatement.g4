grammar SelectStatement;

options {
    tokenVocab=ClickHouseLexer;
}


subquery_statment:
    K_SELECT
        column_list_expr
    K_FROM (full_table_name | subquery_statment)  ( K_AS? table_lias)
    (join_clause)?
    (where_expr)
    (group_by_expr)?

    ;


join_clause:
    (join_type)? K_JOIN subquery_statment
    ;


join_type:
    K_GLOBAL?( K_ANY | K_ALL | K_ASOF )? ( K_INNER | K_LEFT | K_RIGHT | K_FULL | K_CROSS )? ( K_OUTER | K_SEMI |K_ANTI )
    ;


join_on_expr
    : ~( LPAREN | RPAREN )
    | join_on_expr operator=(K_AND | K_OR) join_on_expr
    ;