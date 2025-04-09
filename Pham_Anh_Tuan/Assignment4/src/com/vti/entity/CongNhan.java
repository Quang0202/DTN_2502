package com.vti.entity;

public class CongNhan extends CanBo {
    private int bac; // Bậc từ 1 đến 10

    // Constructor
    public CongNhan(String hoTen, int tuoi, String gioiTinh, String diaChi, int bac) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.bac = bac;
    }

    // Getter và Setter
    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        if (bac >= 1 && bac <= 10) {
            this.bac = bac;
        } else {
            System.out.println("Bậc không hợp lệ! Phải từ 1 đến 10.");
        }
    }


    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Bậc: " + bac);
    }
}
