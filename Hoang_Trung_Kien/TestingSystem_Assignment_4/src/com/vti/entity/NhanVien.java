package com.vti.entity;

public class NhanVien extends CanBo {
    private String congViec;

    public NhanVien(String name, String congViec) {
        super(name);
        this.congViec = congViec;
    }
}
