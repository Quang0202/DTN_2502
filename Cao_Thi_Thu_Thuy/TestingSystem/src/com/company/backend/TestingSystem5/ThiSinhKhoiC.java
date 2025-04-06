package com.company.backend.TestingSystem5;

public class ThiSinhKhoiC extends ThiSinh{
    public ThiSinhKhoiC(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }
    @Override
    public String getKhoiThi() {
        return "C (Văn, Sử, Địa)";
    }
}
