package com.company.exercise.TestingSystem3;

import com.company.model.Account;

import java.time.LocalDate;

public class Exercise2 {
    public static void main(String[] args) {
        Account[] accounts = new Account[5];
        for (int i = 0; i < 5; i++){
            Account account = new Account();
            account.setAccountId(i + 1);
            account.setEmail("Email " + (i + 1));
            account.setUsername("User name " + (i + 1));
            account.setFullName("Full name " + (i + 1));
            account.setCreateDate(LocalDate.now());
            accounts[i] = account;
        }
    }
}
