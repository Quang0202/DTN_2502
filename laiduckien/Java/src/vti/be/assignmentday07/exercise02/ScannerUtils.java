package vti.be.assignmentday07.exercise02;

import java.util.Scanner;

public class ScannerUtils {
    public static int InputInt() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input: ");
        String input = sc.nextLine(); int number = Integer.parseInt(input);
        while (true) {
            try {
                if (number <= 0) {
                    throw new Exception("Age must be greater than 0, please input again.");
                }
                return number;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    };


    public static float InputFloat() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input: ");
        String input = sc.nextLine(); float number = Float.parseFloat(input);
        while (true) {
            try {
                if (number <= 0) {
                    throw new Exception("Age must be greater than 0, please input again.");
                }
                return number;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    };



    public static double InputDouble() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input: ");
        String input = sc.nextLine(); double number = Double.parseDouble(input);
        while (true) {
            try {
                if (number <= 0) {
                    throw new Exception("Age must be greater than 0, please input again.");
                }
                return number;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    };


    public static String InputString() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input: ");
        String number = sc.nextLine();
        return number;



    };

}
