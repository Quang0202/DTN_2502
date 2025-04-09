package com.entity;

public class ThiSinhKhoiC extends ThiSinh {
    public ThiSinhKhoiC(String soBaoDanh, String hoTen, String diaChi, String mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Khối thi: C (Văn, Sử, Địa)");
    }
}
