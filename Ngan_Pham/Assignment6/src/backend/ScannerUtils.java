package backend;

import java.util.Scanner;

public class ScannerUtils {
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Nhập số nguyên int từ bàn phím.
     * Nếu nhập sai định dạng sẽ in ra errorMessage và yêu cầu nhập lại.
     *
     * @param errorMessage Thông báo lỗi hiển thị khi nhập sai.
     * @return Số nguyên hợp lệ.
     */

    // Method nhập int
    public static  int inputInt(String errorMessage) {
        while (true) {
            String input = scanner.nextLine().trim();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println(errorMessage);
                System.out.print("Mời bạn nhập lại: ");
            }
        }
    }

    // Method nhập float
    public static float inputFloat(String errorMessage) {
        while (true) {
            String input = scanner.nextLine().trim();
            try {
                return Float.parseFloat(input);
            } catch (NumberFormatException e) {
                System.out.println(errorMessage);
                System.out.print("Mời bạn nhập lại: ");
            }
        }
    }

    // Method nhập double
    public static double inputDouble(String errorMessage) {
        while (true) {
            String input = scanner.nextLine().trim();
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println(errorMessage);
                System.out.print("Mời bạn nhập lại: ");
            }
        }
    }

    // Method nhập String không cần xử lý lỗi
    public static String inputString() {
        return scanner.nextLine();
    }

    // Optional: nhập String kèm kiểm tra rỗng
    public static String inputString(String errorMessage) {
        while (true) {
            String input = scanner.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            }
            System.out.println(errorMessage);
            System.out.print("Mời bạn nhập lại: ");
        }
    }
}
