package Exercise1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) throws SQLException {
        Connection connection = JdbcUtils.getConnection();

        if (connection != null) {
            String res = "SELECT * FROM Department;";

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(res);

            ArrayList<Department> departments = new ArrayList<>();
            while (resultSet.next()) {
                Department department = new Department(resultSet.getInt(1), resultSet.getString(2));
                departments.add(department);
            }

            for (Department department : departments) {
                System.out.println(department);
            }
        }
    }
}
