package com.vti.entity;

public class Waiter extends User {
    public Waiter(String name, Double salaryRatio) {
        super(name, salaryRatio);
    }

    @Override
    public double calculatePay() {
        return getSalaryRatio() * 220;
    }
}
