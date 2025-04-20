package com.company.entity.TestingSystem7;

public class MyMath {
    private static final double PI = 3.14;
//    public static <T extends Number & Comparable<T>> T max(T a, T b){
//        return (a.compareTo(b) > 0) ? a : b;
//    }
//    public static <T extends Number & Comparable<T>> T min(T a, T b){
//        return (a.compareTo(b) < 0) ? a : b;
//    }
//    public static <T extends Number> double sum(T a, T b){
//        return a.doubleValue() + b.doubleValue();
//    }

    public static int max(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }
    public static double max(double a, double b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }

    public static int min(int a, int b) {
        return (a>=b)? b : a;
    }

    public static double sum(double a, double b) {
        return a+b;
    }

    public static double sum(int a) {
        return a + PI;
    }
}
