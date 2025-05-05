package entity;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class DepartmentRepository {
    private Connection connection;

    public DepartmentRepository() {
        connection = JdbcUtils.getConnection();
    }

    public List<Department> getDepartments() {
        String sql = "SELECT * FROM Department;";
        List<Department> departments = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                departments.add(new Department(resultSet.getInt(1), resultSet.getString(2)));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return departments;
    }

    public Department getDepartmentById(int id) {
        String sql = "SELECT * \n" +
                "FROM Department\n" +
                "WHERE departmentId = ?;";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.executeQuery();
            ResultSet resultSet = preparedStatement.getResultSet();
            resultSet.next();
            Department department = new Department(resultSet.getInt(1), resultSet.getString("departmentName"));
            return department;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public Department getDepartmentById() {
        Scanner scanner = new Scanner(System.in);
        int id;
        System.out.println("Nhap id cua Department can tim:");
        id = scanner.nextInt();
        String sql = "SELECT * \n" +
                "FROM Department\n" +
                "WHERE departmentId = ?;";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.executeQuery();
            ResultSet resultSet = preparedStatement.getResultSet();
            resultSet.next();
            Department department = new Department(resultSet.getInt(1), resultSet.getString("departmentName"));
            return department;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public boolean isDepartmentNameExist(String name) {
        String sql = "SELECT 1\n" +
                "FROM Department\n" +
                "WHERE DepartmentName = ?;";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.executeQuery();
            if (preparedStatement.getResultSet().next()) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public void createDepartment(String name) {
        String sql = "INSERT INTO Department(departmentName) \n" +
                "VALUES (?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, name);
            if (!isDepartmentNameExist(name)) {
                preparedStatement.execute();
                System.out.println("create department success");
            } else {
                throw new Exception("Department Name is Exists!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void updateDepartment(int id, String newName) {
        String sql = "UPDATE Department \n" +
                "SET departmentName = ?\n" +
                "WHERE departmentId = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, newName);
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();
            System.out.println("Update success");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteDepartment(int id) {
        String sql = "DELETE FROM department\n" +
                "WHERE departmentId = ?;";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            System.out.println("Delete success");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
