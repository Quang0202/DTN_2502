package backend.service;

import backend.repository.AccountRepository;
import backend.repository.IAccountRepository;

public class AccountService {
    private IAccountRepository iAccountRepository;
    public AccountService() {
        iAccountRepository = new AccountRepository();
    }
}
