package com.vti.entity;

public class ThiSinhKhoiC extends ThiSinh{
    public ThiSinhKhoiC(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh,hoTen,diaChi,mucUuTien);
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("Khối C - SBD: " + soBaoDanh + ", Họ tên: " + hoTen + ", Địa chỉ: " + diaChi + ", Ưu tiên: " + mucUuTien);
        System.out.println("Môn thi: Văn, Sử, Địa");
    }


}
