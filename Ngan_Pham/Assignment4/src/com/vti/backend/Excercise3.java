package com.vti.backend;

import com.vti.entity.Account;
import com.vti.entity.Group;

import java.time.LocalDate;

public class Excercise3 {
    public void Excercise3() {
        Account creator = new Account(4, "porche@gmail.com", "porche", "Por", "che");
        Account[] member = {
                new Account(5, "aston@gmail.com", "aston", "as", "ton"),
                new Account(6, "lexus@gmail.com", "lexus", "le", "xus")
        };
        String[] usernames = {"Ethan", "Pes"};
        Group group1 = new Group();
        Group group2 = new Group("Group2",creator,member, LocalDate.of(2020,10,10));
        Group group3 = new Group("Group3",creator,usernames,LocalDate.of(2020,10,10));
        System.out.println(group1);
        System.out.println(group2);
        System.out.println(group3);
    }
}
