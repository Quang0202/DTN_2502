package com.vti.assignment45.controller;

import com.vti.assignment45.DTO.AccountDTO;
import com.vti.assignment45.entity.Account;
import com.vti.assignment45.repository.AccountRepository;
import com.vti.assignment45.specification.AccountSpecification;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/accounts")
public class AccountController {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping
    public Page<AccountDTO> getAllAccounts(
            @RequestParam(value = "userName", required = false) String userName,
            Pageable pageable) {

        Specification<Account> spec = AccountSpecification.searchByUsername(userName);
        Page<Account> accounts = accountRepository.findAll(spec, pageable);
        return accounts.map(account -> {
            AccountDTO dto = modelMapper.map(account, AccountDTO.class);
            dto.setDepartmentName(account.getDepartment().getDepartmentName());
            dto.setPositionName(account.getPosition().getPositionName().name());
            return dto;
        });
    }
}
