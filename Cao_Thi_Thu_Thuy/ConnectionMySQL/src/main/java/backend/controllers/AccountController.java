package backend.controllers;

import backend.services.AccountService;
import backend.services.IAccountService;
import entity.Account;

import java.util.List;

public class AccountController {
    private IAccountService accountService;
    public AccountController(){
        accountService = new AccountService();
    }
    public List<Account> getListAccounts(){
        return accountService.getListAccounts();
    }
    public void createAccount(Account account){
        accountService.createAccount(account);
    }
    public Account getAccountByID(int id){
        return accountService.getAccountByID(id);
    }
    public boolean isAccountExists(int id){
        return accountService.isAccountExists(id);
    }
    public void updateUsername(){
        accountService.updateUsername();
    }
    public void deleteAccount(int id){
        accountService.deleteAccount(id);
    }
}
