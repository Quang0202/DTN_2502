package com.vti.backend;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Group;
import com.vti.entity.Position;

import java.time.LocalDate;

public class Excercise1 {
    public static void question1(){
        Department department = new Department("Department 1");
        Department department2 = new Department();
        department2.setDepartmentId(1);
        department2.setDepartmentName("Department 2");
        department2.setAddress("HN");
        System.out.println("Department 1: " + department.toString());
        System.out.println("Department 2: " + department2.toString());
    }

    public static void question2(){
        Position position = new Position();
        position.setPositionId(1);
        position.setPositionName("Dev");

        Account account = new Account();
        account.setAccountId(1);
        account.setCreateDate(LocalDate.parse("2022-01-01"));
        account.setUserName("nguyenthanhkien");
        account.setFirstName("Kiên");
        account.setLastName("Nguyễn Thành");
        account.setPosition(position);
        account.setEmail("nguyenthanhkien@gmail.com");

        Account account2 = new Account(2, "abc", "abc@gmail.com","Le","Van");
        Account account3 = new Account(2, "hoang", position,"hoang@gmail.com","Le","Hoang");
        Account account4 = new Account(2, "hoang", "Tran","Trung", position, LocalDate.now(),"hoang@gmail.com");
        System.out.println("Account 1: " + account.toString());
        System.out.println("Account 2: " + account2.toString());
        System.out.println("Account 3: " + account3.toString());
        System.out.println("Account 4: " + account4.toString());
    }

    public static void question3(Account[] accounts){
        Account account2 = new Account(2, "abc", "abc@gmail.com","Le","Van");

        Group group = new Group();
        group.setGroupId(1);
        group.setGroupName("G2");
        group.setCreateDate(LocalDate.parse("2022-01-12"));

        Group group1 = new Group("G4", account2, accounts, LocalDate.now());

        String[] usernames = {"trung", "van", "bich"};
        Group group2 = new Group("G5", account2,LocalDate.now(), usernames);

        System.out.println("Group 1: " + group.toString());
        System.out.println("Group 2: " + group1.toString());
        System.out.println("Group 3: " + group2.toString());
    }
}
