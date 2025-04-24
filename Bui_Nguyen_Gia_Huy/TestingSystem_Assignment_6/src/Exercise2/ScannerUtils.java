//Question 7 and 8
package Exercise2;

import java.util.Scanner;

public class ScannerUtils {
    private static Scanner scanner = new Scanner(System.in);

    public static int inputInt(String errorMessage) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (Exception e) {
                System.out.println(errorMessage);
            }
        }
    }

    public static float inputFloat(String errorMessage) {
        while (true) {
            try {
                return Float.parseFloat(scanner.nextLine().trim());
            } catch (Exception e) {
                System.out.println(errorMessage);
            }
        }
    }

    public static double inputDouble(String errorMessage) {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine().trim());
            } catch (Exception e) {
                System.out.println(errorMessage);
            }
        }
    }

    public static String inputString() {
        return scanner.nextLine();
    }
}
