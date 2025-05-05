package repository;

import utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AccountRepository implements IAccountRepository{
    private Connection connection;
    public AccountRepository(){
        connection = JdbcUtils.getConnection();
    }

    public void deleteAccountByDepartmentID(int id)  {
        try {
            String sql = "DELETE FROM `account`" +
                    "WHERE departmentID = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            System.out.println("Delete entity.Account SUCCESS!");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
