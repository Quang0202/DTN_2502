package utils;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUtils {
    private static Connection connection;
    public static Connection getConnection(){
        try {
            if (connection == null || connection.isClosed()){
                Properties properties = new Properties();
                properties.load(new FileInputStream("src/main/resources/jdbc.properties"));
                String url = properties.getProperty("url");
                String user = properties.getProperty("user");
                String password = properties.getProperty("password");

                Class.forName("com.mysql.cj.jdbc.Driver");

                connection = DriverManager.getConnection(url, user, password);
                System.out.println("Connect success!");
                return connection;
            }
            return connection;
        } catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
    public static void disconnect(){
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
