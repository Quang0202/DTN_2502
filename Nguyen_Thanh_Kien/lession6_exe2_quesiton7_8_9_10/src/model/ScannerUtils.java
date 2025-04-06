package model;

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
