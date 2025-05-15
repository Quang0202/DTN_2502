package com.vti.entity;

public class Employee extends User {
    public Employee(String name, Double salaryRatio) {
        super(name, salaryRatio);
    }

    @Override
    public double calculatePay() {
        return getSalaryRatio() * 420;
    }
}
