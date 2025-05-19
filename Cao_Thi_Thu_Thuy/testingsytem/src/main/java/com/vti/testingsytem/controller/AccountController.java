package com.vti.testingsytem.controller;

import com.vti.testingsytem.entity.Account;
import com.vti.testingsytem.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/account")
public class AccountController {

    @Autowired
    private IAccountService accountService;

    @GetMapping("/")
    public ResponseEntity<?> getAllAccounts(){
        return ResponseEntity.ok(accountService.getAllAccount());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getAccountByID(@PathVariable int id){
        return ResponseEntity.ok(accountService.getAccountByID(id));
    }

    @PostMapping("/create")
    public ResponseEntity<?> createAccount(@RequestBody Account account){
        return new ResponseEntity<>(accountService.createAccount(account), HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> createAccount(@PathVariable int id, @RequestBody Account account){
        return ResponseEntity.ok(accountService.updateAccount(id, account));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteAccount(@PathVariable int id){
        accountService.deleteAccount(id);
        return ResponseEntity.ok("Delete success!");
    }
}
