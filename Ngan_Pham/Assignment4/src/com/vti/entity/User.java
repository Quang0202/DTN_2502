package com.vti.entity;

public abstract class User {
    private String name;
    private double salaryRatio;

    public User(String name, double salaryRatio) {
        this.name = name;
        this.salaryRatio = salaryRatio;
    }

    public String getName() {
        return name;
    }

    public double getSalaryRatio() {
        return salaryRatio;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalaryRatio(double salaryRatio) {
        this.salaryRatio = salaryRatio;
    }

    // abstract method
    public abstract double calculatePay();

    public void displayInfor() {
        System.out.println("Tên: " + name);
        System.out.println("Hệ số lương: " + salaryRatio);
        System.out.println("Lương: " + calculatePay());
    }
}
