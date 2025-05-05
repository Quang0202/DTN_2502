package backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.InputStream;

public class JdbcUtils {
    private static JdbcUtils instance;
    private Connection connection;
    private String url;
    private String username;
    private String password;
    private String driver;

    private JdbcUtils() throws Exception {
        Properties properties = new Properties();
        InputStream inputStream = JdbcUtils.class.getClassLoader().getResourceAsStream("resource/database.properties");
        properties.load(inputStream);

        url = properties.getProperty("url");
        username = properties.getProperty("username");
        password = properties.getProperty("password");
        driver = properties.getProperty("driver");

        Class.forName(driver);
    }

    public static JdbcUtils getInstance() throws Exception {
        if (instance == null) {
            instance = new JdbcUtils();
        }
        return instance;
    }

    public Connection connect() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connection = DriverManager.getConnection(url, username, password);
        }
        return connection;
    }

    public void disconnect() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }
}
