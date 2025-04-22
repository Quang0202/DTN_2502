package frontend;

import backend.ScannerUtils;

public class Question8 {
    public static void main(String[] args) {
        System.out.print("Nhập chiều cao (float): ");
        float height = ScannerUtils.inputFloat("Chiều cao phải là số thực (float)!");
        System.out.println("Chiều cao: " + height);

        System.out.print("Nhập lương (double): ");
        double salary = ScannerUtils.inputDouble("Lương phải là số thực (double)!");
        System.out.println("Lương: " + salary);

        System.out.print("Nhập tên của bạn: ");
        String name = ScannerUtils.inputString();
        System.out.println("Tên bạn là: " + name);
    }
}
