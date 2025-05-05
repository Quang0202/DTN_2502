package backend.repositories;

import entity.Account;

import java.util.List;

public interface IAccountRepository {
    List<Account> getListAccounts();
    Account getAccountByID(int id);
    void createAccount(Account account);
    boolean isAccountExists(int id);
    void updateAccountByID(Account updatedAccount);
    void deleteAccount(int id);
    void updateUsername();
}
