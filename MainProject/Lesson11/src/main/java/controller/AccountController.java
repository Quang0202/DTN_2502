package controller;

import service.AccountService;
import service.IAccountService;

public class AccountController {
    private IAccountService accountService;
    public AccountController(){
        accountService = new AccountService();
    }

    public void deleteAccountByDepartmentID(int id){
        accountService.deleteAccountByDepartmentID(id);
    }

}
