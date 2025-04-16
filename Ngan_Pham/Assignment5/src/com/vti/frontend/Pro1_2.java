package com.vti.frontend;

import com.vti.backend.TuyenSinh;

import java.util.Scanner;

public class Pro1_2 {
    public static void main(String[] args) {
        TuyenSinh ts = new TuyenSinh();
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("--- MENU TUYỂN SINH ---");
            System.out.println("1. Thêm thí sinh");
            System.out.println("2. Hiển thị danh sách thí sinh");
            System.out.println("3. Tìm kiếm theo số báo danh");
            System.out.println("4. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    ts.addThiSinh();
                    break;
                case 2:
                    ts.showThiSinh();
                    break;
                case 3:
                    System.out.print("Nhập số báo danh cần tìm: ");
                    int sbd = Integer.parseInt(scanner.nextLine());
                    ts.timKiem(sbd);
                    break;
                case 4:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}
