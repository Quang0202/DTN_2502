package com.company.backend.TestingSystem2;

import com.company.entity.Account;
import com.company.entity.Department;
import com.company.entity.EPositionName;
import com.company.entity.Position;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Exercise2 {
    public void q1() {
        int a = 5;
        System.out.printf("%d", a);
    }
    public void q2() {
        int a = 100000000;
        System.out.printf("%,d", a);
    }
    public void q3() {
        float a = 5.567098f;
        System.out.printf("%.4f", a);
    }
    public void q4() {
        String HoTen = "Nguyễn Văn A";
        System.out.printf("Tên tôi là %s và tôi đang độc thân.", HoTen);
    }
    public void q5() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH'h':mm'p':ss's'");
        String formattedDateTime = now.format(formatter);
        System.out.println(formattedDateTime);
    }
    public void q6() {
        // department
        Department department1 = new Department(1, "IT");
        Department department2 = new Department(2, "Sale");
        Department department3 = new Department(3, "HR");
        // position
        Position position1 = new Position(1, EPositionName.PM);
        Position position2 = new Position(2, EPositionName.Dev);
        Position position3 = new Position(3, EPositionName.Scrum);
        // account
        Account account1 = new Account(1, "acc1@gmail.com", "ac1", "ac1", department1, position1, LocalDate.of(2022, 1, 5));
        Account account2 = new Account(2, "acc2@gmail.com", "ac2", "ac2", department2, position2, LocalDate.of(2022, 2, 5));
        Account account3 = new Account(3, "acc3@gmail.com", "ac3", "ac3", department3, position3, LocalDate.of(2022, 3, 5));
        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(account1);
        accounts.add(account2);
        accounts.add(account3);

        // In thong tin
        System.out.printf("%-20s %-20s %-20s", "Email", "Fullname", "Department");
        System.out.println();
        for(Account a: accounts){
            System.out.printf("%-20s %-20s %-20s", a.getEmail(), a.getFullName(), a.getDepartment().getDepartmentName());
            System.out.println();
        }
    }
}
