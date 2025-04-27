package untils;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUtils2 {
    private static Connection connection;
    private static String url;
    private static String username;
    private static String password;
    private static String driverName;

    static {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("src/main/resources/jdbc.properties"));
            url = properties.getProperty("url");
            username = properties.getProperty("username");
            password = properties.getProperty("password");
            driverName = properties.getProperty("driverName");

            Class.forName(driverName);
        } catch (Exception e) {
            throw new RuntimeException("Cannot load database config", e);
        }
    }

    public static void isConnectedForTesting() throws Exception {
        try {
            connect();
            System.out.println("Connect success!");
        } catch (Exception e) {
            throw new Exception("Connect failed: " + e.getMessage());
        }
    }

    public static Connection connect() throws Exception {
        if (connection == null || connection.isClosed()) {
            try {
                connection = DriverManager.getConnection(url, username, password);
            } catch (SQLException e) {
                throw new Exception("Connect failed: " + e.getMessage());
            }
        }
        return connection;
    }

    public static Connection getConnection() throws Exception {
        return connect();
    }

    public static void disconnect() throws Exception {
        if (connection != null && !connection.isClosed()) {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new Exception("Disconnect failed: " + e.getMessage());
            }
        }
    }
}
