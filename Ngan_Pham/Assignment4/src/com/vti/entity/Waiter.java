package com.vti.entity;

public class Waiter extends User{

    public Waiter(String name, double salaryRadio) {
        super(name, salaryRadio);
    }

    @Override
    public double getSalary() {
        return salaryRadio * 220;
    }
}
