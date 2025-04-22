package com.programming.nhatanh.lesson8.frontend;

import com.programming.nhatanh.lesson8.entity.StudentE3;

public class E3Q4 {

    public static <T> void print(T a){
        System.out.println(a);
    }

    public static void main(String[] args)  {
        StudentE3<Integer> newStudent1 = new StudentE3<>(1, "Nguyễn T");
        StudentE3<Float> newStudent2 = new StudentE3<>(2.5f, "Nguyễn W");
        StudentE3<Double> newStudent3 = new StudentE3<>(3.6, "Nguyễn A");

//        System.out.println(newStudent1);
//        System.out.println(newStudent2);
//        System.out.println(newStudent3);

        print(newStudent1);
        print(1);
        print("newStudent1");

    }
}
