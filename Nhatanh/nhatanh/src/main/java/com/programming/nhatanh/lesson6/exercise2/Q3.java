package com.programming.nhatanh.lesson6.exercise2;

public class Q3 {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[10]);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
