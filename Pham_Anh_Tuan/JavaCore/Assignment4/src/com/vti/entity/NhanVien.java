package com.vti.entity;

public class NhanVien extends CanBo {
    private String congViec;

    // Constructor
    public NhanVien(String hoTen, int tuoi, String gioiTinh, String diaChi, String congViec) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    // Getter và Setter
    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Công việc: " + congViec);
    }
}

