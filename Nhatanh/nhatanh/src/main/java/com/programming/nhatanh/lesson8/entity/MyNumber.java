package com.programming.nhatanh.lesson8.entity;

public class MyNumber<N extends Number> {

    public N getMax(N num1, N num2){
        if((num1.doubleValue() >=  num2.doubleValue())){
            return num1;
        }
        return num2;

    }

}
