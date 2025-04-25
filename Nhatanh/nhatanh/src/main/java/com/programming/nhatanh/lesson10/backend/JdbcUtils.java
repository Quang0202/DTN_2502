package com.programming.nhatanh.lesson10.backend;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUtils {

    private static Connection connection;

    public static Connection getConnection() throws ClassNotFoundException, SQLException, IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/main/java/com/programming/nhatanh/lesson10/resource/database.properties"));
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        Class.forName("com.mysql.cj.jdbc.Driver");

        connection = DriverManager.getConnection(url, username, password);

        System.out.println("Connected");
        return connection;
    }

    public Connection connect() throws IOException, ClassNotFoundException, SQLException {

        if(connection.isClosed() || !connection.isValid(0)){
            return getConnection();
        } else {
            return connection;
        }
    }

    public void disconnect() throws SQLException {
        if(!connection.isClosed() || connection.isValid(0))
            connection.close();
    }

}
