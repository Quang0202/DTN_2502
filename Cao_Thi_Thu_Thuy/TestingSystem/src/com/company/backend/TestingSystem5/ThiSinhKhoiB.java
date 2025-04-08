package com.company.backend.TestingSystem5;

public class ThiSinhKhoiB extends ThiSinh{
    public ThiSinhKhoiB(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }
    @Override
    public String getKhoiThi() {
        return "B (Toán, Hóa, Sinh)";
    }
}
