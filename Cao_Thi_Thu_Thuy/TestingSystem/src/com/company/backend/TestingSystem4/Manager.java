package com.company.backend.TestingSystem4;

public class Manager extends User{
    public Manager(String name, double salaryRatio) {
        this.name = name;
        this.salaryRatio = salaryRatio;
    }

    @Override
    public double calculatePay() {
        return salaryRatio * 520;
    }
}
