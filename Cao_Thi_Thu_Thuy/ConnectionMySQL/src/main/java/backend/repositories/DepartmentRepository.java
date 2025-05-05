package backend.repositories;

import entity.Department;
import utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DepartmentRepository implements IDepartmentRepository{
    private Connection connection;
    public DepartmentRepository(){
        connection = JdbcUtils.getConnection();
    }
    public Department getDepartmentByID(int id){
        String sql = "Select * from Department where DepartmentID = ?;";
        Department department = new Department();
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql);){
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                department.setDepartmentId(resultSet.getInt("DepartmentID"));
                department.setDepartmentName(resultSet.getString("DepartmentName"));
            }
        } catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return department;
    }
}
