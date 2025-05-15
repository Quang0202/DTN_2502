package backend;

import untils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Exercise4 {
    public void deleteDepartmentAndEmployees() throws Exception {
        Connection connection = null;
        try {
            connection = JdbcUtils.getConnection();
            connection.setAutoCommit(false); // bật transaction thủ công

            // Step 1: Xóa tất cả nhân viên thuộc phòng ban 3
            String sqlDeleteEmployees = "DELETE FROM Account WHERE DepartmentID = 3";
            PreparedStatement statement1 = connection.prepareStatement(sqlDeleteEmployees);
            int affectedRows1 = statement1.executeUpdate();
            System.out.println("Deleted " + affectedRows1 + " employees.");

            // Step 2: Xóa phòng ban 3
            String sqlDeleteDepartment = "DELETE FROM Department WHERE DepartmentID = 3";
            PreparedStatement statement2 = connection.prepareStatement(sqlDeleteDepartment);
            int affectedRows2 = statement2.executeUpdate();
            System.out.println("Deleted " + affectedRows2 + " department.");

            connection.commit(); // commit transaction
        } catch (SQLException e) {
            if (connection != null) {
                connection.rollback(); // rollback nếu có lỗi
            }
            throw e; // ném lỗi ra ngoài
        } finally {
            if (connection != null) {
                connection.setAutoCommit(true); // reset lại auto-commit về true
                JdbcUtils.disconnect();
            }
        }
    }
}
