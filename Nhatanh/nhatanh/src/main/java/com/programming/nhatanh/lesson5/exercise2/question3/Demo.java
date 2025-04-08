package com.programming.nhatanh.lesson5.exercise2.question3;

import com.programming.nhatanh.lesson5.exercise2.question1.Student;

import java.text.ParseException;

public class Demo {
    public static void main(String[] args) throws ParseException {

        HinhChuNhat HCN = new HinhChuNhat(10, 5);
        HinhVuong HV = new HinhVuong(20);
        HCN.area();
        HV.area();

    }
}
