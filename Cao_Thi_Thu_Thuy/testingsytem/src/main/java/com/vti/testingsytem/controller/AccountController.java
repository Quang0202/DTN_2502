package com.vti.testingsytem.controller;

import com.vti.testingsytem.dto.AccountDTO;
import com.vti.testingsytem.entity.Account;
import com.vti.testingsytem.form.AccountForm;
import com.vti.testingsytem.form.AuthRequestForm;
import com.vti.testingsytem.jwt.JwtAuthenticationFilter;
import com.vti.testingsytem.jwt.JwtTokenProvider;
import com.vti.testingsytem.service.IAccountService;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequestMapping("/api/v1/account")
public class AccountController {

    @Autowired
    private IAccountService accountService;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    @GetMapping("/")
    public ResponseEntity<?> getAllAccounts(){
        return ResponseEntity.ok(accountService.getAllAccount());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getAccountByID(@PathVariable int id){
        return ResponseEntity.ok(accountService.getAccountByID(id));
    }

    @PostMapping("/create")
    public ResponseEntity<?> createAccount(@Valid @RequestBody AccountForm accountForm){
        return new ResponseEntity<>(accountService.createAccount(accountForm), HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateAccount(@PathVariable int id, @RequestBody Account account){
        return ResponseEntity.ok(accountService.updateAccount(id, account));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteAccount(@PathVariable int id){
        accountService.deleteAccount(id);
        return ResponseEntity.ok("Delete success!");
    }

    @PostMapping("/login")
    public String login(@RequestBody AuthRequestForm authRequest) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword())
        );

        UserDetails userDetails = (UserDetails) authentication.getPrincipal();

        return jwtTokenProvider.generateToken(userDetails);
    }
}
