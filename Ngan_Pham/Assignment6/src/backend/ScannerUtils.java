package backend;

import java.util.Scanner;

public class ScannerUtils {
    private static Scanner scanner = new Scanner(System.in);

    public static   int inputInt(String errorMessage) {
        while (true) {
            String input = scanner.nextLine();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println(errorMessage);
                System.out.print("Mời bạn nhập lại: ");
            }
        }
    }

    // Nhập float
    public static float inputFloat(String errorMessage) {
        while (true) {
            String input = scanner.nextLine();
            try {
                return Float.parseFloat(input);
            } catch (NumberFormatException e) {
                System.out.println(errorMessage);
                System.out.print("Mời bạn nhập lại: ");
            }
        }
    }

    // Nhập double
    public static double inputDouble(String errorMessage) {
        while (true) {
            String input = scanner.nextLine();
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println(errorMessage);
                System.out.print("Mời bạn nhập lại: ");
            }
        }
    }

    // Nhập chuỗi (không cần xử lý ngoại lệ)
    public static String inputString() {
        return scanner.nextLine();
    }

    public static String inputString(String errorMessage) {
        String input = scanner.nextLine();
        if (input.isEmpty()) {
            System.out.println(errorMessage);
            return inputString(errorMessage);
        }
        return input;
    }
}
