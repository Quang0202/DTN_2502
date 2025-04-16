package entity;

import java.util.Scanner;

public class ScannerUtils {
    private static Scanner scanner = new Scanner(System.in);

    public static int inputInt(String message) {
        System.out.print(message);
        while (!scanner.hasNextInt()) {
            System.out.print("Vui lòng nhập số nguyên: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static float inputFloat(String message) {
        System.out.print(message);
        while (!scanner.hasNextFloat()) {
            System.out.print("Vui lòng nhập số thực: ");
            scanner.next();
        }
        return scanner.nextFloat();
    }

    public static String inputString(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    // Thêm các phương thức khác nếu cần
}