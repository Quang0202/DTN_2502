package com.vti.abstraction;

public class Waiter extends User {
    public Waiter(String name, double salaryRatio) {
        super(name, salaryRatio);
    }

    @Override
    public void calculatePay() {
        System.out.println("Luong = " + getSalaryRatio() * 220);
    }
}
