package org.example.backend.repository;


import org.example.entity.Account;
import org.example.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AccountRepository {

    public List<Account> getListAccounts() throws Exception {
        List<Account> accounts = new ArrayList<>();
        Connection connection = JdbcUtils.getConnection();
        Statement statement = connection.createStatement();
        String sql = "SELECT * FROM account";
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            Account account = new Account(
                    resultSet.getInt("AccountID"),
                    resultSet.getString("Email"),
                    resultSet.getString("Username"),
                    resultSet.getString("FullName")
            );
            accounts.add(account);
        }
        return accounts;
    }
}