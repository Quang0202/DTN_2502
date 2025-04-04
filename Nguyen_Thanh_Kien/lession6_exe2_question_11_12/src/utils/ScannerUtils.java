package utils;

import java.util.Scanner;

public class ScannerUtils {
    public static int inputInt(String errorMessage) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println(errorMessage);
            }
        }
    }

    public static int inputAge() throws InvalidAgeInputingException {
        while(true) {
            int age = inputInt("Please input number as integer");
            try {
                inputAccountAge(age);
                return age;
            } catch (InvalidAgeInputingException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void inputAccountAge(int age) throws InvalidAgeInputingException {
        if (age <= 0) {
            throw new InvalidAgeInputingException("The age must be greater than 0");
        }
        if (age < 18) {
            throw new InvalidAgeInputingException("Your age must be greater than 18");
        }
    }

    public static float inputFloat(String errorMessage) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            try {
                return Float.parseFloat(input);
            } catch (NumberFormatException e) {
                System.out.println(errorMessage);
            }
        }
    }

    public static Double inputDouble(String errorMessage) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println(errorMessage);
            }
        }
    }

    public static String inputString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
