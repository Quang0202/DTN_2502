package backend.service;

import entity.Account;

import java.util.List;

public interface IAccountService {
    List<Account> getListAccounts();
    void createAccount(Account account);
    Account getAccountById(int id);
}
