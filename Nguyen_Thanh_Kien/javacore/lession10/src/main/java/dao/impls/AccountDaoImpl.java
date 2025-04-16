package dao.impls;

import dao.Dao;
import model.Account;
import model.Department;
import model.Position;
import utils.ConnectionUtil;

import java.io.IOException;
import java.sql.*;
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
        getConnection();
        Account account = new Account();
        try {
            pst = connect.prepareStatement("SELECT * FROM Account " +
                    "INNER JOIN Department ON Account.department_id = Department.department_id " +
                    "INNER JOIN Position ON Account.position_id = Position.position_id " +
                    "WHERE account_id = ?");
            pst.setInt(1, id);
            pst.setMaxRows(1);
            rs = pst.executeQuery();
            if (!rs.next()) {
                throw new RuntimeException("Account id: " + id + " not found");
            }
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
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        close();
        return Optional.of(account);
    }

    @Override
    public List<Account> findByName(String name) {
        return List.of();
    }

    @Override
    public void save(Account account) {
        getConnection();
        try {
            pst = connect.prepareStatement("INSERT INTO `Account`(email, user_name, full_name, department_id, position_id, create_date) VALUES(?,?,?,?,?,?)");
            pst.setString(1, account.getEmail());
            pst.setString(2, account.getUsername());
            pst.setString(3, account.getFullName());
            pst.setInt(4, account.getDepartment().getDepartmentId());
            pst.setInt(5, account.getPosition().getPositionId());
            pst.setDate(6, Date.valueOf(account.getCreateDate()));
            pst.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close();
        }
    }

    @Override
    public void update(Account account) {
        getConnection();
        try {
            pst = connect.prepareStatement("UPDATE Account SET full_name = ? WHERE account_id = ?");
            pst.setString(1, account.getFullName());
            pst.setInt(2, account.getAccountId());
            pst.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close();
        }
    }

    @Override
    public void delete(Account account) {
        getConnection();
        try {
            pst = connect.prepareStatement("DELETE FROM Account WHERE account_id = ?");
            pst.setInt(1, account.getAccountId());
            pst.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close();
        }
    }

    public void deleteAccountAndDepartment(int idDepartment) {
        getConnection();
        try {
            connect.setAutoCommit(false);
            pst = connect.prepareStatement("DELETE FROM Account WHERE department_id = ?");
            pst.setInt(1, idDepartment);
            pst.executeUpdate();

            pst = connect.prepareStatement("DELETE FROM department WHERE department_id = ?");
            pst.setInt(1, idDepartment);
            pst.executeUpdate();
            connect.commit();
        } catch (SQLException e) {
            if (connect != null) {
                try {
                    connect.rollback();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
            throw new RuntimeException(e);
        } finally {
            close();
        }
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
