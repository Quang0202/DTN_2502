package com.vti.entity;

public class ThiSinhKhoiB extends ThiSinh{
    public ThiSinhKhoiB(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh,hoTen,diaChi,mucUuTien);
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("Khối B - SBD: " + soBaoDanh + ", Họ tên: " + hoTen + ", Địa chỉ: " + diaChi + ", Ưu tiên: " + mucUuTien);
        System.out.println("Môn thi: Toán, Hóa, Sinh");
    }
}
