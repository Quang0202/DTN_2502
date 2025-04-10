package utils;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtil {
    public static Connection getConnection()
            throws SQLException, ClassNotFoundException, FileNotFoundException, IOException {
        Properties properties = new Properties();
        properties.load(Files.newInputStream(Paths.get("src/main/resources/database.properties")));

        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        // register the driver class with DriverManager
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Step 2: get a Database Connection
        return DriverManager.getConnection(url, username, password);
    }
}
