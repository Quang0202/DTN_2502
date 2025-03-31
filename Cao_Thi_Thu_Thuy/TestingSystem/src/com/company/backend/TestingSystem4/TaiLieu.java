package com.company.backend.TestingSystem4;

abstract class TaiLieu {
    protected String maTaiLieu;
    protected String tenNhaXuatBan;
    protected int soBanPhatHanh;

    public TaiLieu(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.tenNhaXuatBan = tenNhaXuatBan;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public abstract void hienThiThongTin();
}

