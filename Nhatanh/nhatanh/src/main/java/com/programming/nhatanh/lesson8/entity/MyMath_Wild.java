package com.programming.nhatanh.lesson8.entity;

public class MyMath_Wild<T extends Number> {

    public void sum(T a, Object... b){
        double total = a.doubleValue();

        for (Object obj : b) {
            if (obj instanceof Number) {
                total += ((Number) obj).doubleValue();
            }
        }
        System.out.println(total);
    }

    public void subtract(T a, Object... b){
        double total = a.doubleValue();

        for (Object obj : b) {
            if (obj instanceof Number) {
                total -= ((Number) obj).doubleValue();
            }
        }
        System.out.println(total);
    }

    public void somu(T a, T b){
        if (b.doubleValue() == 0) {
            System.out.println(1);
            return;
        }

        System.out.println(Math.pow(a.doubleValue(), b.doubleValue()));


    }

}
