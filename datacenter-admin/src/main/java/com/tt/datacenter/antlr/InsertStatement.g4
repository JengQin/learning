grammar InsertStatement;

options {
    tokenVocab=ClickHouseLexer;
}
import ClickHouse;

insert_statement:
    insert_select_stat
    ;

insert_select_stat:
    K_INSERT K_INTO full_table_name ( LPAREN column_name_list RPAREN )? subquery
    ;


column_name_list
 :  column_name ( COMMA column_name ) *
 ;

