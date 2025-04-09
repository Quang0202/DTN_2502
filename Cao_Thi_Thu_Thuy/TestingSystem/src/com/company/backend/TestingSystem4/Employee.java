package com.company.backend.TestingSystem4;

public class Employee extends User{
    public Employee(String name, double salaryRatio) {
        this.name = name;
        this.salaryRatio = salaryRatio;
    }
    @Override
    public double calculatePay() {
        return salaryRatio * 420;
    }
}
