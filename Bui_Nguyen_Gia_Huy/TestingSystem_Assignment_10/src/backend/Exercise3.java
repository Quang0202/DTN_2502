// backend/Exercise3.java
package backend;

import java.sql.*;

public class Exercise3 {
    private Connection connection;

    public Exercise3() throws Exception{
        connection = JdbcUtils.getInstance().connect();
    }

    // Create stored procedure in MySQL
    // This is the SQL statement that should be executed in MySQL directly:
    /*
    DELIMITER $$
    CREATE PROCEDURE sp_delete_department(IN in_department_id INT)
    BEGIN
        DELETE FROM Department WHERE DepartmentID = in_department_id;
    END$$
    DELIMITER ;
    */

    // Question 1: Delete department using stored procedure
    public void deleteDepartmentUsingProcedure(int id) throws Exception {
        try {
            // Check if department exists
            String checkSql = "SELECT 1 FROM Department WHERE DepartmentID = ?";
            PreparedStatement checkStmt = connection.prepareStatement(checkSql);
            checkStmt.setInt(1, id);
            ResultSet resultSet = checkStmt.executeQuery();

            if (!resultSet.next()) {
                throw new Exception("Cannot find department which has id = " + id);
            }

            // Call stored procedure
            CallableStatement callableStatement = connection.prepareCall("{CALL sp_delete_department(?)}");
            callableStatement.setInt(1, id);

            callableStatement.executeUpdate();
            System.out.println("Department deleted successfully using stored procedure!");

            callableStatement.close();
        } catch (SQLException e) {
            throw new Exception("Error deleting department: " + e.getMessage());
        }
    }
}