package com.jeng.calcite.parser;

import org.apache.calcite.config.Lex;
import org.apache.calcite.sql.*;
import org.apache.calcite.sql.parser.SqlParseException;
import org.apache.calcite.sql.parser.SqlParser;

/**
 * The Test2
 *
 * @author JiaZheng
 * @create 2020-08-21 21:23
 */
public class Test2 {

    public static void main(String[] args) {
        SqlParser.Config config = SqlParser.configBuilder()
                .setLex(Lex.MYSQL) //使用mysql 语法
                .build();
        //SqlParser 语法解析器
        SqlParser sqlParser = SqlParser
                .create("select id,name,sum(age) as age_sum FROM stu where age<20", config);
        SqlNode sqlNode = null;
        try {
            sqlNode = sqlParser.parseStmt();
        } catch (SqlParseException e) {
            throw new RuntimeException("", e);
        }
        //这里解析了一个select的语句，那么得到的sqlNode就是一个SqlSelect。
        if(SqlKind.SELECT.equals(sqlNode.getKind())){

            SqlSelect sqlSelect = (SqlSelect) sqlNode;
            SqlNode from=sqlSelect.getFrom();
            SqlNode where=sqlSelect.getWhere();
            SqlNodeList selectList=sqlSelect.getSelectList();
            //标识符
            if(SqlKind.IDENTIFIER.equals(from.getKind())){
                System.out.println("from="+from.toString());
            }

            System.out.println("=================");
            if(SqlKind.LESS_THAN.equals(where.getKind())){
                SqlBasicCall sqlBasicCall=(SqlBasicCall)where;
                for(SqlNode sqlNode1: sqlBasicCall.operands){
                    if(SqlKind.LITERAL.equals(sqlNode1.getKind())){
                        System.out.println(sqlNode1.toString());
                    }
                }
            }

            System.out.println("=================");
            selectList.getList().forEach(x->{
                if(SqlKind.IDENTIFIER.equals(x.getKind())){
                    System.out.println(x.toString());
                }
            });

            System.out.println("============");
            System.out.println(sqlSelect.getFrom());
            System.out.println(sqlSelect.getSelectList());
            System.out.println(sqlSelect.getWhere());
        }
    }
}
