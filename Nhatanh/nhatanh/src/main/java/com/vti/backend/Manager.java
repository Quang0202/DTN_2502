package com.vti.backend;

public class Manager extends User{
    @Override
    public double calculatePay() {
        return (520 * super.getSalaryRatio());
    }
}
