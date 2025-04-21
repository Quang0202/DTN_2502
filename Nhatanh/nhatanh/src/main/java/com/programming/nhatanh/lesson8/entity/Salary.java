package com.programming.nhatanh.lesson8.entity;

public class Salary<N extends Number> {

    private N salary;

    private void setSalary(N salary) {
        this.salary = salary;
    }

    public N getSalary() {
        return salary;
    }
}
