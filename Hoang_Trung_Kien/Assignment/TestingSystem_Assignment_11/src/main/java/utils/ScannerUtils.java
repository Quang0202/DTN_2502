package utils;

import java.util.Scanner;

public class ScannerUtils {
    public int inputInt(String errorMessage) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNextLine()) {
                try {
                    return Integer.parseInt(scanner.nextLine());
                }
                catch (NumberFormatException e) {
                    System.out.println(errorMessage);
                }
            }
        }
    }

    public float inputFloat(String errorMessage) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNextLine()) {
                try {
                    return Float.parseFloat(scanner.nextLine());
                }
                catch (NumberFormatException e) {
                    System.out.println(errorMessage);
                }
            }
        }
    }

    public double inputDouble(String errorMessage) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNextLine()) {
                try {
                    return Double.parseDouble(scanner.nextLine());
                }
                catch (NumberFormatException e) {
                    System.out.println(errorMessage);
                }
            }
        }
    }

    public String inputString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public String inputEmail() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap email cua ban:");
        while (true) {
            if (scanner.hasNextLine()) {
                String e = scanner.nextLine();
                if (e.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]+")) {
                    return e;
                } else {
                    System.out.println("Vui long nhap email hop le.");
                }
            }
        }
    }
}
