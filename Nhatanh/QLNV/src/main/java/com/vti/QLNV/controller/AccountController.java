package com.vti.QLNV.controller;

import com.vti.QLNV.entity.Account;
import com.vti.QLNV.entity.Department;
import com.vti.QLNV.service.AccountService;
import com.vti.QLNV.service.DepartmentService;
import com.vti.QLNV.service.IAccountService;
import com.vti.QLNV.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account/v1")
public class AccountController {

    @Autowired
    private IAccountService service;

    public AccountController(AccountService service){
        this.service = service;
    }

    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> createDepartment(@RequestBody Account request) {
        return ResponseEntity.ok(service.createAccount(request));
    }

    @DeleteMapping(value = "/delete/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> deleteDepartment(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(service.deleteAccountById(id));
    }

    @PutMapping(value = "/update", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> updateDepartment(@RequestBody Account request) {
        return ResponseEntity.ok(service.updateAccount(request));
    }

    @GetMapping()
    public ResponseEntity<List<Account>> createDepartment() {
        return ResponseEntity.ok(service.getAllAccount());
    }

}
