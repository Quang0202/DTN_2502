import java.util.Scanner;

public class ScannerUtils {
    public static int inputInt(String errorMessage) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Nhap vao 1 so nguyen: ");
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
            System.out.println("Nhap vao 1 so float: ");
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
            System.out.println("Nhap vao 1 so double: ");
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
        System.out.println("Nhap vao 1 chuoi: ");
        return scanner.nextLine();
    }
}
