package com.entity;

public class HinhChuNhat {
    protected double chieuDai;
    protected double chieuRong;

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    public double tinhChuVi() {
        if (this instanceof HinhVuong) {
            System.out.println("Tính chu vi theo Hình Vuông");
        } else {
            System.out.println("Tính chu vi theo Hình Chữ Nhật");
        }
        return 2 * (chieuDai + chieuRong);
    }

    public double tinhDienTich() {
        if (this instanceof HinhVuong) {
            System.out.println("Tính diện tích theo Hình Vuông");
        } else {
            System.out.println("Tính diện tích theo Hình Chữ Nhật");
        }
        return chieuDai * chieuRong;
    }

}
