package com.entity;

import java.util.Scanner;

public class Person {
    private String name;
    private String gender;
    private String birthDate;
    private String address;

    public Person() {
    }

    public Person(String name, String gender, String birthDate, String address) {
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        name = sc.nextLine();
        System.out.print("Nhập giới tính: ");
        gender = sc.nextLine();
        System.out.print("Nhập ngày sinh (dd/mm/yyyy): ");
        birthDate = sc.nextLine();
        System.out.print("Nhập địa chỉ: ");
        address = sc.nextLine();
    }

    public void showInfo() {
        System.out.println("Tên: " + name);
        System.out.println("Giới tính: " + gender);
        System.out.println("Ngày sinh: " + birthDate);
        System.out.println("Địa chỉ: " + address);
    }
}
