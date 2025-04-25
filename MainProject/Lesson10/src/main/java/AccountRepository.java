import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AccountRepository {
    private Connection connection;
    public AccountRepository(){
        connection = JdbcUtils.getConnection();
    }

    public void deleteAccountByDepartmentID(int id) throws SQLException {
        String sql = "DELETE FROM `account`" +
                "WHERE departmentID = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1,id);
        preparedStatement.executeUpdate();
        System.out.println("Delete Account SUCCESS!");
    }
}
