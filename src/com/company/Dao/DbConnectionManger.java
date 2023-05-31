package com.company.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnectionManger {
    private static final String url = "jdbc:mysql://localhost:3306/store_java";
    private static final String name = "root";
    private static final String password = "";

    public static Connection connect() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, name, password);
        return connection;

    }
}
