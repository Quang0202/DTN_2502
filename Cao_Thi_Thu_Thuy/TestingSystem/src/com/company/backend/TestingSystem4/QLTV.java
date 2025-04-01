package com.company.backend.TestingSystem4;

import java.util.ArrayList;
import java.util.Scanner;

public class QLTV {
    private ArrayList<TaiLieu> danhSachTaiLieu = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // a) Thêm tài liệu mới
    public void themTaiLieu() {
        System.out.println("Chọn loại tài liệu:");
        System.out.println("1. Sách");
        System.out.println("2. Tạp chí");
        System.out.println("3. Báo");

        int choice;
        while(true){
            if(scanner.hasNextInt()){
                choice = scanner.nextInt();
                if (choice >= 1 && choice <= 3) {
                    scanner.nextLine();
                    break;
                } else {
                    System.out.print("Lựa chọn không hợp lệ, mời nhập lại: ");
                }
            } else {
                System.out.print("Mời nhập lại: ");
                scanner.next();
            }
        }

        System.out.print("Nhập mã tài liệu: ");
        String maTaiLieu = scanner.nextLine();
        System.out.print("Nhập tên nhà xuất bản: ");
        String tenNhaXuatBan = scanner.nextLine();
        System.out.print("Nhập số bản phát hành: ");
        int soBanPhatHanh = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Nhập tên tác giả: ");
                String tenTacGia = scanner.nextLine();
                System.out.print("Nhập số trang: ");
                int soTrang = scanner.nextInt();
                danhSachTaiLieu.add(new Sach(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, tenTacGia, soTrang));
                break;
            case 2:
                System.out.print("Nhập số phát hành: ");
                int soPhatHanh = scanner.nextInt();
                System.out.print("Nhập tháng phát hành: ");
                int thangPhatHanh = scanner.nextInt();
                danhSachTaiLieu.add(new TapChi(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, soPhatHanh, thangPhatHanh));
                break;
            case 3:
                System.out.print("Nhập ngày phát hành: ");
                String ngayPhatHanh = scanner.next();
                danhSachTaiLieu.add(new Bao(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, ngayPhatHanh));
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
        }
    }

    // b) Xóa tài liệu theo mã
    public void xoaTaiLieu() {
        System.out.print("Nhập mã tài liệu cần xóa: ");
        String maTaiLieu = scanner.next();
        boolean removed = danhSachTaiLieu.removeIf(tl -> tl.getMaTaiLieu().equals(maTaiLieu));
        if (removed) {
            System.out.println("Xóa thành công!");
        } else {
            System.out.println("Không tìm thấy tài liệu.");
        }
    }

    // c) Hiển thị danh sách tài liệu
    public void hienThiDanhSach() {
        if (danhSachTaiLieu.isEmpty()) {
            System.out.println("Danh sách tài liệu trống.");
        } else {
            for (TaiLieu tl : danhSachTaiLieu) {
                tl.hienThiThongTin();
                System.out.println("------------------");
            }
        }
    }

    // d) Tìm kiếm tài liệu theo loại
    public void timKiemTaiLieu() {
        System.out.println("Nhập loại tài liệu cần tìm (Sach/TapChi/Bao): ");
        String loai = scanner.next();
        boolean found = false;

        for (TaiLieu tl : danhSachTaiLieu) {
            if ((loai.equalsIgnoreCase("Sach") && tl instanceof Sach) ||
                    (loai.equalsIgnoreCase("TapChi") && tl instanceof TapChi) ||
                    (loai.equalsIgnoreCase("Bao") && tl instanceof Bao)) {
                tl.hienThiThongTin();
                System.out.println("------------------");
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy tài liệu thuộc loại này.");
        }
    }

    // e) Thoát chương trình
    public void thoat() {
        System.out.println("Thoát chương trình...");
        scanner.close();
        System.exit(0);
    }

    // Chạy chương trình
    public void menu() {
        while (true) {
            System.out.println("\n--- QUẢN LÝ THƯ VIỆN ---");
            System.out.println("1. Thêm tài liệu");
            System.out.println("2. Xóa tài liệu");
            System.out.println("3. Hiển thị danh sách");
            System.out.println("4. Tìm kiếm tài liệu");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");

            int choice;
            while(true){
                if(scanner.hasNextInt()){
                    choice = scanner.nextInt();
                    scanner.nextLine();
                    break;
                } else {
                    System.out.print("Mời nhập lại: ");
                    scanner.next();
                }
            }

            switch (choice) {
                case 1: themTaiLieu(); break;
                case 2: xoaTaiLieu(); break;
                case 3: hienThiDanhSach(); break;
                case 4: timKiemTaiLieu(); break;
                case 5: thoat(); break;
                default: System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}
