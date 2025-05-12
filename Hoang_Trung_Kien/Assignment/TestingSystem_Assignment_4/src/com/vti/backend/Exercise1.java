package com.vti.backend;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Group;
import com.vti.entity.Position;

import java.time.LocalDateTime;

public class Exercise1 {
    public void ques1() {
        Department department1 = new Department();
        Department department2 = new Department("Ban hang");
        System.out.println(department1);
        System.out.println(department2);
    }

    public void ques2() {
        Position position1 = new Position();

        LocalDateTime date1 = LocalDateTime.now();

        Account account1 = new Account();
        Account account2 = new Account(1, "1@gmail.com", "a", "nguyen van", "a");
        Account account3 = new Account(2, "2@gmail.com", "b", "nguyen van", "b", position1);
        Account account4 = new Account(3, "3@gmail.com", "c", "nguyen van", "c", position1, date1);
        Account[] accounts = {account1, account2, account3, account4};
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

    public void ques3() {
        Position position1 = new Position();

        LocalDateTime date1 = LocalDateTime.now();

        Account account1 = new Account();
        Account account2 = new Account(1, "1@gmail.com", "a", "nguyen van", "a");
        Account account3 = new Account(2, "2@gmail.com", "b", "nguyen van", "b", position1);
        Account account4 = new Account(3, "3@gmail.com", "c", "nguyen van", "c", position1, date1);
        Account[] accounts = {account1, account2, account3, account4};

        String[] usernames = {"nva", "nvb", "nvc"};

        Group group1 = new Group();
        Group group2 = new Group("Sale", account1, accounts, LocalDateTime.now());
        Group group3 = new Group("Dev", account2, usernames, LocalDateTime.now());
        System.out.println(group1);
        System.out.println(group2);
        System.out.println(group3);
    }
}
