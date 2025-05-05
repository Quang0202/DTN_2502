package backend.services;

import backend.repositories.AccountRepository;
import backend.repositories.IAccountRepository;
import entity.Account;

import java.util.List;

public class AccountService implements IAccountService{
    private IAccountRepository accountRepository;
    public AccountService(){
        accountRepository = new AccountRepository();
    }
    public List<Account> getListAccounts(){
        return accountRepository.getListAccounts();
    }

    @Override
    public Account getAccountByID(int id) {
        return accountRepository.getAccountByID(id);
    }

    @Override
    public void createAccount(Account account) {
        accountRepository.createAccount(account);
    }

    @Override
    public boolean isAccountExists(int id) {
        return accountRepository.isAccountExists(id);
    }

    @Override
    public void updateAccountByID(Account updatedAccount) {
        accountRepository.updateAccountByID(updatedAccount);
    }

    @Override
    public void deleteAccount(int id) {
        accountRepository.deleteAccount(id);
    }
    public void updateUsername(){
        accountRepository.updateUsername();
    }
}
