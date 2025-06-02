package com.vti.helloworld.controller;

import com.vti.helloworld.DTO.AccountDTO;
import com.vti.helloworld.entity.Account;
import com.vti.helloworld.entity.AccountFilterForm;
import com.vti.helloworld.entity.Department;
import com.vti.helloworld.entity.Position;
import com.vti.helloworld.repository.IAccountRepository;
import com.vti.helloworld.request.AccountParamForm;
import com.vti.helloworld.request.AccountRequestForm;
import com.vti.helloworld.service.IAccountservice;
import com.vti.helloworld.specification.AccountSpecification;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Length;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/account")
@Validated
public class AccountController {

    @Autowired
    private IAccountRepository repository;

    private IAccountservice accountService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping()
    public Page<AccountDTO> getAllAccount(
            @Valid AccountParamForm accountParam,
            @RequestParam
            @Length(max = 50)
            @Pattern(regexp = "^[\\p{L}0-9\\s]*$") String search) {
        Pageable pageable = toPageable(accountParam);
        Page<Account> accounts = repository.findAll(pageable);
        List<AccountDTO> accountDTOs = modelMapper.map(accounts.getContent(), new TypeToken<List<AccountDTO>>() {
        }.getType());
        Page<AccountDTO> page = new PageImpl<>(accountDTOs, pageable, accounts.getTotalElements());
        return page;
    }

    @GetMapping("/specification")
    public Page<AccountDTO> getAllAccountWithSpecification(
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
    public AccountDTO getAccountById(@PathVariable int id) {
        Account account = repository.findById(id).orElse(null);
        return modelMapper.map(account, AccountDTO.class);
    }

    @PostMapping("/create/{id}")
    public ResponseEntity<Object> createAccount(@RequestBody @Valid AccountRequestForm accountForm, @PathVariable int id) throws Exception {
        try {
            accountService.createAccount(accountForm, id);
            return ResponseEntity.ok("Create account success!");
        }catch (Exception e){
            return new ResponseEntity<>("Create account error", HttpStatus.BAD_REQUEST);
        }
    }

    public Pageable toPageable(AccountParamForm request) {
        int page = request.getPageNumber() - 1;
        int size = request.getPageSize();

        if (request.getSort() != null && !request.getSort().isEmpty()) {
            Sort sort = Sort.unsorted();
            for (String sortParam : request.getSort()) {
                String[] parts = sortParam.split(",");
                if (parts.length == 2) {
                    String field = parts[0];
                    String direction = parts[1].toLowerCase();
                    Sort.Order order = new Sort.Order(
                            direction.equals("desc") ? Sort.Direction.DESC : Sort.Direction.ASC,
                            field);
                    sort = sort.and(Sort.by(order));
                }
            }
            return PageRequest.of(page, size, sort);
        }

        return PageRequest.of(page, size);
    }
}
