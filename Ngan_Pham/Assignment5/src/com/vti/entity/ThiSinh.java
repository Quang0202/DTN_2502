package com.vti.entity;

public abstract class ThiSinh {
    protected String soBaoDanh;
    protected String hoTen;
    protected String diaChi;
    protected int mucUuTien;

    public ThiSinh(String soBaoDanh, String diaChi, String hoTen, int mucUuTien) {
        this.soBaoDanh = soBaoDanh;
        this.diaChi = diaChi;
        this.hoTen = hoTen;
        this.mucUuTien = mucUuTien;
    }

    public String getSoBaoDanh() {
        return soBaoDanh;
    }

    public abstract void hienThiThongTin();
}
