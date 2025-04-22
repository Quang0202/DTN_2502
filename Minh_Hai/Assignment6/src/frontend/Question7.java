package frontend;

import backend.ScannerUtils;

public class Question7 {
    public static void main(String[] args) {
        ScannerUtils scannerUtils = new ScannerUtils();
        System.out.print("Nhập tuổi: ");
        int age = scannerUtils.inputInt("Sai định dạng! Vui lòng nhập số nguyên.");
        System.out.println("Tuổi bạn vừa nhập là: " + age);

        System.out.print("Nhập ID: ");
        int id = scannerUtils.inputInt("ID phải là số nguyên!");
        System.out.println("ID bạn vừa nhập là: " + id);
    }
}
