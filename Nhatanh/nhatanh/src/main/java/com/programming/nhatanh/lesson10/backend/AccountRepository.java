package com.programming.nhatanh.lesson10.backend;

import com.programming.nhatanh.entity.Department;
import com.programming.nhatanh.lesson10.entity.Account;
import com.programming.nhatanh.lesson10.entity.Gender;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccountRepository {
    private final Connection connection;
    DepartmentRepository repository = new DepartmentRepository();
    public AccountRepository() throws SQLException, ClassNotFoundException, IOException {
        connection = JdbcUtils.getConnection();
    }

    public List<Account> getListAccount() {
        ArrayList<Account> resultList = new ArrayList<>();
        String sql = "SELECT * FROM Account";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Account newAccount = new Account();
                newAccount.setAccountId(resultSet.getInt(1));
                newAccount.setEmail(resultSet.getString(2));
                newAccount.setUserName(resultSet.getString(3));
                newAccount.setFullName(resultSet.getString(4));
                var nameDepartment = repository.getDepartmentName(resultSet.getInt(5));
                newAccount.setDepartmentName(nameDepartment);
                newAccount.setPositionId(resultSet.getInt(6));
                newAccount.setCreateDate(resultSet.getDate(7).toLocalDate());
                newAccount.setGender(Gender.valueOf(resultSet.getString(8)));
                resultList.add(newAccount);
            }
            return resultList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Account getAccountById(int accountId) {
        Department result = new Department();
        String sql = "SELECT * FROM Account WHERE accountId = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, accountId);
            ResultSet resultSet = preparedStatement.executeQuery();
            Account newAccount = new Account();
            while (resultSet.next()) {
                newAccount.setAccountId(resultSet.getInt(1));
                newAccount.setEmail(resultSet.getString(2));
                newAccount.setUserName(resultSet.getString(3));
                newAccount.setFullName(resultSet.getString(4));
                var nameDepartment = repository.getDepartmentName(resultSet.getInt(5));
                newAccount.setDepartmentName(nameDepartment);
                newAccount.setPositionId(resultSet.getInt(6));
                newAccount.setCreateDate(resultSet.getDate(7).toLocalDate());
                newAccount.setGender(Gender.valueOf(resultSet.getString(8)));
            }
            return newAccount;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Boolean existByEmail(String email) {
        String sql = "SELECT * FROM Account WHERE Email = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, email);
            ResultSet resultSet = preparedStatement.executeQuery();
            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return false;
    }

    public Boolean existByAccountId(Integer accoutnId) {
        String sql = "SELECT * FROM Account WHERE AccountId = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, accoutnId);
            ResultSet resultSet = preparedStatement.executeQuery();
            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return false;
    }

    public void createAccount(Account newAccount) {
        if (existByEmail(newAccount.getEmail())) {
            throw new RuntimeException("Account name already Exists!");
        }
        String sql = "INSERT INTO Account(Email, Username, Fullname, DepartmentId, PositionId, createDate, Gender) VALUES (?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, newAccount.getEmail());
            preparedStatement.setString(2, newAccount.getUserName());
            preparedStatement.setString(3, newAccount.getFullName());
            var idDepartment = repository.getDepartmentId(newAccount.getDepartmentName());
            preparedStatement.setInt(4, idDepartment); //TODO
            preparedStatement.setInt(5, newAccount.getPositionId());
            preparedStatement.setDate(6, newAccount.getCreateDate());
            preparedStatement.setString(7, newAccount.getGender().toString());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateAccount(int accountId, String username) {
        if (!existByAccountId(accountId)) {
            throw new RuntimeException("Cannot find department which has id = " + accountId
            );
        }
        String sql = "UPDATE Account SET username = ? WHERE AccountId = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setInt(2, accountId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void deleteAccount(int accountId) {
        if (!existByAccountId(accountId)) {
            throw new RuntimeException("Cannot find account which has id = " + accountId
            );
        }
        String sql = "DELETE FROM account WHERE accountId = ?; ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, accountId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteAccountByDepartment(Integer departmentId) throws SQLException {
        String sql = "DELETE FROM account WHERE departmentId = ?; ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, departmentId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Transaction failed");
        }
    }
}
