package com.company.backend.TestingSystem4;

import com.company.entity.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Exercise1 {
    public void q1(){
        Department department1 = new Department();
        Department department2 = new Department("Dev");
        System.out.println("Department tạo từ contructor không tham số: " + department1.toString());
        System.out.println("Department tạo từ contructor 1 tham số: " + department2.toString());
    }
    public void q2(){
        Account account_a = new Account();
        Account account_b = new Account(1, "b@gmail.com", "Account cua cau b", "First name", "Last name");
        Account account_c = new Account(2, "c@gmail.com", "Account cua cau c", "First name", "Last name", new Position(1, EPositionName.Dev));
        Account account_d = new Account(3, "d@gmail.com", "Account cua cau d", "First name", "Last name", new Position(1, EPositionName.Dev), LocalDate.of(2021, 4, 3));
        System.out.println(account_a.toString());
        System.out.println(account_b.toString());
        System.out.println(account_c.toString());
        System.out.println(account_d.toString());
    }
    public void q3(){
        Group group_a = new Group();
        System.out.println("Câu a: " + group_a.toString());
        Group group_b = new Group("Groupb", new Account(), LocalDate.of(2022, 3, 4), new ArrayList<Account>());
        System.out.println("Câu b: " + group_b);
        String[] usernames = {"Account 1", "Account 2"};
        Group group_c = new Group("Groupc", new Account(), LocalDate.of(2022, 3, 4), usernames);
        System.out.println("Câu c: " + group_c);
    }
}
