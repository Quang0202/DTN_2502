package backend;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import entity.Account;
import entity.Department;
import entity.Position;

public class AccountDAO {
    private Connection connection;

    public AccountDAO() throws Exception {
        connection = JdbcUtils.getInstance().connect();
    }

    // Get all accounts
    public List<Account> getAccounts() throws Exception {
        List<Account> accounts = new ArrayList<>();
        String sql = "SELECT a.*, d.DepartmentName, p.PositionName " +
                "FROM Account a " +
                "JOIN Department d ON a.DepartmentID = d.DepartmentID " +
                "JOIN `Position` p ON a.PositionID = p.PositionID";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            Account account = mapResultSetToAccount(resultSet);
            accounts.add(account);
        }
        return accounts;
    }

    // Get account by ID
    public Account getAccountById(int id) throws Exception {
        String sql = "SELECT a.*, d.DepartmentName, p.PositionName " +
                "FROM Account a " +
                "JOIN Department d ON a.DepartmentID = d.DepartmentID " +
                "JOIN `Position` p ON a.PositionID = p.PositionID " +
                "WHERE a.AccountID = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            return mapResultSetToAccount(resultSet);
        } else {
            throw new Exception("Cannot find account which has id = " + id);
        }
    }

    // Check username exists
    public boolean isUsernameExists(String username) throws Exception {
        String sql = "SELECT * FROM Account WHERE Username = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, username);
        ResultSet resultSet = preparedStatement.executeQuery();

        return resultSet.next();
    }

    // Create new account
    public void createAccount(String email, String username, String fullName, int departmentID, int positionID) throws Exception {
        if (isUsernameExists(username)) {
            throw new Exception("Username is already exists!");
        }
        String sql = "INSERT INTO Account (Email, Username, FullName, DepartmentID, PositionID) " +
                "VALUES (?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, email);
        preparedStatement.setString(2, username);
        preparedStatement.setString(3, fullName);
        preparedStatement.setInt(4, departmentID);
        preparedStatement.setInt(5, positionID);
        preparedStatement.executeUpdate();
    }

    // Update account username
    public void updateAccountUsername(int id, String newUsername) throws Exception {
        if (!isAccountIdExists(id)) {
            throw new Exception("Cannot find account which has id = " + id);
        }
        if (isUsernameExists(newUsername)) {
            throw new Exception("Username is already exists!");
        }
        String sql = "UPDATE Account SET Username = ? WHERE AccountID = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, newUsername);
        preparedStatement.setInt(2, id);
        preparedStatement.executeUpdate();
    }

    // Delete account
    public void deleteAccount(int id) throws Exception {
        if (!isAccountIdExists(id)) {
            throw new Exception("Cannot find account which has id = " + id);
        }
        String sql = "DELETE FROM Account WHERE AccountID = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();
    }

    // Check account id exists
    public boolean isAccountIdExists(int id) throws Exception {
        String sql = "SELECT * FROM Account WHERE AccountID = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        return resultSet.next();
    }

    // Mapping ResultSet => Account
    private Account mapResultSetToAccount(ResultSet resultSet) throws Exception {
        int id = resultSet.getInt("AccountID");
        String email = resultSet.getString("Email");
        String username = resultSet.getString("Username");
        String fullName = resultSet.getString("FullName");
        int departmentID = resultSet.getInt("DepartmentID");
        String departmentName = resultSet.getString("DepartmentName");
        int positionID = resultSet.getInt("PositionID");
        String positionName = resultSet.getString("PositionName");
        LocalDateTime createDate = null;
        if (resultSet.getTimestamp("CreateDate") != null) {
            createDate = resultSet.getTimestamp("CreateDate").toLocalDateTime();
        }

        Department department = new Department(departmentID, departmentName);
        Position position = new Position(positionID, positionName);
        return new Account(id, email, username, fullName, department, position, createDate);
    }
}
