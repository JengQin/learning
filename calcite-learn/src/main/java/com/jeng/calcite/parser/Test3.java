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
public class Test3 {

    public static void main(String[] args) {
        SqlParser.Config config = SqlParser.configBuilder()
                .setLex(Lex.MYSQL) //使用mysql 语法
                .build();
        //SqlParser 语法解析器
        SqlParser sqlParser = SqlParser
                .create("select id,name,age_sum FROM (select id,name,dictGet(age) as age_sum FROM stu join stu1 where age<20) tt", config);
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


            System.out.println("============");
            System.out.println(sqlSelect.getFrom());
            System.out.println(sqlSelect.getSelectList());
            System.out.println(sqlSelect.getWhere());
        }
    }
}
