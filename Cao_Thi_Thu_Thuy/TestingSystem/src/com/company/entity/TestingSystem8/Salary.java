package com.company.entity.TestingSystem8;

public class Salary <N extends Number>{
    private N salary;

    public Salary(N salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "salary=" + salary +
                '}';
    }
}
