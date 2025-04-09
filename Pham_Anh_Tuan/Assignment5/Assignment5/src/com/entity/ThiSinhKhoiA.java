package com.entity;

public class ThiSinhKhoiA extends ThiSinh {
    public ThiSinhKhoiA(String soBaoDanh, String hoTen, String diaChi, String mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Khối thi: A (Toán, Lý, Hoá)");
    }
}

