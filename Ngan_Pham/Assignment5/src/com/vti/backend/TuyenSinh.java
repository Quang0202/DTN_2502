package com.vti.backend;

import com.vti.entity.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TuyenSinh implements ITuyenSinh {
    private List<ThiSinh> danhSach = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void themThiSinh() {
        System.out.print("Nhập SBD: ");
        String sbd = scanner.nextLine();
        System.out.print("Nhập họ tên: ");
        String hoTen = scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String diaChi = scanner.nextLine();
        System.out.print("Nhập mức ưu tiên (số): ");
        int uuTien = Integer.parseInt(scanner.nextLine());

        System.out.println("Chọn khối thi: 1. A  2. B  3. C");
        int loai = Integer.parseInt(scanner.nextLine());
        ThiSinh ts;

        switch (loai) {
            case 1 -> ts = new ThiSinhKhoiA(sbd, hoTen, diaChi, uuTien);
            case 2 -> ts = new ThiSinhKhoiB(sbd, hoTen, diaChi, uuTien);
            case 3 -> ts = new ThiSinhKhoiC(sbd, hoTen, diaChi, uuTien);
            default -> {
                System.out.println("Khối không hợp lệ.");
                return;
            }
        }

        danhSach.add(ts);
        System.out.println("Đã thêm thí sinh thành công!");
    }

    @Override
    public void hienThiThiSinh() {
        if (danhSach.isEmpty()) {
            System.out.println("Chưa có thí sinh nào.");
        } else {
            for (ThiSinh ts : danhSach) {
                ts.hienThiThongTin();
                System.out.println("---------------");
            }
        }
    }

    @Override
    public void timKiemTheoSBD() {
        System.out.print("Nhập SBD cần tìm: ");
        String sbd = scanner.nextLine();
        boolean found = false;
        for (ThiSinh ts : danhSach) {
            if (ts.getSoBaoDanh().equalsIgnoreCase(sbd)) {
                ts.hienThiThongTin();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy thí sinh.");
        }
    }
}
