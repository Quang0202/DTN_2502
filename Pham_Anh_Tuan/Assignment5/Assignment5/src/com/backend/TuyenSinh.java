package com.backend;

import com.entity.*;

import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh implements ITuyenSinh {
    private ArrayList<ThiSinh> danhSach = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    @Override
    public void themThiSinh() {
        System.out.print("Nhập SBD: ");
        String sbd = sc.nextLine();
        System.out.print("Nhập Họ tên: ");
        String hoTen = sc.nextLine();
        System.out.print("Nhập Địa chỉ: ");
        String diaChi = sc.nextLine();
        System.out.print("Nhập Mức ưu tiên: ");
        String uuTien = sc.nextLine();

        System.out.print("Chọn khối (A/B/C): ");
        String khoi = sc.nextLine().toUpperCase();

        ThiSinh ts = null;
        switch (khoi) {
            case "A":
                ts = new ThiSinhKhoiA(sbd, hoTen, diaChi, uuTien);
                break;
            case "B":
                ts = new ThiSinhKhoiB(sbd, hoTen, diaChi, uuTien);
                break;
            case "C":
                ts = new ThiSinhKhoiC(sbd, hoTen, diaChi, uuTien);
                break;
            default:
                System.out.println("Khối không hợp lệ!");
                return;
        }

        danhSach.add(ts);
        System.out.println("==> Đã thêm thí sinh thành công!");
    }

    @Override
    public void hienThiThongTin() {
        if (danhSach.isEmpty()) {
            System.out.println("Chưa có thí sinh nào.");
            return;
        }
        for (ThiSinh ts : danhSach) {
            ts.hienThiThongTin();
            System.out.println();
        }
    }

    @Override
    public void timKiemTheoSBD(String sbd) {
        boolean found = false;
        for (ThiSinh ts : danhSach) {
            if (ts.getSoBaoDanh().equalsIgnoreCase(sbd)) {
                ts.hienThiThongTin();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy thí sinh với SBD: " + sbd);
        }
    }
}
