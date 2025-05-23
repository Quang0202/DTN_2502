package com.vti.helloworld.controller;

import com.vti.helloworld.DTO.AccountDTO;
import com.vti.helloworld.entity.Account;
import com.vti.helloworld.entity.AccountFilterForm;
import com.vti.helloworld.repository.IAccountRepository;
import com.vti.helloworld.specification.AccountSpecification;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/account")
public class AccountController {

    @Autowired
    private IAccountRepository repository;


    @Autowired
    private ModelMapper modelMapper;

    @GetMapping()
    public Page<AccountDTO> getAllAccounts(Pageable pageable , @RequestParam(required = false) String value, AccountFilterForm form) {

        Specification<Account> where = null;
        Specification<Account> searchByUserName = AccountSpecification.searchByUserName(value);

        Specification<Account> greaterThanId = AccountSpecification.greaterThanId(form.getMinId());
        Specification<Account> lessThanId = AccountSpecification.lessThanId(form.getMaxId());
        where = searchByUserName;
      if(where != null){
          where = where.and(greaterThanId);
      }else {
          where = greaterThanId;
      }

        if(where != null){
            where = where.and(lessThanId);
        }else {
            where = lessThanId;
        }
        Page<Account> accounts = repository.findAll(where,pageable);
//        List<AccountDTO> dtos = new ArrayList<>();
//        for (Account account : accounts) {
//            AccountDTO dto = new AccountDTO(account.getAccountId(),account.getEmail(),account.getUserName(),account.getFullName(),account.getDepartment().getDepartmentName());
//            dtos.add(dto);
//
//        }

        List<AccountDTO> dtos = modelMapper.map(accounts.getContent(), new TypeToken<List<AccountDTO>>(){}.getType() );
        Page<AccountDTO> page = new PageImpl<>(dtos,pageable,accounts.getTotalElements());
        return page;
    }


    @GetMapping("/{id}")
    public AccountDTO getAllAccountById(@PathVariable int id) {
        Account account = repository.findById(id).orElse(null);

        return modelMapper.map(account, AccountDTO.class);
    }
}
