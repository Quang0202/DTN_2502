package com.testingsystem_assignment_2;

import com.testingsystem_assignment_1.Account;
import com.testingsystem_assignment_1.Department;

public class Exercise6 {
    public static void main(String[] args) {

        Department[] departments = {
                new Department(1, "Dev" ),
                new Department(2, "Test" ),
                new Department(3,"BA"  )
        };

        Account[] accounts = {
                new Account(1, "user1", "user1@example.com", departments[2] ),
                new Account(2, "user2", "user2@example.com",departments[1] ),
                new Account(3, "user3", "user3@example.com",departments[0] )
        };
        question1();
        question2(accounts);
        question3();
    }
    //Question 1: Tạo method để in ra các số chẵn nguyên dương nhỏ hơn 10
    public static void question1(){
        System.out.println("Question 1: Tạo method để in ra các số chẵn nguyên dương nhỏ hơn 10");
        for (int i = 0 ; i <= 10 ; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
    //Question 2: Tạo method để in thông tin các account
    public static void question2(Account[] accounts){
        System.out.println("Question 2: Tạo method để in thông tin các account");
        for (Account acc: accounts) {
            System.out.println(acc);
        }
    }
    //Question 3: Tạo method để in ra các số nguyên dương nhỏ hơn 10
    public static void question3(){
        System.out.println("Question 3: Tạo method để in ra các số nguyên dương nhỏ hơn 10");
        for (int i = 0 ; i < 10 ; i++){
            System.out.println(i);
        }
    }
}
