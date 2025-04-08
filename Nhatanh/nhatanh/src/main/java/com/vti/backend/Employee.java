package com.vti.backend;

public class Employee extends User{
    @Override
    public double calculatePay() {
        return (420 * super.getSalaryRatio());
    }
}
