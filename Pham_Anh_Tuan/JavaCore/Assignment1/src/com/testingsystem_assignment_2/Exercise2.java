package com.testingsystem_assignment_2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercise2 {
    public static void main(String[] args) {
        question1();
        question2();
        question3();
        question4();
        question5();
        question6();
    }


    public static void question1(){
        int num1 = 5;
        System.out.printf("Số nguyên: %d%n", num1);
        System.out.println();

    }
    public static void question2(){
        int num2 = 100000000;
        System.out.printf("Số nguyên có định dạng: %,d%n", num2);
        System.out.println();

    }
    public static void question3(){
        double num3 = 5.567098;
        System.out.printf("Số thực với 4 chữ số thập phân: %.4f%n", num3);
        System.out.println();

    }
    public static void question4(){
        String fullName = "Nguyễn Văn A";
        System.out.printf("Tên tôi là \"%s\" và tôi đang độc thân.%n", fullName);
        System.out.println();

    }
    public static void question5(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH'h':mm'p':ss's'");
        Date now = new Date();
        System.out.printf("Thời gian hiện tại: %s%n", dateFormat.format(now));
        System.out.println();
    }
    public static void question6(){

    }
}
