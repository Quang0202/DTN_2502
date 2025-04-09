package com.vti.entity;

public abstract class User {
    private String name;
    private Double salaryRatio;

    public User(String name, Double salaryRatio) {
        this.name = name;
        this.salaryRatio = salaryRatio;
    }

    public abstract double calculatePay();

    public void displayInfor() {
        System.out.println("Name: " + name);
        System.out.println("Salary Ratio: " + salaryRatio);
        System.out.println("Income: " + calculatePay());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalaryRatio() {
        return salaryRatio;
    }

    public void setSalaryRatio(Double salaryRatio) {
        this.salaryRatio = salaryRatio;
    }
}
