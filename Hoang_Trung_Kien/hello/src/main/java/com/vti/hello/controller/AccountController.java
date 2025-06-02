package com.vti.hello.controller;

import com.vti.hello.DTO.AccountDTO;
import com.vti.hello.entity.Account;
import com.vti.hello.entity.Department;
import com.vti.hello.entity.Position;
import com.vti.hello.repository.IAccountRepository;
import com.vti.hello.request.AccountRequestForm;
import com.vti.hello.specification.AccountSpecification;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.*;

import org.springframework.data.domain.Pageable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/account")
public class AccountController {

    @Autowired
    private IAccountRepository repository;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("/")
    public Page<AccountDTO> getAllAccount(Pageable pageable, @RequestParam(value = "search", required = false) String value, @RequestParam(value = "minId", required = false) int minId, @RequestParam(value = "minId", required = false) int maxId) {

        Specification<Account> specification = Specification.where(AccountSpecification.searchByUsername(value))
                .and(AccountSpecification.greaterThanId(minId))
                .and(AccountSpecification.lessThanId(maxId));

        Page<Account> accounts = repository.findAll(specification, pageable);
        List<AccountDTO> accountDTOS = modelMapper.map(accounts.getContent(), new TypeToken<List<AccountDTO>>(){}.getType());
        Page<AccountDTO> page = new PageImpl<>(accountDTOS, pageable, accounts.getTotalElements());
        return page;
    }

    @GetMapping("/{id}")
    public AccountDTO getAccountById(@PathVariable Integer id) {
        Account account = repository.findById(id).orElse(null);
        return modelMapper.map(account, AccountDTO.class);
    }

    @PostMapping("/create")
    public void createAccount(@RequestBody Account account) {
        repository.save(account);
    }

    @PutMapping("/update/{id}")
    public void updateAccount(@PathVariable int id, @RequestBody Account accountDetails) {
        Account account = repository.findById(id).orElse(null);
        if (account != null) {
            account.setEmail(accountDetails.getEmail());
            account.setFullName(accountDetails.getFullName());
            account.setUsername(accountDetails.getUsername());
            account.setDepartment(accountDetails.getDepartment());
            account.setPosition(accountDetails.getPosition());
            account.setCreateDate(accountDetails.getCreateDate());
        }
        repository.save(account);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAccount(@PathVariable int id) {
        repository.deleteById(id);
    }

    @PostMapping("/create")
    public void createAccount(@RequestBody AccountRequestForm accountRequestForm) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

//        modelMapper.typeMap(AccountRequestForm.class, Account.class).addMappings(mapper -> {
//            mapper.map(AccountRequestForm::getName, Account::setFullName);
//        });

        Account account = modelMapper.map(accountRequestForm, Account.class);
        account.setDepartment(new Department(accountRequestForm.getDepartmentId()));
        account.setPosition(new Position(accountRequestForm.getPositionId()));
        repository.save(account);
    }
}



