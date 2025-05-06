package com.vti.frontend;

import com.vti.entity.HinhChuNhat;
import com.vti.entity.HinhVuong;

public class Pro2_3 {
    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat(5,3);
        System.out.println("=== Hình Chữ Nhật ===");
        hcn.tinhChuVi();
        hcn.tinhDienTich();

        System.out.println("\n=== Hình Vuông ===");
        HinhVuong hv = new HinhVuong(4);
        hv.tinhChuVi();
        hv.tinhDienTich();
    }
}
