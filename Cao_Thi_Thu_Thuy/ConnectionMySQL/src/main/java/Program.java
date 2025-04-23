import entity.Department;

import java.io.FileInputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Program {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection connection = JdbcUtils.getConnection();
        if(connection != null) {
            String sql = "SELECT * FROM Department\n" +
                    "Where departmentID >4;\n";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            List<Department> departments = new ArrayList<>();
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
