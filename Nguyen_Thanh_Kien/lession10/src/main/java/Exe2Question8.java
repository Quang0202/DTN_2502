import dao.impls.AccountDaoImpl;
import model.Account;
import model.Department;
import model.Position;
import utils.ConnectionUtil;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;
import java.util.Scanner;

public class Exe2Question8 {

    private static final AccountDaoImpl accountDaoImpl = new AccountDaoImpl();

    public static void getAllAccounts() {
        System.out.println(accountDaoImpl.getAll());
    }

    public static void findById() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id account: ");
        int id = scanner.nextInt();
        Optional<Account> account = accountDaoImpl.findById(id);
        if (account.isPresent()) {
            System.out.println(account);
        } else {
            throw new RuntimeException("Account id: " + id + " not found");
        }
    }

    public static void updateFullNameAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id account: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap full name account: ");
        String name = scanner.nextLine();
        Optional<Account> account = accountDaoImpl.findById(id);
        if (account.isPresent()) {
            account.get().setFullName(name);
            accountDaoImpl.update(account.get());
            System.out.println("Account updated");
        } else {
            throw new RuntimeException("Account id: " + id + " not found");
        }
    }

    public static void deleteAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id account: ");
        int id = scanner.nextInt();
        Optional<Account> account = accountDaoImpl.findById(id);
        if (account.isPresent()) {
            accountDaoImpl.delete(account.get());
            System.out.println("Account deleted");
        } else {
            throw new RuntimeException("Account id: " + id + " not found");
        }
    }

    public static void addNewAccount(){
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();
        System.out.println("Nhap full name account: ");
        account.setFullName(scanner.nextLine());
        System.out.println("Nhap username name account: ");
        account.setUsername(scanner.nextLine());
        System.out.println("Nhap email account: ");
        account.setEmail(scanner.nextLine());
        account.setDepartment(new Department(1));
        account.setPosition(new Position(1));
        accountDaoImpl.save(account);
        System.out.println("Account created");
    }


    private static void getConnection() {
        try {
            Connection connect = ConnectionUtil.getConnection();
            connect.close();
            System.out.println("Connect success!");
        } catch (SQLException | ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
    }

}
