package com.fontend;

import com.backend.TuyenSinh;

import java.util.Scanner;

public class TuyenSinhFE {
    public static void main(String[] args) {
        TuyenSinh ts = new TuyenSinh();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("========= MENU =========");
            System.out.println("1. Thêm mới thí sinh");
            System.out.println("2. Hiển thị thông tin thí sinh");
            System.out.println("3. Tìm kiếm theo số báo danh");
            System.out.println("4. Thoát");
            System.out.print("Chọn: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    ts.themThiSinh();
                    break;
                case 2:
                    ts.hienThiThongTin();
                    break;
                case 3:
                    System.out.print("Nhập SBD cần tìm: ");
                    String sbd = sc.nextLine();
                    ts.timKiemTheoSBD(sbd);
                    break;
                case 4:
                    System.out.println("==> Thoát chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }

        } while (choice != 4);
    }
}
