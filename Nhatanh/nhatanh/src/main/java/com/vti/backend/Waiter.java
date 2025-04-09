package com.vti.backend;

public class Waiter extends User{
    @Override
    public double calculatePay() {
        return (220 * super.getSalaryRatio());
    }
}
