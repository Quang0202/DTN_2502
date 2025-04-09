package com.vti.entity;

import java.util.StringJoiner;

public abstract class User {
    protected String name;
    protected double salaryRadio;

    public User(String name, double salaryRadio) {
        this.name = name;
        this.salaryRadio = salaryRadio;
    }
    public abstract double getSalary();

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary Ratio: " + salaryRadio);
        System.out.println("Salary: " + getSalary());
    }
}
