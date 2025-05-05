package frontend;

import backend.controller.AccountController;
import entity.Account;
import entity.Department;
import entity.Position;

import java.util.List;

public class Program {
    public static void main(String[] args) {
        AccountController accountController = new AccountController();
        List<Account> accountList = accountController.getListAccounts();
        for (Account account : accountList) {
            System.out.println(account);
        }
        Position position = new Position(1, "asd");
        Department department = new Department(2, "sxfds");
        accountController.createAccount(new Account(20, "Male", position, department, "nguyen van a", "nva", "nguye@gmail.com"));
    }
}
