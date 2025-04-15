package com.vti.entity;

public class Employee extends User{


    public Employee(String name, double salaryRadio) {
        super(name, salaryRadio);
    }

    @Override
    public double getSalary() {
        return salaryRadio * 420;
    }
}
