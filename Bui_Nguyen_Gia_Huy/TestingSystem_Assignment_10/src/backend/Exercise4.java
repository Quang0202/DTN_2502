// backend/Exercise4.java
package backend;

import java.sql.*;

public class Exercise4 {
    private Connection connection;

    public Exercise4() throws Exception{
        connection = JdbcUtils.getInstance().connect();
    }

    // Question 1: Delete employees and department using transaction
    public void deleteEmployeesAndDepartment() {
        try {
            // Set auto-commit to false for transaction
            connection.setAutoCommit(false);

            try {
                // B1: Delete all employees from department 3
                String deleteEmployeesSql = "DELETE FROM Account WHERE DepartmentID = 3";
                Statement deleteEmployeesStmt = connection.createStatement();
                deleteEmployeesStmt.executeUpdate(deleteEmployeesSql);
                System.out.println("Deleted all employees from department 3");

                // B2: Delete department 3
                String deleteDeptSql = "DELETE FROM Department WHERE DepartmentID = 3";
                Statement deleteDeptStmt = connection.createStatement();
                deleteDeptStmt.executeUpdate(deleteDeptSql);
                System.out.println("Deleted department 3");

                // Commit the transaction
                connection.commit();
                System.out.println("Transaction completed successfully!");
            } catch (SQLException e) {
                // Rollback in case of error
                connection.rollback();
                System.out.println("Transaction rolled back due to error: " + e.getMessage());
            } finally {
                // Reset auto-commit to true
                connection.setAutoCommit(true);
            }
        } catch (SQLException e) {
            System.out.println("Error in transaction: " + e.getMessage());
        }
    }
}