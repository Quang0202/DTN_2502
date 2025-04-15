package com.vti.entity;

public class ThiSinhKhoiB extends ThiSinh{

    public ThiSinhKhoiB(int soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }
    public String getKhoithi(){
        return "Thí sinh thi khối B: Toán, Hoá, Sinh.";
    }
}
