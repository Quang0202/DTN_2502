import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class JdbcUtils {
    public static Connection getConnection() {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("src/main/resources/jdbc.properties"));
            String url = properties.getProperty("url");
            String userName = properties.getProperty("userName");
            String password = properties.getProperty("password");

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, userName, password);
            System.out.println("Connected to the database successfully!!!\n");
            return connection;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
