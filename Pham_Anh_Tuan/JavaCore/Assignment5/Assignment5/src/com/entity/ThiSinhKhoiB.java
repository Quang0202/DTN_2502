package com.entity;

public class ThiSinhKhoiB extends ThiSinh {
    public ThiSinhKhoiB(String soBaoDanh, String hoTen, String diaChi, String mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Khối thi: B (Toán, Hoá, Sinh)");
    }
}
