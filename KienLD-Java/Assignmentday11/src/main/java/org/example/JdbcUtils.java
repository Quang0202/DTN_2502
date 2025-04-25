package org.example;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class JdbcUtils {
    public static Connection isConnectedForTesting() {


            Connection conn = null;
            try {

                Properties properties = new Properties();
                properties.load(new FileInputStream("D:\\laiduckien\\Assignmentday11\\src\\main\\java\\org\\example\\resource\\jdbc.properies"));
                String DB_URL = properties.getProperty("DB_URL");
                String USER_NAME = properties.getProperty("USER_NAME");
                String PASSWORD = properties.getProperty("PASSWORD");


                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
                System.out.println("connect successfully!");
            } catch (Exception ex) {
                System.out.println("connect failure!");
                ex.printStackTrace();
            }
            return conn;
        }

}
