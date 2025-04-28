package backend.repository;

import backend.entity.Account;
import backend.entity.Department;
import utils.JdbcUtils;
import backend.entity.Position;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AccountRepository implements IAccountRepository{
    private Connection connection;

    public AccountRepository() {
        connection = JdbcUtils.getConnection();
    }

    public List<Account> getAllAccounts() {
        List<Account> accounts = new ArrayList<>();
        String sql = "SELECT * FROM `account`\n" +
                "INNER JOIN Department USING(departmentID)\n" +
                "INNER JOIN Position USING(positionID);";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Account account = new Account(resultSet.getInt("AccountID"), resultSet.getString("email"), resultSet.getString("username"), resultSet.getString("fullName"));
                account.setDepartment(new Department(resultSet.getInt("departmentID"), resultSet.getString("departmentName")));
                account.setDepartment(new Department(resultSet.getInt("positionID"), resultSet.getString("positionName")));
                if (resultSet.getTimestamp("createDate") != null) {
                    account.setCreateDate(resultSet.getTimestamp("createDate").toLocalDateTime());
                } else {
                    account.setCreateDate(null);
                }
                accounts.add(account);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return accounts;
    }

    public Account getAccountById(int id) {
        String sql = "SELECT * FROM `account`\n" +
                "WHERE accountID = ?;";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            Account account = new Account(resultSet.getInt("accountID"), resultSet.getString("email"), resultSet.getString("username"), resultSet.getString("fullName"));
            DepartmentRepository departmentRepository = new DepartmentRepository();
            PositionRepository positionRepository = new PositionRepository();
            account.setDepartment(departmentRepository.getDepartmentById(resultSet.getInt("departmentID")));
            account.setPosition(new Position(1, "name"));
            account.setCreateDate(resultSet.getTimestamp("createDate").toLocalDateTime());
            return account;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
