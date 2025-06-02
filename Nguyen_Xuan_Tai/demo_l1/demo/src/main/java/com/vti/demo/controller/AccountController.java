package com.vti.demo.controller;

import com.vti.demo.DTO.AccountDTO;
import com.vti.demo.entity.Account;
import com.vti.demo.repository.IAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/account")
public class AccountController {

    @Autowired
    private IAccountRepository accountRepository;

    @GetMapping("/")
    public ResponseEntity<?> geAllAccounts() {
        return ResponseEntity.ok(accountRepository.findAll());
    }


    public List<AccountDTO> getAllAccounts() {
        List<Account> accounts = accountRepository.findAll();
        List<AccountDTO> accountDTOS = new ArrayList<>();
        for (Account account : accounts) {
            AccountDTO accountDTO = new AccountDTO(account.getAccountId(),account.getEmail(),account.getUsername(),account.getFullName(),account.getDepartment().getDepartmentName());
      accountDTOS.add(accountDTO);
        }
        return accountDTOS;
    }
}
