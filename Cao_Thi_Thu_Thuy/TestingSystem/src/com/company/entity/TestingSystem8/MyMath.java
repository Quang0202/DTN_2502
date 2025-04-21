package com.company.entity.TestingSystem8;

public class MyMath <T extends Number>{
    public double sum(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }
    public double sum(T a, T b, T c) {
        return a.doubleValue() + b.doubleValue() + c.doubleValue();
    }
    public double sum(T a, T b, T c, T d) {
        return a.doubleValue() + b.doubleValue() + c.doubleValue() + d.doubleValue();
    }
    public double subtract(T a, T b) {
        return a.doubleValue() - b.doubleValue();
    }
    public double power(T base, T exponent) {
        return Math.pow(base.doubleValue(), exponent.doubleValue());
    }
}
