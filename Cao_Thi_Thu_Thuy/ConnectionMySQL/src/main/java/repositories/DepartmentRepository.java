package repositories;

import entity.Department;
import utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DepartmentRepository {
    private Connection connection;

    public DepartmentRepository(){
        connection = JdbcUtils.getConnection();
    }

    public Department getDepartmentByID(int id){
        String sql = "Select * from Department where DepartmentID = ?;";
        if (connection != null){
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql);){
                preparedStatement.setInt(1, id);
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()){
                    Department department = new Department();
                    department.setDepartmentId(resultSet.getInt("DepartmentID"));
                    department.setDepartmentName(resultSet.getString("DepartmentName"));
                    return department;
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }
    public void deleteDepartment() {
        String deleteAccountSql = "DELETE FROM Account WHERE DepartmentID = ?";
        String deleteDepartmentSql = "DELETE FROM Department WHERE DepartmentID = ?";

        try {
            connection.setAutoCommit(false);

            try (PreparedStatement deleteAccountStmt = connection.prepareStatement(deleteAccountSql)) {
                deleteAccountStmt.setInt(1, 3);
                deleteAccountStmt.executeUpdate();
            }

            try (PreparedStatement deleteDepartmentStmt = connection.prepareStatement(deleteDepartmentSql)) {
                deleteDepartmentStmt.setInt(1, 3);
                deleteDepartmentStmt.executeUpdate();
            }

            connection.commit();
            System.out.println("Xóa thành công nhân viên và phòng ban 3.");

        } catch (SQLException e) {
            try {
                connection.rollback();
                System.out.println("Lỗi xảy ra. Đã rollback giao dịch.");
            } catch (SQLException rollbackEx) {
                System.err.println("Lỗi khi rollback: " + rollbackEx.getMessage());
            }
            e.printStackTrace();
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
