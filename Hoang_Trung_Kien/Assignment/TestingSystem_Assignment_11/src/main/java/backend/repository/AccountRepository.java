package backend.repository;

import entity.Account;
import entity.Department;
import entity.Position;
import utils.JdbcUtils;

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
                account.setPosition(new Position(resultSet.getInt("positionID"), resultSet.getString("positionName")));
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
            account.setDepartment(departmentRepository.getDepartmentById(resultSet.getInt("departmentID")));
            account.setPosition(new Position(resultSet.getInt("positionId"), resultSet.getString("positionName")));
            account.setCreateDate(resultSet.getTimestamp("createDate").toLocalDateTime());
            return account;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public void createAccount(Account account) {
        String sql = "INSERT INTO `Account`(Email, Username, FullName, DepartmentID, PositionID, CreateDate, Gender)\n" +
                "VALUES (?, ?, ?, ?, ?, ?, ?);";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, account.getEmail());
            preparedStatement.setString(2, account.getUsername());
            preparedStatement.setString(3, account.getFullName());
            preparedStatement.setInt(4, account.getDepartment().getId());
            preparedStatement.setInt(5, account.getPosition().getId());
            preparedStatement.setTimestamp(6, Timestamp.valueOf(account.getCreateDate()));
            preparedStatement.setString(7, account.getGender());

            preparedStatement.executeUpdate();
            System.out.println("Insert success");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean isAccountExists(String username) {
        String sql = "SELECT * FROM `Account`\n" +
                "WHERE username = ?\n" +
                "LIMIT 1;";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean isAccountExists(int id) {
        Account account = getAccountById(id);
        return account != null;
//        String sql = "SELECT * FROM `Account`\n" +
//                "WHERE accountId = ?\n" +
//                "LIMIT 1;";
//        try {
//            PreparedStatement preparedStatement = connection.prepareStatement(sql);
//            preparedStatement.setInt(1, id);
//            ResultSet resultSet = preparedStatement.executeQuery();
//            if (resultSet.next()) {
//                return true;
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return false;
    }

    public void updateAccountById(int id, String username) {
        String sql = "UPDATE `Account`\n" +
                "SET username = ?\n" +
                "WHERE accountId = ?;";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();
            System.out.println("Update success!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteAccount(int id) {
        String sql = "DELETE FROM `Account`\n" +
                "WHERE accountId = ?;";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            System.out.println("Delete success!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
