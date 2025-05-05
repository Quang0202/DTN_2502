package repository;

import utils.JdbcUtils;

import java.sql.*;

public class DepartmentRepository implements IDepartmentRepository {
    private Connection connection;
    public DepartmentRepository(){
        connection = JdbcUtils.getConnection();
    }

    public void createProcedure(){
        String sql = "CREATE PROCEDURE sp_delete_department(in id INT)\n" +
                "BEGIN\n" +
                        "DELETE FROM department\n" +
                "        WHERE departmentID = id;\n" +
                "END;";
        try {
            Statement statement = connection.createStatement();
            statement.execute(sql);
            System.out.println("Create success!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void deleteDepartmentUsingProcedure(int id){
        String sql ="Call sp_delete_department(?);";
        try {
            CallableStatement callableStatement = connection.prepareCall(sql);
            callableStatement.setInt(1,id);
            callableStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public String getDepartmentNameUsingProcedure(int id){
        String sql ="Call sp_get_department_name(?,?);";
        try {
            CallableStatement callableStatement = connection.prepareCall(sql);
            callableStatement.setInt(1,id);
            callableStatement.registerOutParameter(2, Types.VARCHAR);

            callableStatement.execute();
            return callableStatement.getString(2);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void deleteDepartmentByID(int id) throws SQLException {
        String sql = "DELETE FROM department \n" +
                "WHERE departmentID = ? ;";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();
        System.out.println("DELETE DEPARTMENT SUCCESS!");

    }
}
