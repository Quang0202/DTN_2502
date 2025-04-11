package com.programming.nhatanh.lesson6.exercise2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        System.out.println(inputAge());
    }

    public static int inputAge() {
        Scanner scanner = new Scanner(System.in);
        int age = -1;

        while (true) {
            System.out.print("Nhập tuổi: ");
            String input = scanner.nextLine();
            try {
                age = Integer.parseInt(input);
                if (age > 0) {
                    return age;
                } else {
                    System.out.println("Wrong inputing! The age must be greater than 0, please input again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Wrong inputing! Please input an age as int, input again.");
            }
        }
    }


}
