package com.company.exercise.TestingSystem3;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        q4();
    }
    private static void q1(){
        float salary1 = 5240.5f;
        float salary2 = 10970.055f;
        int intSalary1 = (int) salary1;
        int intSalary2 = (int) salary2;
        System.out.printf("Lương của account 1 là: %d", intSalary1);
        System.out.println();
        System.out.printf("Lương của account 2 là: %d", intSalary2);
    }
    private static void q2(){
        int n = 445;
        String str = String.valueOf(n);
        if (str.length() < 5){
            str = "0".repeat(5 - str.length()) + str;
        }
        System.out.println(str);
    }
    private static void q3(){
        int n = 445;
        int haiSoCuoi = n % 100;
        System.out.printf("Hai chữ số cuối của %d là %d", n, haiSoCuoi);
    }
    private static void q4(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 2 số a và b: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        float c = (float) a/b;
        System.out.printf("Kết quả: %.2f", c);
    }
}
