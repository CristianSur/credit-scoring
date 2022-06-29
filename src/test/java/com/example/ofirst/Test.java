package com.example.ofirst;

import java.sql.*;

public class Test {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:h2:file:C:\\My Program Files\\JavaProjects\\ofirst\\db\\mydb";

        Connection connection = DriverManager.getConnection(url);

        Statement statement = connection.createStatement();

//        statement.execute("drop table if exists test");
//        statement.execute("create table test(id int primary key, name varchar(255))");
//        statement.execute("insert into test values(3, 'Byer')");

        ResultSet resultSet;

        resultSet = statement.executeQuery("Select * from testdatabase");

        while (resultSet.next()) {
            System.out.println(resultSet.getInt("id") + " | " + resultSet.getString("name"));
        }

        statement.close();
        connection.close();

    }
}
