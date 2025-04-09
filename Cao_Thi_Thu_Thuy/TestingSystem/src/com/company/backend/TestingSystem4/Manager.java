package com.company.backend.TestingSystem4;

public class Manager extends User{
    public Manager(String name, double salaryRatio) {
        super(name, salaryRatio);
    }

    @Override
    public double calculatePay() {
        return getSalaryRatio() * 520;
    }
}
