package com.vti.abstraction;

public class Manager extends User {
    public Manager(String name, double salaryRatio) {
        super(name, salaryRatio);
    }

    @Override
    public void calculatePay() {
        System.out.println("Luong = " + getSalaryRatio() * 520);
    }
}
