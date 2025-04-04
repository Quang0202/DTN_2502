package com.vti.frontend;

import com.vti.backend.QuanLySach;
import com.vti.entity.Bao;
import com.vti.entity.Sach;
import com.vti.entity.TapChi;

import java.util.Scanner;

public class Pro_5_4 {
    public static void main(String[] args) {
        QuanLySach quanLySach = new QuanLySach();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Thêm mới tài liệu");
            System.out.println("2. Xoá tài liệu theo mã");
            System.out.println("3. Hiển thị tất cả tài liệu");
            System.out.println("4. Tìm kiếm theo loại");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");
            int choi = scanner.nextInt();
            switch (choi) {
                case 1:
                    quanLySach.themTaiLieu();
                    break;
                case 2:
                    System.out.println("Nhập mã tài liệu cần xóa");
                    String ma = scanner.nextLine();
                    quanLySach.xoaTaiLieu(ma);
                    break;
                case 3:
                    quanLySach.hienThiThongTin();
                    break;
                case 4:
                    System.out.println("1. Sách | 2. Tạp chí | 3. Báo");
                    int loai = Integer.parseInt(scanner.nextLine());
                    if (loai == 1) {
                        quanLySach.timKiemTheoLoai(Sach.class);
                    } else if (loai == 2) {
                        quanLySach.timKiemTheoLoai(TapChi.class);
                    } else if (loai == 3) {
                        quanLySach.timKiemTheoLoai(Bao.class);
                    }
                    break;
                case 5:
                    System.out.println("Thoát chương trình");
                    return;
                    default:
                        System.out.println("Lựa chọn ko phù hợp");
            }
        }
    }
}
