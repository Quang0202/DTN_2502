package backend.service;

import backend.repository.AccountRepository;
import backend.repository.IAccountRepository;
import entity.Account;

import java.util.List;

public class AccountService implements IAccountService {
    private IAccountRepository iAccountRepository;

    public AccountService() {
        iAccountRepository = new AccountRepository();
    }

    public List<Account> getListAccounts() {
        return iAccountRepository.getAllAccounts();
    }

    public void createAccount(Account account) {
        iAccountRepository.createAccount(account);
    }

    public Account getAccountById(int id) {
        return iAccountRepository.getAccountById(id);
    }
}
