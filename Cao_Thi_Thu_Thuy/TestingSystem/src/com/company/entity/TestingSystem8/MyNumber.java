package com.company.entity.TestingSystem8;

public class MyNumber <N extends Number>{
    public static <T extends Number & Comparable<T>> T max(T a, T b) {
        return (a.compareTo(b) >= 0) ? a : b;
    }
}
