package com.company.backend.TestingSystem4;

public class Employee extends User{
    public Employee(String name, double salaryRatio) {
        super(name, salaryRatio);
    }
    @Override
    public double calculatePay() {
        return getSalaryRatio() * 420;
    }
}
