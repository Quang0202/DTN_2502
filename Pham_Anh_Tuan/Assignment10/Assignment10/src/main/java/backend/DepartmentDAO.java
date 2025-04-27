package backend;

import entity.Department;
import untils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDAO {
    private Connection connection;

    public void DepartmentDao() throws SQLException {
        connection = JdbcUtils.getConnection();
    }

    // Question 1: Get all departments
    public List<Department> getDepartments() throws Exception {
        List<Department> departments = new ArrayList<>();
        String sql = "SELECT * FROM Department";
        try (PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Department department = new Department(
                        resultSet.getInt("DepartmentID"),
                        resultSet.getString("DepartmentName")
                );
                departments.add(department);
            }
        } catch (Exception e) {
            throw new Exception("Error when getting departments: " + e.getMessage());
        }
        return departments;
    }

    // Question 2 + 3: Get department by ID
    public Department getDepartmentById(int id) throws Exception {
        String sql = "SELECT * FROM Department WHERE DepartmentID = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return new Department(
                        resultSet.getInt("DepartmentID"),
                        resultSet.getString("DepartmentName")
                );
            } else {
                throw new Exception("Cannot find department which has id = " + id);
            }
        } catch (Exception e) {
            throw new Exception("Error when getting department by id: " + e.getMessage());
        }
    }

    // Question 4: Check department name exists
    public boolean isDepartmentNameExists(String name) throws Exception {
        String sql = "SELECT * FROM Department WHERE DepartmentName = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, name);
            ResultSet resultSet = statement.executeQuery();
            return resultSet.next();
        } catch (Exception e) {
            throw new Exception("Error when checking department name: " + e.getMessage());
        }
    }

    // Question 5: Create department
    public void createDepartment(String name) throws Exception {
        if (isDepartmentNameExists(name)) {
            throw new Exception("Department Name is Exists!");
        }
        String sql = "INSERT INTO Department (DepartmentName) VALUES (?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, name);
            statement.executeUpdate();
        } catch (Exception e) {
            throw new Exception("Error when creating department: " + e.getMessage());
        }
    }

    // Question 6: Update department name
    public void updateDepartmentName(int id, String newName) throws Exception {
        if (!isDepartmentIdExists(id)) {
            throw new Exception("Cannot find department which has id = " + id);
        }
        if (isDepartmentNameExists(newName)) {
            throw new Exception("Department Name is Exists!");
        }
        String sql = "UPDATE Department SET DepartmentName = ? WHERE DepartmentID = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, newName);
            statement.setInt(2, id);
            statement.executeUpdate();
        } catch (Exception e) {
            throw new Exception("Error when updating department name: " + e.getMessage());
        }
    }

    // Method hỗ trợ Question 6: Check department ID exists
    public boolean isDepartmentIdExists(int id) throws Exception {
        String sql = "SELECT * FROM Department WHERE DepartmentID = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            return resultSet.next();
        } catch (Exception e) {
            throw new Exception("Error when checking department ID: " + e.getMessage());
        }
    }

    // Question 7: Delete department
    public void deleteDepartment(int id) throws Exception {
        if (!isDepartmentIdExists(id)) {
            throw new Exception("Cannot find department which has id = " + id);
        }
        String sql = "DELETE FROM Department WHERE DepartmentID = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (Exception e) {
            throw new Exception("Error when deleting department: " + e.getMessage());
        }
    }
}
