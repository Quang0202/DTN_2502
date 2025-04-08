package com.company.backend.TestingSystem5;

public class ThiSinhKhoiA extends ThiSinh{
    public ThiSinhKhoiA(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }

    @Override
    public String getKhoiThi() {
        return "A (Toán, Lý, Hóa)";
    }
}
