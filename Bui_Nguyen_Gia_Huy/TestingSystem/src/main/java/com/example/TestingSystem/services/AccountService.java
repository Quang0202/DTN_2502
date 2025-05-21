package com.example.TestingSystem.services;

import com.example.TestingSystem.dto.AccountDTO;
import com.example.TestingSystem.dto.CreateAccountDTO;
import com.example.TestingSystem.entity.Account;
import com.example.TestingSystem.entity.Department;
import com.example.TestingSystem.entity.Position;
import com.example.TestingSystem.repositories.AccountRepository;
import com.example.TestingSystem.repositories.DepartmentRepository;
import com.example.TestingSystem.repositories.PositionRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AccountService {
    private final AccountRepository accountRepository;
    private final DepartmentRepository departmentRepository;
    private final PositionRepository positionRepository;

    public AccountService(AccountRepository accountRepository,
                          DepartmentRepository departmentRepository,
                          PositionRepository positionRepository) {
        this.accountRepository = accountRepository;
        this.departmentRepository = departmentRepository;
        this.positionRepository = positionRepository;
    }

    private AccountDTO accountDTO(Account account) {
        AccountDTO accountDTO = new AccountDTO();
        accountDTO.setAccountID(account.getAccountID());
        accountDTO.setEmail(account.getEmail());
        accountDTO.setUsername(account.getUsername());
        accountDTO.setFullName(account.getFullName());
        accountDTO.setDepartmentName(account.getDepartment().getDepartmentName());
        accountDTO.setPositionName(account.getPosition().getPositionName().name());
        accountDTO.setCreateDate(account.getCreateDate());
        return accountDTO;
    }

    public List<AccountDTO> getAllAccounts() {
        return accountRepository.findAll().stream()
                .map(this::accountDTO)
                .collect(Collectors.toList());
    }

    public AccountDTO getAccountById(Short id) {
        return accountRepository.findById(id)
                .map(this::accountDTO)
                .orElse(null);
    }

    public AccountDTO createAccount(CreateAccountDTO createAccountDTO) {
        Department department = departmentRepository.findById(createAccountDTO.getDepartmentID())
                .orElseThrow(() -> new RuntimeException("Department not found"));
        Position position = positionRepository.findById(createAccountDTO.getPositionID())
                .orElseThrow(() -> new RuntimeException("Position not found"));
        Account account = new Account();
        account.setEmail(createAccountDTO.getEmail());
        account.setUsername(createAccountDTO.getUsername());
        account.setFullName(createAccountDTO.getFullName());
        account.setDepartment(department);
        account.setPosition(position);

        return accountDTO(accountRepository.save(account));
    }

    public AccountDTO updateAccount(Short id, CreateAccountDTO createAccountDTO) {
        Optional<Account> optionalAccount = accountRepository.findById(id);
        if (optionalAccount.isEmpty()) {
            return null;
        }

        Account account = optionalAccount.get();
        Department department = departmentRepository.findById(createAccountDTO.getDepartmentID())
                .orElseThrow(() -> new RuntimeException("Department not found"));
        Position position = positionRepository.findById(createAccountDTO.getPositionID())
                .orElseThrow(() -> new RuntimeException("Position not found"));
        account.setEmail(createAccountDTO.getEmail());
        account.setUsername(createAccountDTO.getUsername());
        account.setFullName(createAccountDTO.getFullName());
        account.setDepartment(department);
        account.setPosition(position);

        return accountDTO(accountRepository.save(account));
    }

    public void deleteAccount(Short id) {
        accountRepository.deleteById(id);
    }
}
