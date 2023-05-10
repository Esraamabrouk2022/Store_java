package com.company.rebo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnectionManger {
    private final String url = "jdbc:mysql://localhost:3306/store_java";
    private final String name = "root";
    private final String password = "";

    public Connection connect() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, name, password);
        return connection;

    }
}
