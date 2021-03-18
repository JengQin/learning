package com.jeng.jdk.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * The Test
 *
 * @author JiaZheng
 * @create 2021-02-21 19:45
 */
public class Test {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3305/hive");
        PreparedStatement preparedStatement = connection.prepareStatement("select * from test");
        preparedStatement.execute();
    }
}
