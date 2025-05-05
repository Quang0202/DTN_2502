package service;


import entity.Account;
import entity.Department;
import repository.AccountRepository;
import repository.IAccountRepository;

import java.util.List;

public class AccountService implements IAccountService {

    private IAccountRepository accountRepository;

    public AccountService() {
        accountRepository = new AccountRepository();
        // accountRepository = new MongoAccountRepository();
    }
    public void deleteAccountByDepartmentID( int id){
         accountRepository.deleteAccountByDepartmentID(id);
    }
}
