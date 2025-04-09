package com.programming.nhatanh.lesson5.exercise2.question2;

import com.vti.backend.Gender;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Person {

    private String name;
    private Gender gender;
    private String DoB;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getDoB() {
        return DoB;
    }

    public void setDoB(String doB) {
        DoB = doB;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person(String name, Gender gender, String doB, String address) {
        this.name = name;
        this.gender = gender;
        DoB = doB;
        this.address = address;
    }

    public Person() {
    }

    public void showInfo() {
        System.out.println("Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", DoB=" + DoB +
                ", address='" + address + '\'' +
                '}');
    }

    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên:");
        this.name = scanner.next();
        System.out.println("Nhập giới tính (MALE / FEMALE): ");
        this.gender = Gender.valueOf(scanner.next());
        System.out.println("Nhập ngày sinh:");
        this.DoB = scanner.next();
        System.out.println("Nhập địa chỉ:");
        this.address = scanner.next();
        scanner.close();

    }

}
