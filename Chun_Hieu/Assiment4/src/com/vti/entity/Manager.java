package com.vti.entity;

public class Manager  extends User{

    public Manager(String name, double salaryRadio) {
        super(name, salaryRadio);
    }

    @Override
    public double getSalary() {
        return salaryRadio * 520;
    }
}
