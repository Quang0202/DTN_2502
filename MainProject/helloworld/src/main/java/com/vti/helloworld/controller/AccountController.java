package com.vti.helloworld.controller;

import com.vti.helloworld.DTO.AccountDTO;
import com.vti.helloworld.entity.Account;
import com.vti.helloworld.entity.AccountFilterForm;
import com.vti.helloworld.entity.Department;
import com.vti.helloworld.entity.Position;
import com.vti.helloworld.repository.IAccountRepository;
import com.vti.helloworld.request.AccountRequestForm;
import com.vti.helloworld.specification.AccountSpecification;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1/account")
public class AccountController {

    @Autowired
    private IAccountRepository repository;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping()
    public Page<AccountDTO> getAllAccount(
            Pageable pageable,
            @RequestParam(value = "userName", required = false) String userName,
            @RequestParam(value = "departmentName", required = false) String departmentName,
            @DateTimeFormat(pattern = "dd-MM-yyyy HH:mm:ss") LocalDateTime dateTime,// yyyy-MM-ddThh:mm:ss
            AccountFilterForm form
    ) {
        System.out.println(dateTime);
        Specification<Account> where = Specification.where(AccountSpecification.searchByUserName(userName))
                .and(AccountSpecification.greaterThanId(form.getMinId()))
                .and(AccountSpecification.lessThanId(form.getMaxId()))
                .and(AccountSpecification.searchByDepartmentName(departmentName))
                .and(AccountSpecification.minDate(dateTime))
                .and(AccountSpecification.minYear(form.getMinYear()))
                .and(AccountSpecification.equalPositionName(form.getPositionName()));

        Page<Account> accounts = repository.findAll(where, pageable);
//        List<AccountDTO> accountDTOs = new ArrayList<>();
//        for(Account account: accounts){
//            AccountDTO accountDTO = new AccountDTO(account.getAccountId(), account.getEmail(), account.getUserName(),account.getFullName(),account.getDepartment().getDepartmentName());
//            accountDTOs.add(accountDTO);
//        }
        List<AccountDTO> accountDTOs = modelMapper.map(accounts.getContent(), new TypeToken<List<AccountDTO>>() {
        }.getType());
        Page<AccountDTO> page = new PageImpl<>(accountDTOs, pageable, accounts.getTotalElements());
        return page;
    }

    @GetMapping("/{id}")
    public AccountDTO getAllAccountById(@PathVariable int id) {
        Account account = repository.findById(id).orElse(null);
        return modelMapper.map(account, AccountDTO.class);
    }

    @PostMapping("/create/{id}")
    public Boolean createAccount(@RequestBody @Valid AccountRequestForm accountForm, @PathVariable int id){
        try {
            modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

//            modelMapper.typeMap(AccountRequestForm.class, Account.class).addMappings(mapper -> {
//                mapper.map(Account::getFullName, AccountDto::setName);
//            })

            Account acount2 = repository.findById(id).orElse(null);
//            Account account = modelMapper.map(accountForm, Account.class);
//            account.setAccountId(id);
//            account.setDepartment(new Department(accountForm.getDepartmentId()));
//            account.setPosition(new Position(accountForm.getPositionId()));

            acount2.setEmail(accountForm.getEmail());
            acount2.setFullName(accountForm.getFullName());
            acount2.setUserName(accountForm.getUserName());
            acount2.setDepartment(new Department(accountForm.getDepartmentId()));
            acount2.setPosition(new Position(accountForm.getPositionId()));
            repository.save(acount2);
            return true;
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
