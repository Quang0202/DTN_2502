package com.vti.frontend;

import com.vti.backend.QuanLyCanBo;

import java.util.Scanner;

public class Pro_5 {
    public static void main(String[] args) {
        QuanLyCanBo quanLyCanBo = new QuanLyCanBo();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Them moi can bo");
            System.out.println("2. Tim kiem theo ho ten");
            System.out.println("3. Hien thi thong tin can bo");
            System.out.println("4. Xoa can bo");
            System.out.println("5. Thoat");

            int choi = sc.nextInt();
            switch (choi) {
                case 1:
                    quanLyCanBo.themCanBo();
                    break;
                 case 2:
                     System.out.println("Nhập tên cần tìm: ");
                     String ten = sc.nextLine();
                     quanLyCanBo.timKiemTheoTen(ten);
                     break;
                case 3:
                    quanLyCanBo.hienThiDanhSach();
                    break;
                case 4:
                    System.out.println("Nhập tên cán bộ cần xóa: ");
                    String x = sc.nextLine();
                    quanLyCanBo.xoaCanBo(x);
                    break;
                case 5:
                        System.out.println("Đã thoát chương trình");
                        return;
                default :
                        System.out.println("Lựa chọn sai");
            }
        }
    }
}
