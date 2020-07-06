grammar DataType;

options{
    tokenVocab=SqlLexer;
}

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