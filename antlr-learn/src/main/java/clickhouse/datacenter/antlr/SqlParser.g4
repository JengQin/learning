grammar SqlParser;

options {
    tokenVocab=SqlLexer;
}

import DataType;


subquery_statment:
    K_SELECT
        column_expr_list
    ( from_stat )
    ( where_stat )?
    ( group_by_stat )?
    ( order_by_stat )?
    ( limit_stat )?
    ;



// select获取的列表达式
column_expr_list:
    not_empty_expression_list
    ;

// from子句
from_stat:
    K_FROM ( full_table_name | LPAREN? subquery_statment RPAREN? ) ( K_AS? table_lias )?
    ( join_stat )*
    ( K_ON LPAREN? join_on_expr RPAREN? )?   //最外层的on表达式
    ;

full_table_name:    // 完整的表名，如：dw.ods_user
    ( database_name DOT ) ? table_name
    ;

database_name:
    identifier
    ;

table_name:
    identifier
    ;

table_lias:     //表的别名
    identifier
    ;


// where子句
where_stat:
    prewhere_step? where_step?
    ;

prewhere_step:
    K_PREWHERE expr alias?
    ;

where_step:
    K_WHERE expr alias?
    ;

// join子句
join_stat:
    (join_type)? K_JOIN subquery_statment
    ;


join_type:
    K_GLOBAL?( K_ANY | K_ALL | K_ASOF )? ( K_INNER | K_LEFT | K_RIGHT | K_FULL | K_CROSS )? ( K_OUTER | K_SEMI |K_ANTI )
    ;


join_on_expr
    : ~( LPAREN | RPAREN )
    | join_on_expr operator=(K_AND | K_OR) join_on_expr
    ;

// group by子句
group_by_stat
    : K_GROUP K_BY not_empty_expression_list ( K_WITH K_TOTALS ) ? ( having_expr )?
    ;

having_expr
    : K_HAVING not_empty_expression_list
    ;

// order by子句
order_by_stat
    : K_ORDER K_BY order_by_expr_list
    ;
order_by_expr_list
    :  order_by_element ( COMMA order_by_element ) *
    ;

order_by_element
    : expr_with_optional_alias ( K_DESC | K_DESCENDING | K_ASC | K_ASCENDING ) ? ( K_NULLS ( K_FIRST | K_LAST ) ) ? ( K_COLLATE STRING_LITERAL ) ?
    ;

expr_with_optional_alias
    : expr alias?
    ;

// limit子句
limit_stat
    : limitby_step?  K_LIMIT NUMERIC_LITERAL ( COMMA NUMERIC_LITERAL )?
    ;

limitby_step
    : K_LIMIT NUMERIC_LITERAL K_BY not_empty_expression_list
    ;

// 表达式
expr
    :  LPAREN expr RPAREN                                                                                                                                              # ExprParen
    |  function                                                                                                                                                        # ExprFunction
    |  K_CASE expr? ( K_WHEN expr K_THEN expr ) ( K_WHEN expr K_THEN expr ) * K_ELSE expr K_END                                                                        # ExprCase
    |  expr LBRAKET expr RBRAKET                                                                                                                                       # ExprArrayElement
    |  MINUS expr                                                                                                                                                      # ExprUnaryMinus
    |  K_CAST LPAREN expr K_AS clickhouse_type RPAREN                                                                                                                  # ExprCast
    |  expr ( STAR | DIVIDE | PERCENT ) expr                                                                                                                           # ExprMul
    |  expr  ( PLUS | MINUS ) expr                                                                                                                                     # ExprAdd
    |  expr  CONCAT expr                                                                                                                                               # ExprConcat
    |  expr  K_BETWEEN expr K_AND expr                                                                                                                                 # ExprBetween
    |  expr ( EQUALS | ASSIGN | NOT_EQUALS | NOT_EQUALS2 | LE | GE | LT | GT | K_LIKE | K_NOT K_LIKE ) expr                                                            # ExprLogical
    |  expr ( K_IN | K_NOT K_IN | K_GLOBAL K_IN | K_GLOBAL K_NOT K_IN ) expr                                                                                           # ExprIn
    |  expr ( K_IS K_NULL | K_IS K_NOT K_NULL )                                                                                                                        # ExprIsNull
    |  K_INTERVAL expr interval_unit                                                                                                                                   # ExprInterval
    |  K_NOT expr                                                                                                                                                      # ExprNot
    |  expr K_AND expr                                                                                                                                                 # ExprAnd
    |  expr K_OR expr                                                                                                                                                  # ExprOr
    |  expr QUESTION expr COLON expr                                                                                                                                   # ExprTernary
    |  ( LPAREN identifier ( COMMA identifier )* RPAREN | identifier ( COMMA identifier )* ) RARROW expr                                                               # ExprLambda
    |  subquery                                                                                                                                                        # ExprSubquery
    |  LPAREN  not_empty_expression_list RPAREN                                                                                                                        # ExprList
    |  expr DOT expr                                                                                                                                                   # ExprTupleElement
    |  array                                                                                                                                                           # ExprArray
    |  literal                                                                                                                                                         # ExprLiteral
    |  column                                                                                                                                                          # ExprId
    |  STAR                                                                                                                                                            # ExprStar
    |  expr alias                                                                                                                                                      # ExprWithAlias
    ;


// 列
column:
    ( table_name DOT )? column_name
    ;

column_name:
    identifier
    ;

clickhouse_type:
    simple_type
    | T_AGGREGATE_FUNCTION LPAREN function_name ( COMMA clickhouse_type ) * RPAREN
    | T_ARRAY LPAREN clickhouse_type RPAREN
    | T_TUPLE LPAREN clickhouse_type ( COMMA clickhouse_type ) * RPAREN
    | T_NULLABLE LPAREN clickhouse_type LPAREN
    ;

interval_unit
    : K_YEAR
    | K_MONTH
    | K_WEEK
    | K_DAY
    | K_HOUR
    | K_MINUTE
    | K_SECOND
    ;
subquery
    :  LPAREN subquery_statment RPAREN
    ;
not_empty_expression_list
    : expr ( COMMA expr )*
    ;

array
 :   LBRAKET expression_list RBRAKET
 ;
expression_list
 :   ( not_empty_expression_list )?
 ;

// 函数
function
    : function_name function_parameters? function_arguments
    ;

function_parameters
    : LPAREN ( expr ( COMMA expr )* )? RPAREN
    ;

function_arguments
    : LPAREN ( expr ( COMMA expr )* )? RPAREN
    ;

function_name:  //函数名
    identifier
    ;

alias
 : K_AS alias_name
 ;

alias_name
 : identifier
 ;

literal
 :    K_NULL
 |    NUMERIC_LITERAL
 |    STRING_LITERAL
 ;

//标识符
identifier:
    QUOTED_LITERAL
    | IDENTIFIER
    ;