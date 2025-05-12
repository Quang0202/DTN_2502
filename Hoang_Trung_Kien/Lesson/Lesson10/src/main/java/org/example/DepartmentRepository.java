package org.example;

import java.sql.*;

public class DepartmentRepository {
    private Connection connection;

    public DepartmentRepository() {
        connection = JdbcUtils.getConnection();
    }

    public void createProcedure() {
        String sql = "CREATE PROCEDURE sp_delete_department(in id int)\n" +
                "\tBEGIN\n" +
                "\t\tDELETE FROM department\n" +
                "        WHERE departmentID = id;\n" +
                "    END ;";
        try {
            Statement statement = connection.createStatement();
            statement.execute(sql);
            System.out.println("create success!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteDepartmentUsingProcedure(int id) {
        String sql = "CALL sp_delete_department(?)";
        try {
            CallableStatement callableStatement = connection.prepareCall(sql);
            callableStatement.setInt(1, id);
            callableStatement.execute();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public String getDepartmentNameUsingProcedure(int id) {
        String sql = "CALL sp_delete_department(?,?)";
        try {
            CallableStatement callableStatement = connection.prepareCall(sql);
            callableStatement.setInt(1, id);
            callableStatement.registerOutParameter(2, Types.VARCHAR);
            callableStatement.execute();
            return callableStatement.getString(2);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
