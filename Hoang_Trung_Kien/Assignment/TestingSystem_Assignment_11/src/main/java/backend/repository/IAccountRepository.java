package backend.repository;

import entity.Account;

import java.util.List;

public interface IAccountRepository {
    List<Account> getAllAccounts();
    Account getAccountById(int id);
    void createAccount(Account account);
}
