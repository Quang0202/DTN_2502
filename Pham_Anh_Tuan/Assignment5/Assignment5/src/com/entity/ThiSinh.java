package com.entity;

public class ThiSinh {
    protected String soBaoDanh;
    protected String hoTen;
    protected String diaChi;
    protected String mucUuTien;

    public ThiSinh(String soBaoDanh, String hoTen, String diaChi, String mucUuTien) {
        this.soBaoDanh = soBaoDanh;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.mucUuTien = mucUuTien;
    }

    public String getSoBaoDanh() {
        return soBaoDanh;
    }

    public void hienThiThongTin() {
        System.out.println("SBD: " + soBaoDanh + ", Họ tên: " + hoTen + ", Địa chỉ: " + diaChi + ", Ưu tiên: " + mucUuTien);
    }
}
