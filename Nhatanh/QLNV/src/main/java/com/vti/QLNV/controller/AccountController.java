package com.vti.QLNV.controller;

import com.vti.QLNV.dto.request.CreateAccountRequest;
import com.vti.QLNV.entity.Account;
import com.vti.QLNV.entity.Department;
import com.vti.QLNV.service.AccountService;
import com.vti.QLNV.service.DepartmentService;
import com.vti.QLNV.service.IAccountService;
import com.vti.QLNV.service.IDepartmentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account/v1")
public class AccountController {

    @Autowired
    private IAccountService service;


    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> createAccount(@RequestBody @Valid CreateAccountRequest request) {
        return ResponseEntity.ok(service.createAccount(request));
    }

    @DeleteMapping(value = "/delete/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> deleteAccount(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(service.deleteAccountById(id));
    }

    @PutMapping(value = "/update", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> updateAccount(@RequestBody Account request) {
        return ResponseEntity.ok(service.updateAccount(request));
    }

    @GetMapping()
    public ResponseEntity<Page<Account>> getAllAccount(@RequestParam(defaultValue = "0", required = false) Integer pageNo,
                                                       @RequestParam(defaultValue = "10", required = false) Integer pageSize,
                                                       @RequestParam(defaultValue = "accountId", required = false) String sortBy) {
        Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));
        return ResponseEntity.ok(service.getAllAccount(paging));
    }

}
