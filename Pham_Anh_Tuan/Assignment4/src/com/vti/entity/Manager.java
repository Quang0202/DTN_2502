package com.vti.entity;

public class Manager extends User {
    public Manager(String name, Double salaryRatio) {
        super(name, salaryRatio);
    }

    @Override
    public double calculatePay() {
        return getSalaryRatio() * 520;
    }
}
