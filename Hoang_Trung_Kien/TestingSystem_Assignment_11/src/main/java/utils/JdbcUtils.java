package utils;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUtils {
    private static Connection connection;

    public static Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                Properties properties = new Properties();
                properties.load(new FileInputStream("D:\\DTN_2502\\Hoang_Trung_Kien\\TestingSystem_Assignment_11\\src\\main\\resources\\jdbc.properties"));
                String url = properties.getProperty("url");
                String userName = properties.getProperty("userName");
                String password = properties.getProperty("password");

                Class.forName("com.mysql.cj.jdbc.Driver");

                connection = DriverManager.getConnection(url, userName, password);

                System.out.println("Connect success!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }

    public static void disConnect() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}