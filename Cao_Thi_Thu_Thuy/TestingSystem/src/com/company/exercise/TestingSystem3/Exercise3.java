package com.company.exercise.TestingSystem3;

public class Exercise3 {
    public static void main(String[] args) {
        q3();
    }
    private static void q1(){
        Integer n = 5000;
        float f = n.intValue();
        System.out.printf("%.2f", f);
    }
    private static void q2(){
        String value = "1234567";
        int intValue = Integer.valueOf(value);
        System.out.println(intValue);
    }
    private static void q3(){
        Integer value = 1234567;
        int intValue = Integer.valueOf(value);
        System.out.println(intValue);
    }
}
