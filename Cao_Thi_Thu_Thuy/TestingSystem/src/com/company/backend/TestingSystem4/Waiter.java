package com.company.backend.TestingSystem4;

public class Waiter extends User{
    public Waiter(String name, double salaryRatio) {
        this.name = name;
        this.salaryRatio = salaryRatio;
    }
    @Override
    public double calculatePay() {
        return salaryRatio * 220;
    }
}
