package com.programming.nhatanh.lesson4;

import com.programming.nhatanh.entity.Account;
import com.programming.nhatanh.entity.Department;
import com.programming.nhatanh.entity.Group;
import com.programming.nhatanh.entity.Position;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.util.List;

public class  Homework5 {
    public static void main(String[] args) throws ParseException {

        // Ex 1:
        // Q1
        Department newDeparment1 = new Department();
        Department newDepartment2 = new Department("Dev");

        // Q2
        Account newAccount1 = new Account();

        Position newPosition1 = new Position();
        Account newAccount2 = new Account(1, "abc@email.com", "Nguyên", "Soái", newPosition1);

        Account newAccount3 = new Account(2, "def@email.com", "Nguyên", "Tướng", newPosition1, LocalDateTime.now());

        // Q3
        Group newGroup1 = new Group();
        Group newGroup2 = new Group("1", newAccount1, LocalDateTime.now(), List.of(new Account[]{newAccount2, newAccount1, newAccount3}));
        Group newGroup3 = new Group("1", newAccount1, LocalDateTime.now(), new String[]{"Account_1", "Account_2", "Account_3"});


    }
}
