package com.programming.nhatanh.lesson6.exercise2.entity;

import java.util.Scanner;

public class ScannerUtils {
    public int inputInt(String errorMessage){
        Scanner scanner = new Scanner(System.in);
        int returnValue = -1;

        while (true) {
            System.out.print("Input int: ");
            String input = scanner.nextLine();
            try {
                returnValue = Integer.parseInt(input);
                return returnValue;
            } catch (NumberFormatException e) {
                System.out.println(errorMessage);
            }
        }
    }

    public float inputFloat(String errorMessage){
        Scanner scanner = new Scanner(System.in);
        float returnValue = -1;

        while (true) {
            System.out.print("Input float:  ");
            String input = scanner.nextLine();
            try {
                returnValue = Float.parseFloat(input);
                return returnValue;
            } catch (NumberFormatException e) {
                System.out.println(errorMessage);
            }
        }
    }

    public String inputString(){
        System.out.print("Input String: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public double inputDouble(String errorMessage){
        Scanner scanner = new Scanner(System.in);
        double returnValue = -1;

        while (true) {
            System.out.print("Input double: ");
            String input = scanner.nextLine();
            try {
                returnValue = Double.parseDouble(input);
                return returnValue;
            } catch (NumberFormatException e) {
                System.out.println(errorMessage);
            }
        }
    }

}
