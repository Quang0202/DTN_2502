package backend.controller;

import backend.service.AccountService;
import backend.service.IAccountService;
import entity.Account;

import java.util.List;

public class AccountController {
    private IAccountService iAccountService;

    public AccountController() {
        iAccountService = new AccountService();
    }

    public List<Account> getListAccounts() {
        return iAccountService.getListAccounts();
    }

    public void createAccount(Account account) {
        iAccountService.createAccount(account);
    }

    public Account getAccountById(int id) {
        return iAccountService.getAccountById(id);
    }
}
