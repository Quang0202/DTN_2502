package com.vti.entity;

import java.util.Scanner;

public class Person {
    protected String name;
    protected String gender;
    protected String birthDate;
    protected String address;

    public Person() {}

    public Person(String name, String gender, String birthDate, String address) {
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.address = address;
    }

    public void inputInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        name = scanner.nextLine();
        System.out.print("Nhập giới tính: ");
        gender = scanner.nextLine();
        System.out.print("Nhập ngày sinh: ");
        birthDate = scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        address = scanner.nextLine();
    }

    public void showInfo(){
        System.out.println("Tên: " + name);
        System.out.println("Giới tính: " + gender);
        System.out.println("Ngày sinh: " + birthDate);
        System.out.println("Địa chỉ: " + address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
