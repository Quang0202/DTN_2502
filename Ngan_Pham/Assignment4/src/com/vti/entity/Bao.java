package com.vti.entity;

import java.time.LocalDate;

public class Bao extends TaiLieu {
    private LocalDate ngayPhatHanh;

    public Bao(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, LocalDate ngayPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }
    public LocalDate getNgayPhatHanh() {
        return ngayPhatHanh;
    }
    public void setNgayPhatHanh(LocalDate ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }
    @Override
    public String toString() {
        return "Báo: " + super.toString() +
                ", Ngày phát hành: " + ngayPhatHanh;
    }
}
