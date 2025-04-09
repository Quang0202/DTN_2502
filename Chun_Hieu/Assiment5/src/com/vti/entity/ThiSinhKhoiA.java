package com.vti.entity;

public class ThiSinhKhoiA extends ThiSinh{

    public ThiSinhKhoiA(int soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }
    public String getKhoithi(){
        return "Thí sinh thi khối A: Toán, Lý, Hoá";
    }
}
