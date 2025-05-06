package com.vti.frontend;

import com.vti.backend.TuyenSinh;
import java.util.Scanner;

public class Pro1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TuyenSinh ts = new TuyenSinh();


        while (true) {
            System.out.println("\n=== MENU TUYỂN SINH ===");
            System.out.println("1. Thêm mới thí sinh");
            System.out.println("2. Hiển thị thông tin thí sinh");
            System.out.println("3. Tìm kiếm theo số báo danh");
            System.out.println("4. Thoát");
            System.out.print("Chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> ts.themThiSinh();
                case 2 -> ts.hienThiThiSinh();
                case 3 -> ts.timKiemTheoSBD();
                case 4 -> {
                    System.out.println("Thoát chương trình.");
                    return;
                }
                default -> System.out.println("Chọn sai. Vui lòng chọn lại.");
            }
        }
    }
}
