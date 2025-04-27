package org.example.utils;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class JdbcUtils {
    private static Connection connection;
    private static final String PROPERTIES_FILE = "src/main/resources/jdbc.properties";

    /**
     * Method dùng để kiểm tra connect thành công chưa
     */
    public static void isConnectedForTesting() throws Exception {
        try {
            getConnection();
            System.out.println("Connect success!");
        } catch (Exception e) {
            throw new Exception("Failed to connect to database! Error: " + e.getMessage());
        }
    }

    /**
     * Method để lấy connection tới database
     */
    public static Connection getConnection() throws Exception {
        if (connection == null || connection.isClosed()) {
            try {
                Properties properties = new Properties();
                properties.load(new FileInputStream(PROPERTIES_FILE));

                String url = properties.getProperty("url");
                String username = properties.getProperty("username");
                String password = properties.getProperty("password");
                String driver = properties.getProperty("driver");

                Class.forName(driver);
                connection = DriverManager.getConnection(url, username, password);
            } catch (Exception e) {
                throw new Exception("Error while connecting to database: " + e.getMessage());
            }
        }
        return connection;
    }

    /**
     * Method để disconnect tới database
     */
    public static void disconnect() throws Exception {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (Exception e) {
            throw new Exception("Error while disconnecting from database: " + e.getMessage());
        }
    }
}
