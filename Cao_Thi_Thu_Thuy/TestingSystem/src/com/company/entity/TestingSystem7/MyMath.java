package com.company.entity.TestingSystem7;

public class MyMath {
    private static final double PI = 3.14;
    public static <T extends Number & Comparable<T>> T max(T a, T b){
        return (a.compareTo(b) > 0) ? a : b;
    }
    public static <T extends Number & Comparable<T>> T min(T a, T b){
        return (a.compareTo(b) < 0) ? a : b;
    }
    public static <T extends Number> double sum(T a, T b){
        return a.doubleValue() + b.doubleValue();
    }
    public static double sum(int a){
        return a + PI;
    }
}
