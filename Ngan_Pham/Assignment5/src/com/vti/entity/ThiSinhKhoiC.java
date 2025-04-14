package com.vti.entity;

public class ThiSinhKhoiC extends ThiSinh{

    public ThiSinhKhoiC(int soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }
    public String getKhoithi(){
        return "Thí sinh thi khối C: Văn, Sử, Địa.";
    }
}
