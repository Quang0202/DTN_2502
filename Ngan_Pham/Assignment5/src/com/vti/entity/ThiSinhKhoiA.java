package com.vti.entity;

public class ThiSinhKhoiA extends ThiSinh{
    public ThiSinhKhoiA(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("Khối A - SBD: " + soBaoDanh + ", Họ tên: " + hoTen + ", Địa chỉ: " + diaChi + ", Ưu tiên: " + mucUuTien);
        System.out.println("Môn thi: Toán, Lý, Hóa");
    }

}
