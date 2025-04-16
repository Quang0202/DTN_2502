package Exercise2.entity;

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
            if (scanner.hasNextDouble()) {
                try {
                    return scanner.nextDouble();
                }
                catch (Exception e) {
                    System.out.println(errorMessage);
                }
            } else scanner.nextLine();
        }
    }

    public String inputString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
