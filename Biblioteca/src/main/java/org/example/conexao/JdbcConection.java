package org.example.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConection {

    private static final String url = "jdbc:mysql://localhost:3306/poo";
    private static final String user = "root";
    private static final String password = "";

    public static Connection getConnection() {

        try{
            return DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}