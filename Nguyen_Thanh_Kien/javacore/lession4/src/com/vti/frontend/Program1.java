package com.vti.frontend;

import com.vti.backend.Excercise1;
import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Position;

import java.time.LocalDate;

public class Program1 {

    public static void main(String[] args) {
        Department department = new Department();
        department.setDepartmentId(10);
        department.setDepartmentName("Sale");

        Department department1 = new Department();
        department1.setDepartmentId(20);
        department1.setDepartmentName("Giám đốc");

        Department department2 = new Department();
        department2.setDepartmentId(30);
        department2.setDepartmentName("Marketing");

        Position position = new Position();
        position.setPositionId(10);
        position.setPositionName("Dev");

        Position position1 = new Position();
        position1.setPositionId(20);
        position1.setPositionName("Test");

        Account account1 = new Account();
        account1.setAccountId(20);
        account1.setDepartment(department1);
        account1.setCreateDate(LocalDate.parse("2022-01-01"));
        account1.setUserName("levan");
        account1.setFullName("Lê Vân");
        account1.setEmail("levan@gmail.com");

        Account account2 = new Account();
        account2.setAccountId(30);
        account2.setCreateDate(LocalDate.parse("2024-01-01"));
        account2.setDepartment(department1);
        account2.setUserName("lethichau");
        account2.setFullName("Lê Thị Châu");
        account2.setPosition(position1);
        account2.setEmail("lethichau@gmail.com");

        Account[] accounts = {account1, account2};
//        Excercise1.question1();
//        Excercise1.question2();
        Excercise1.question3(accounts);
    }
}
