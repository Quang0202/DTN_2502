package com.vti.entity;

public class HinhChuNhat {
    protected double chieuDai;
    protected double chieuRong;

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double tinhChuVi(){
        double p = 2 * (chieuDai + chieuRong);
        System.out.println("Tính chu vi theo Hình Chữ Nhật: " + p);
        return p;
    }

    public double tinhDienTich() {
        double s = chieuDai * chieuRong;
        System.out.println("Tính diện tích theo Hình Chữ Nhật: " + s);
        return s;
    }
}
