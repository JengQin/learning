grammar ClickHouse;

options {
    tokenVocab=ClickHouseLexer;
}

//import ClickHouseLexer;

parse
 : ( select_statement ) EOF
 ;

select_statement:
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
    K_FROM ( full_table_name | LPAREN? select_statement RPAREN? ) ( K_AS? table_lias )?
    ( join_stat )?
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
    prewhere_step? where_step
    ;

prewhere_step:
    K_PREWHERE expr alias?
    ;

where_step:
    K_WHERE expr alias?
    ;

// join子句
join_stat:
    (join_type)? K_JOIN select_statement
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
    :  LPAREN select_statement RPAREN
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
    | identifier_keyword
    | simple_type
    ;

identifier_keyword:
    K_ADD
    | K_AFTER
    | K_ALL
    | K_ALIAS
    | K_ALTER
    | K_AND
    | K_ANY
    | K_ARRAY
    | K_AS
    | K_ASCENDING
    | K_ASC
    | K_ASYNC
    | K_ATTACH
    | K_BETWEEN
    | K_BY
    | K_CASE
    | K_CHECK
    | K_COLUMN
    | K_COLLATE
    | K_CREATE
    | K_CROSS
    | K_DESCRIBE
    | K_DESCENDING
    | K_DESC
    | K_DATABASE
    | K_DATABASES
    | K_DEFAULT
    | K_DETACH
    | K_DISTINCT
    | K_DROP
    | K_ENGINE
    | K_ELSE
    | K_END
    | K_EXISTS
    | K_FINAL
    | K_FIRST
    | K_FROM
    | K_FORMAT
    | K_FULL
    | K_GLOBAL
    | K_GROUP
    | K_HAVING
    | K_ID
    | K_IF
    | K_INNER
    | K_INSERT
    | K_INTO
    | K_IN
    | K_IS
    | K_JOIN
    | K_KILL
    | K_LAST
    | K_LEFT
    | K_LIKE
    | K_LIMIT
    | K_MAIN
    | K_MATERIALIZED
    | K_MODIFY
    | K_NOT
    | K_NULL
    | K_NULLS
    | K_OFFSET
    | K_ON
    | K_OPTIMIZE
    | K_ORDER
    | K_OR
    | K_OUTFILE
    | K_PARTITION
    | K_POPULATE
    | K_PREWHERE
    | K_PROCESSLIST
    | K_QUERY
    | K_RENAME
    | K_RETURN
    | K_RIGHT
    | K_SAMPLE
    | K_SELECT
    | K_SET
    | K_SETTINGS
    | K_SHOW
    | K_SYNC
    | K_TABLE
    | K_TABLES
    | K_TEMPORARY
    | K_TEST
    | K_THEN
    | K_TOTALS
    | K_TO
    | K_OUTER
    | K_VALUES
    | K_VIEW
    | K_UNION
    | K_USE
    | K_USING
    | K_WHEN
//    | K_WHERE
    | K_WITH
    ;


simple_type
    : T_UINT8
    | T_UINT16
    | T_UINT32
    | T_UINT64
    | T_INT8
    | T_INT16
    | T_INT32
    | T_INT64
    | T_FLOAT32
    | T_FLOAT64
    | T_ENUM8 LPAREN enum_entry ( COMMA enum_entry ) * LPAREN
    | T_ENUM16 LPAREN enum_entry ( COMMA enum_entry ) * LPAREN
    | T_UUID
    | T_DATE
    | T_DATETIME
    | T_STRING
    | T_INTERVAL_YEAR
    | T_INTERVAL_MONTH
    | T_INTERVAL_WEEK
    | T_INTERVAL_DAY
    | T_INTERVAL_HOUR
    | T_INTERVAL_MINUTE
    | T_INTERVAL_SECOND
    | T_NULL
    | T_FIXEDSTRING LPAREN NUMERIC_LITERAL LPAREN
    ;

enum_entry
    : STRING_LITERAL ASSIGN NUMERIC_LITERAL
    ;

//err
// : UNEXPECTED_CHAR
//   {
//     throw new RuntimeException("UNEXPECTED_CHAR=" + $UNEXPECTED_CHAR.text);
//   }
// ;


// Tokens
LINE_COMMENT
	:	'--' ~[\r\n]*  -> channel(HIDDEN)
	;

 // TOKENS, KEYWORDS

K_ADD : A D D;
K_AFTER : A F T E R;
K_ALL : A L L;
K_ALIAS : A L I A S;
K_ALTER : A L T E R;
K_AND : A N D;
K_ANY : A N Y;
K_ARRAY : A R R A Y;
K_AS : A S;
K_ASCENDING : A S C E N D I N G;
K_ASC : A S C;
K_ASYNC : A S Y N C;
K_ATTACH : A T T A C H;
K_BETWEEN : B E T W E E N;
K_BY : B Y;
K_CASE : C A S E;
K_CAST : C A S T;
K_CHECK : C H E C K;
K_CLUSTER : C L U S T E R;
K_COLUMN : C O L U M N;
K_COLLATE : C O L L A T E;
K_CREATE : C R E A T E;
K_CROSS : C R O S S;
K_DAY : D A Y;
K_DESCRIBE : D E S C R I B E;
K_DESCENDING : D E S C E N D I N G;
K_DESC : D E S C;
K_DATABASE : D A T A B A S E;
K_DATABASES : D A T A B A S E S;
K_DEFAULT : D E F A U L T;
K_DETACH : D E T A C H;
K_DISTINCT : D I S T I N C T;
K_DROP : D R O P;
K_ELSE : E L S E;
K_END : E N D;
K_ENGINE : E N G I N E;
K_EXISTS : E X I S T S;
K_FETCH : F E T C H;
K_FINAL : F I N A L;
K_FIRST : F I R S T;
K_FROM : F R O M;
K_FREEZE : F R E E Z E;
K_FORMAT : F O R M A T;
K_FULL : F U L L;
K_GLOBAL : G L O B A L;
K_GROUP : G R O U P;
K_HAVING : H A V I N G;
K_HOUR : H O U R;
K_ID : I D;
K_IF : I F;
K_INNER : I N N E R;
K_INSERT : I N S E R T;
K_INTERVAL : I N T E R V A L;
K_INTO : I N T O;
K_IN : I N;
K_IS : I S;
K_JOIN : J O I N;
K_KILL: K I L L;
K_LAST : L A S T;
K_LEFT : L E F T;
K_LIKE : L I K E;
K_LIMIT : L I M I T;
K_MAIN : M A I N;  // not a clickhouse reverved word
K_MATERIALIZED : M A T E R I A L I Z E D;
K_MINUTE : M I N U T E;
K_MODIFY : M O D I F Y;
K_MONTH : M O N T H;
K_NOT : N O T;
K_NULL : N U L L;
K_NULLS : N U L L S;
K_OFFSET : O F F S E T;
K_ON : O N;
K_OPTIMIZE : O P T I M I Z E;
K_ORDER : O R D E R;
K_OR : O R;
K_OUTFILE : O U T F I L E;
K_PARTITION : P A R T I T I O N;
K_POPULATE : P O P U L A T E;
K_PREWHERE : P R E W H E R E;
K_PROCESSLIST : P R O C E S S L I S T;
K_QUERY : Q U E R Y;
K_RENAME : R E N A M E;
K_RETURN : R E T U R N;  // not a clickhouse reverved word
K_RIGHT : R I G H T;
K_SAMPLE : S A M P L E;
K_SECOND : S E C O N D;
K_SELECT : S E L E C T;
K_SET : S E T;
K_SETTINGS : S E T T I N G S;
K_SHOW : S H O W;
K_SYNC : S Y N C;
K_TABLE : T A B L E;
K_TABLES : T A B L E S;
K_TEMPORARY : T E M P O R A R Y;
K_TEST : T E S T;
K_THEN : T H E N;
K_TOTALS : T O T A L S;
K_TO : T O;
K_OUTER: O U T E R;
K_VALUES : V A L U E S;
K_VIEW : V I E W;
K_UNION : U N I O N;
K_USE : U S E;
K_USING : U S I N G;
K_WEEK : W E E K;
K_WHEN : W H E N;
K_WHERE : W H E R E;
K_WITH : W I T H;
K_YEAR : Y E A R;

K_SEMI  :   S E M I;
K_ANTI  :   A N T I;
K_ASOF  :   A S O F;

COLON        : ':'                    ;
COMMA        : ','                    ;
SEMI         : ';'                    ;
LPAREN       : '('                    ;
RPAREN       : ')'                    ;
RARROW       : '->'                   ;
LT           : '<'                    ;
GT           : '>'                    ;
QUESTION     : '?'                    ;
STAR         : '*'                    ;
PLUS         : '+'                    ;
CONCAT       : '||'                   ;
OR           : '|'                    ;
DOLLAR       : '$'                    ;
DOT		     : '.'                    ;
PERCENT      : '%'                    ;
MINUS        : '-'                    ;
DIVIDE       : '/'                    ;
EQUALS       : '=='                   ;
ASSIGN       : '='                    ;
NOT_EQUALS   : '!='                   ;
NOT_EQUALS2  : '<>'                   ;
LE           : '<='                   ;
GE           : '>='                   ;
LBRAKET      : '['                    ;
RBRAKET      : ']'                    ;
LCURLY       : '{'                    ;
RCURLY       : '}'                    ;


T_ARRAY : 'Array' ;
T_TUPLE : 'Tuple' ;
T_NULLABLE : 'Nullable' ;
T_FLOAT32 : 'Float32' ;
T_FLOAT64 : 'Float64' ;
T_UINT8 : 'UInt8' ;
T_UINT16 : 'UInt16' ;
T_UINT32 : 'UInt32' ;
T_UINT64 : 'UInt64' ;
T_INT8 : 'Int8' ;
T_INT16 : 'Int16' ;
T_INT32 : 'Int32' ;
T_INT64 : 'Int64' ;
T_ENUM8 : 'Enum8' ;
T_ENUM16 : 'Enum16' ;
T_UUID : 'UUID' ;
T_DATE : 'Date' ;
T_DATETIME : 'DateTime' ;
T_STRING : 'String' ;
T_FIXEDSTRING : 'FixedString' ;
T_NULL : 'Null' ;
T_INTERVAL_YEAR : 'IntervalYear' ;
T_INTERVAL_MONTH : 'IntervalMonth' ;
T_INTERVAL_WEEK : 'IntervalWeek' ;
T_INTERVAL_DAY : 'IntervalDay' ;
T_INTERVAL_HOUR : 'IntervalHour' ;
T_INTERVAL_MINUTE : 'IntervalMinute' ;
T_INTERVAL_SECOND : 'IntervalSecond' ;
T_AGGREGATE_FUNCTION : 'AggregateFunction' ;
// lambda type has unknown name.

IDENTIFIER
  : [a-zA-Z_] [a-zA-Z_0-9]*
  ;

NUMERIC_LITERAL
 : DIGIT+ ( '.' DIGIT* )? ( E [-+]? DIGIT+ )?
 | '.' DIGIT+ ( E [-+]? DIGIT+ )?
 ;

STRING_LITERAL
 : '\'' ( ~'\'' | '\\\'' )* '\''
 ;

QUOTED_LITERAL
 : '`' ( ~'`' )* '`'
 ;

SPACES
 : [ \u000B\t\r\n] -> channel(HIDDEN)
 ;

UNEXPECTED_CHAR
 : .
 ;

fragment DIGIT : [0-9];

fragment A : [aA];
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];
