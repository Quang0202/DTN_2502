package com.programming.nhatanh.lesson10.backend.repository;

import com.programming.nhatanh.entity.Department;
import com.programming.nhatanh.lesson10.backend.Utils.JdbcUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DepartmentRepository {
    private final Connection connection;

    public DepartmentRepository() {
        connection = JdbcUtils.getConnection();
    }

    //E2Q1
    public List<Department> getListDepartment() {
        ArrayList<Department> resultList = new ArrayList<>();
        String sql = "SELECT * FROM Department";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Department newDepartment = new Department(resultSet.getInt(1), resultSet.getString(2));
                resultList.add(newDepartment);
            }
            return resultList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    //E2Q2
    public Department getDepartmentById(int departmentId) {
        Department result = new Department();
        String sql = "SELECT * FROM Department WHERE departmentId = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, departmentId);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                result.setDepartmentId(resultSet.getInt(1));
                result.setDepartmentName(resultSet.getString(2));
            }
            return result;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    //E2Q4
    public Boolean existByDepartmentName(String departmentName) {
        String sql = "SELECT * FROM Department WHERE DepartmentName = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, departmentName);
            ResultSet resultSet = preparedStatement.executeQuery();
            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return false;
    }

    public Boolean existByDepartmentId(Integer departmentId) {
        String sql = "SELECT * FROM Department WHERE departmentId = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, departmentId);
            ResultSet resultSet = preparedStatement.executeQuery();
            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return false;
    }

    //E2Q5
    public void createDepartment(String departmentName) {
        if (existByDepartmentName(departmentName)) {
            throw new RuntimeException("Department Name is Exists!");
        }
        String sql = "INSERT INTO Department(DepartmentName) VALUES (?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, departmentName);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //E2Q6
    public void updateDepartment(int departmentId, String departmentName) {
        if (existByDepartmentName(departmentName)) {
            throw new RuntimeException("Department Name is Exists!");
        }
        if (!existByDepartmentId(departmentId)) {
            throw new RuntimeException("Cannot find department which has id = " + departmentId
            );
        }
        String sql = "UPDATE Department SET DepartmentName = ? WHERE DepartmentId = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, departmentName);
            preparedStatement.setInt(2, departmentId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    //E2Q7
    public void deleteDepartment(int departmentId) {
        if (!existByDepartmentId(departmentId)) {
            throw new RuntimeException("Cannot find department which has id = " + departmentId
            );
        }
        String sql = "DELETE FROM department WHERE departmentId = ?; ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, departmentId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    //E2Q8

    public String getDepartmentName(Integer departmentId) {
        String sql = "SELECT * FROM Department WHERE DepartmentId = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, departmentId);
            ResultSet resultSet = preparedStatement.executeQuery();
            return resultSet.getString(2);
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return null;
    }

    public Integer getDepartmentId(String deparmentName) {
        String sql = "SELECT * FROM Department WHERE departmentName = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, deparmentName);
            ResultSet resultSet = preparedStatement.executeQuery();
            return resultSet.getInt(1);
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return null;
    }

    //E3Q1
    public void procedureDelete() {
        String sql = "CREATE PROCEDURE sp_delete_department(IN id INT) " +
                "BEGIN " +
                "DELETE FROM department WHERE departmentId = id; " +
                "END";

        try (Statement statement = connection.createStatement()) {
            statement.execute(sql);
            System.out.println("Procedure created successfully.");
        } catch (SQLException e) {
            throw new RuntimeException("Failed to create procedure", e);
        }
    }

    //E3Q1
    public void executeProcedure(int departmentId) {
        String sql = "CALL sp_delete_department(?);";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, departmentId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void procedureGet() {
        String sql = "CREATE PROCEDURE sp_get_department(IN id INT) " +
                "BEGIN " +
                "DELETE FROM department WHERE departmentId = id; " +
                "END";

        try (Statement statement = connection.createStatement()) {
            statement.execute(sql);
            System.out.println("Procedure created successfully.");
        } catch (SQLException e) {
            throw new RuntimeException("Failed to create procedure", e);
        }
    }
}
