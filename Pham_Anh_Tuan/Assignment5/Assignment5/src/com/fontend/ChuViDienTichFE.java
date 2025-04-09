package com.fontend;

import com.entity.HinhChuNhat;
import com.entity.HinhVuong;

public class ChuViDienTichFE {
    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat(4, 5);
        System.out.println("Chu vi: " + hcn.tinhChuVi() + ", Diện tích: " + hcn.tinhDienTich());

        System.out.println("--------------------------------");

        HinhChuNhat hv = new HinhVuong(3);
        System.out.println("Chu vi: " + hv.tinhChuVi() + ", Diện tích: " + hv.tinhDienTich());
    }
}
