package repositories;

import entity.Account;
import entity.Department;
import entity.Position;
import utils.JdbcUtils;

import javax.swing.text.Utilities;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountRepository {
    private Connection connection;
    private DepartmentRepository departmentRepository = new DepartmentRepository();
    private PositionRepository positionRepository = new PositionRepository();

    public AccountRepository(){
        connection = JdbcUtils.getConnection();
    }
    public List<Account> getAccounts(){
        String sql = "Select * from Account";
        List<Account> accounts = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                Account account = new Account();
                account.setAccountId(resultSet.getInt("AccountID"));
                account.setEmail(resultSet.getString("Email"));
                account.setUsername(resultSet.getString("Username"));
                account.setFullName(resultSet.getString("FullName"));
                account.setDepartment(departmentRepository.getDepartmentByID(resultSet.getInt("DepartmentID")));
                account.setPosition(positionRepository.getPositionByID(resultSet.getInt("PositionID")));
                account.setCreateDate(resultSet.getDate("CreateDate") != null ? resultSet.getDate("CreateDate").toLocalDate() : null);
                accounts.add(account);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return accounts;
    }
    public Account getAccountByID(int id){
        String sql = "Select * from Account where AccountID = ?;";
        if (connection != null){
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql);){
                preparedStatement.setInt(1, id);
                ResultSet resultSet = preparedStatement.executeQuery();
                if (resultSet.next()){
                    Account account = new Account();
                    account.setAccountId(resultSet.getInt("AccountID"));
                    account.setEmail(resultSet.getString("Email"));
                    account.setUsername(resultSet.getString("Username"));
                    account.setFullName(resultSet.getString("FullName"));
                    account.setDepartment(departmentRepository.getDepartmentByID(resultSet.getInt("DepartmentID")));
                    account.setPosition(positionRepository.getPositionByID(resultSet.getInt("PositionID")));
                    account.setCreateDate(resultSet.getDate("CreateDate") != null ? resultSet.getDate("CreateDate").toLocalDate() : null);
                    return account;
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }
    public boolean isUsernameExists(String name){
        String sql = "Select * from Account where Username = ?;";
        if (connection != null){
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql);){
                preparedStatement.setString(1, name);
                ResultSet resultSet = preparedStatement.executeQuery();
                if (resultSet.next()){
                    return true;
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return false;
    }
    public void createAccount(){
        String sql = "insert into Account (Email, Username, Fullname, DepartmentID, PositionID) values\n" +
                "(?, ?, ?, ?, ?);";
        try(Scanner scanner = new Scanner(System.in);
            PreparedStatement preparedStatement = connection.prepareStatement(sql);){
            Account account = new Account();
            System.out.print("Nhập email: ");
            account.setEmail(scanner.nextLine());
            System.out.print("Nhập username: ");
            account.setUsername(scanner.nextLine());
            System.out.print("Nhập full name: ");
            account.setFullName(scanner.nextLine());
            System.out.print("Nhập department id: ");
            int departmentId = scanner.nextInt();
            while (departmentRepository.getDepartmentByID(departmentId) == null){
                System.out.print("Department không tồn tại, nhập lại department id: ");
                departmentId = scanner.nextInt();
            }
            account.setDepartment(departmentRepository.getDepartmentByID(departmentId));
            System.out.print("Nhập position id: ");
            int position_id = scanner.nextInt();
            while (positionRepository.getPositionByID(position_id) == null){
                System.out.print("Position không tồn tại, nhập lại position id: ");
                position_id = scanner.nextInt();
            }
            account.setPosition(positionRepository.getPositionByID(position_id));
            account.setCreateDate(LocalDate.now());

            preparedStatement.setString(1, account.getEmail());
            preparedStatement.setString(2, account.getUsername());
            preparedStatement.setString(3, account.getFullName());
            preparedStatement.setInt(4, account.getDepartment().getDepartmentId());
            preparedStatement.setInt(5, account.getPosition().getPositionId());
            int result = preparedStatement.executeUpdate();
            if (result > 0){
                System.out.println("Tạo account thành công");
            } else {
                System.out.println("Tạo account thất bại");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }

    }

    public void updateUsername(){
        String sql = "UPDATE Account SET Username = ? WHERE (AccountID = ?);";
        try(Scanner scanner = new Scanner(System.in);
            PreparedStatement preparedStatement = connection.prepareStatement(sql);){
            System.out.print("Nhập account id: ");
            int id = scanner.nextInt();
            Account account = getAccountByID(id);
            if (account == null){
               throw new Exception("Cannot find account which has id = " + id);
            }
            scanner.nextLine();
            System.out.print("Nhập username mới: ");
            String username_new = scanner.nextLine();
            if (isUsernameExists(username_new)){
                throw new Exception("Username is Exists!");
            }

            preparedStatement.setString(1, username_new);
            preparedStatement.setInt(2, account.getAccountId());
            int result = preparedStatement.executeUpdate();
            if (result > 0){
                System.out.println("Update account thành công");
            } else {
                System.out.println("Update account thất bại");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void deleteAccountById(){
        String sql = "Delete from Account WHERE (AccountID = ?);";
        try(Scanner scanner = new Scanner(System.in);
            PreparedStatement preparedStatement = connection.prepareStatement(sql);){
            System.out.print("Nhập account id: ");
            int id = scanner.nextInt();
            Account account = getAccountByID(id);
            if (account == null){
                throw new Exception("Cannot find account which has id = " + id);
            }
            preparedStatement.setInt(1, account.getAccountId());
            int result = preparedStatement.executeUpdate();
            if (result > 0){
                System.out.println("Delete account thành công");
            } else {
                System.out.println("Delete account thất bại");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
