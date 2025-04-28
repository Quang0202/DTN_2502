package backend;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entity.Department;

public class DepartmentDAO {
    private Connection connection;

    public DepartmentDAO() throws Exception {
        connection = JdbcUtils.getInstance().connect();
    }

    // Question 1: get all departments
    public List<Department> getDepartments() throws Exception {
        List<Department> departments = new ArrayList<>();
        String sql = "SELECT * FROM Department";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            int id = resultSet.getInt("DepartmentID");
            String name = resultSet.getString("DepartmentName");
            departments.add(new Department(id, name));
        }
        return departments;
    }

    // Question 2 + 3: get department by id
    public Department getDepartmentById(int id) throws Exception {
        String sql = "SELECT * FROM Department WHERE DepartmentID = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            String name = resultSet.getString("DepartmentName");
            return new Department(id, name);
        } else {
            throw new Exception("Cannot find department which has id = " + id);
        }
    }

    // Question 4: check department name exists
    public boolean isDepartmentNameExists(String name) throws Exception {
        String sql = "SELECT * FROM Department WHERE DepartmentName = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, name);
        ResultSet resultSet = preparedStatement.executeQuery();

        return resultSet.next();
    }

    // Question 5: create department
    public void createDepartment(String name) throws Exception {
        if (isDepartmentNameExists(name)) {
            throw new Exception("Department Name is Exists!");
        }
        String sql = "INSERT INTO Department(DepartmentName) VALUES (?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, name);
        preparedStatement.executeUpdate();
    }

    // Question 6: update department
    public void updateDepartmentName(int id, String newName) throws Exception {
        if (!isDepartmentIdExists(id)) {
            throw new Exception("Cannot find department which has id = " + id);
        }
        if (isDepartmentNameExists(newName)) {
            throw new Exception("Department Name is Exists!");
        }
        String sql = "UPDATE Department SET DepartmentName = ? WHERE DepartmentID = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, newName);
        preparedStatement.setInt(2, id);
        preparedStatement.executeUpdate();
    }

    // Question 7: delete department
    public void deleteDepartment(int id) throws Exception {
        if (!isDepartmentIdExists(id)) {
            throw new Exception("Cannot find department which has id = " + id);
        }
        String sql = "DELETE FROM Department WHERE DepartmentID = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();
    }

    // Support: check id exists
    public boolean isDepartmentIdExists(int id) throws Exception {
        String sql = "SELECT * FROM Department WHERE DepartmentID = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        return resultSet.next();
    }
}
