package com.vti.backend;

import com.vti.entity.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise5 {

    private final List<CanBo> danhSachCanBo;
    private final Scanner scanner;

    public Exercise5() {
        danhSachCanBo = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void question1(){
        // Khởi tạo các đối tượng
        CongNhan congNhan = new CongNhan("Nguyen Van A", 30, "Nam", "Hà Nội", 5);
        KySu kySu = new KySu("Tran Thi B", 28, "Nữ", "TP HCM", "Công nghệ thông tin");
        NhanVien nhanVien = new NhanVien("Le Van C", 25, "Khác", "Đà Nẵng", "Kế toán");

        // Hiển thị thông tin
        System.out.println("Thông tin Công nhân:");
        congNhan.hienThiThongTin();
        System.out.println();

        System.out.println("Thông tin Kỹ sư:");
        kySu.hienThiThongTin();
        System.out.println();

        System.out.println("Thông tin Nhân viên:");
        nhanVien.hienThiThongTin();
    }

    // a) Thêm mới cán bộ
    public void themCanBo() {
        System.out.println("Chọn loại cán bộ cần thêm:");
        System.out.println("1. Công nhân");
        System.out.println("2. Kỹ sư");
        System.out.println("3. Nhân viên");
        int choice = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập họ tên: ");
        String hoTen = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        int tuoi = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập giới tính (Nam/Nữ/Khác): ");
        String gioiTinh = scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String diaChi = scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Nhập bậc (1-10): ");
                int bac = Integer.parseInt(scanner.nextLine());
                danhSachCanBo.add(new CongNhan(hoTen, tuoi, gioiTinh, diaChi, bac));
                break;
            case 2:
                System.out.print("Nhập ngành đào tạo: ");
                String nganhDaoTao = scanner.nextLine();
                danhSachCanBo.add(new KySu(hoTen, tuoi, gioiTinh, diaChi, nganhDaoTao));
                break;
            case 3:
                System.out.print("Nhập công việc: ");
                String congViec = scanner.nextLine();
                danhSachCanBo.add(new NhanVien(hoTen, tuoi, gioiTinh, diaChi, congViec));
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
        }
    }

    // b) Tìm kiếm theo họ tên
    public void timKiemTheoTen() {
        System.out.print("Nhập họ tên cần tìm: ");
        String tenCanTim = scanner.nextLine();
        boolean found = false;

        for (CanBo canBo : danhSachCanBo) {
            if (canBo.getHoTen().equalsIgnoreCase(tenCanTim)) {
                canBo.hienThiThongTin();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy cán bộ có tên: " + tenCanTim);
        }
    }

    // c) Hiển thị danh sách cán bộ
    public void hienThiDanhSach() {
        if (danhSachCanBo.isEmpty()) {
            System.out.println("Danh sách cán bộ trống.");
            return;
        }
        System.out.println("Danh sách cán bộ:");
        for (CanBo canBo : danhSachCanBo) {
            canBo.hienThiThongTin();
            System.out.println("---------------------");
        }
    }

    // d) Xóa cán bộ theo tên
    public void xoaCanBo() {
        System.out.print("Nhập tên cán bộ cần xóa: ");
        String tenCanXoa = scanner.nextLine();
        boolean removed = danhSachCanBo.removeIf(canBo -> canBo.getHoTen().equalsIgnoreCase(tenCanXoa));

        if (removed) {
            System.out.println("Đã xóa cán bộ: " + tenCanXoa);
        } else {
            System.out.println("Không tìm thấy cán bộ có tên: " + tenCanXoa);
        }
    }

    // e) Thoát chương trình
    public void thoat() {
        System.out.println("Chương trình kết thúc.");
        scanner.close();
        System.exit(0);
    }

    public void question3(){
        HighSchoolStudent student = new HighSchoolStudent(1, "Nam", "Chuyên Văn", "Đại học công nghệ");
        student.printInfo();
    }
}
