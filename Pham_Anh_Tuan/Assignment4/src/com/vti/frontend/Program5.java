package com.vti.frontend;

import com.vti.backend.Exercise5;

import java.util.Scanner;

public class Program5 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Exercise5 exercise5 = new Exercise5();
//        exercise5.question1();
        while (true) {
            System.out.println("\n===== QUẢN LÝ CÁN BỘ =====");
            System.out.println("1. Thêm cán bộ");
            System.out.println("2. Tìm kiếm cán bộ theo họ tên");
            System.out.println("3. Hiển thị danh sách cán bộ");
            System.out.println("4. Xóa cán bộ theo họ tên");
            System.out.println("5. Thoát chương trình");
            System.out.print("Chọn chức năng: ");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    exercise5.themCanBo();
                    break;
                case 2:
                    exercise5.timKiemTheoTen();
                    break;
                case 3:
                    exercise5.hienThiDanhSach();
                    break;
                case 4:
                    exercise5.xoaCanBo();
                    break;
                case 5:
                    exercise5.thoat();
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn lại.");
            }
        }
    }

}
