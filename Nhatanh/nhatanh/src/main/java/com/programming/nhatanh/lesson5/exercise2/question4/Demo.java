package com.programming.nhatanh.lesson5.exercise2.question4;

import java.text.ParseException;

public class Demo {
    public static void main(String[] args) throws ParseException {
    MyMath myMath = new MyMath();

    int one = 12;
    int two = 23;
    System.out.println(myMath.sum(one, two));
    byte number = 33;
    byte number2 = 49;
    System.out.println(myMath.sum(number, number2));
    float number3 = 44f;
    float number4 = 82f;
    System.out.println(myMath.sum(number3, number4));
    }


}
