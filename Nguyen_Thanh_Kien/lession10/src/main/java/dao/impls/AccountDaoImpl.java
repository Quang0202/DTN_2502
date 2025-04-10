package dao.impls;

import dao.Dao;
import model.Account;
import model.Department;
import model.Position;
import utils.ConnectionUtil;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AccountDaoImpl implements Dao<Account> {

    private static Connection connect;
    private static PreparedStatement pst;
    private static ResultSet rs;

    @Override
    public List<Account> getAll() {
        getConnection();
        List<Account> accounts = new ArrayList<>();
        try {
            pst = connect.prepareStatement("SELECT * FROM Account " +
                    "INNER JOIN Department ON Account.department_id = Department.department_id " +
                    "INNER JOIN Position ON Account.position_id = Position.position_id");
            rs = pst.executeQuery();
            while (rs.next()) {
                Account account = new Account();
                account.setAccountId(rs.getInt("account_id"));
                account.setEmail(rs.getString("email"));
                account.setFullName(rs.getString("full_name"));
                account.setUsername(rs.getString("user_name"));
                account.setCreateDate(LocalDate.parse(rs.getString("create_date")));

                Department department = new Department();
                department.setDepartmentId(rs.getInt("department_id"));
                department.setDepartmentName(rs.getString("department_name"));

                Position position = new Position();
                position.setPositionId(rs.getInt("position_id"));
                position.setPositionName(rs.getString("position_name"));

                account.setDepartment(department);
                account.setPosition(position);
                accounts.add(account);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        close();
        return accounts;
    }

    @Override
    public Optional<Account> findById(int id) {
        return Optional.empty();
    }

    @Override
    public List<Account> findByName(String name) {
        return List.of();
    }

    @Override
    public void save(Account account) {

    }

    @Override
    public void update(Account account) {

    }

    @Override
    public void delete(Account account) {

    }

    private static void close() {
        try {
            if (rs != null) rs.close();
            if (connect != null) connect.close();
            if (pst != null) pst.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static void getConnection() {
        try {
            connect = ConnectionUtil.getConnection();
        } catch (SQLException | ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
