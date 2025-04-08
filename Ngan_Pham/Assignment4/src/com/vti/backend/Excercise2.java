package com.vti.backend;

import com.vti.entity.Account;
import com.vti.entity.Position;

import java.time.LocalDate;

public class Excercise2 {
    public void excercise2(){
        Account account1 = new Account();
        Account account2 = new Account(1,"chun@gmail.com","Chun Hieu","Chun","Hieu");
        Account account3 = new Account(2, "hieu@gmail.com", "Hieu Chun", "Hieu", "Chun", new Position(1,"sale"));
        Account account4 = new Account(3,"trang@gmail.com","Trang","Dai","Trang", LocalDate.of(2025, 10,10),new Position(1,"marketing"));
        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3);
        System.out.println(account4);
    }
}
