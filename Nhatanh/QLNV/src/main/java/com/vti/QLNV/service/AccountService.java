package com.vti.QLNV.service;

import com.vti.QLNV.entity.Account;
import com.vti.QLNV.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService implements IAccountService{

    @Autowired
    private AccountRepository repository;

    @Override
    public Page<Account> getAllAccount(Pageable pageable) {
        Page<Account> pagedResult = repository.findAll(pageable);
        if(pagedResult.hasContent()) {
            return pagedResult;
        } else {
            return null;
        }
    }

    @Override
    public Account findAccountById(Integer id) {
        return repository.findByAccountId(id).orElse(null);
    }

    @Override
    public String createAccount(Account newAccount) {
        repository.save(newAccount);
        return "Account created";
    }

    @Override
    public String updateAccount(Account newAccount) {
        repository.save(newAccount);
        return "Account updated";
    }

    @Override
    public String deleteAccountById(Integer id) {
        repository.deleteById(id);
        return "Account deleted";
    }
}
