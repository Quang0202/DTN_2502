package Exercise1;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class JdbcUtils {
    private static Connection connection;
    public static Connection getConnection() {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("D:\\DTN_2502\\Hoang_Trung_Kien\\Lesson10\\src\\main\\resources\\jdbc.properties"));
            String url = properties.getProperty("url");
            String userName = properties.getProperty("userName");
            String password = properties.getProperty("password");

            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(url, userName, password);

            System.out.println("Connect success!");

            return connection;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}