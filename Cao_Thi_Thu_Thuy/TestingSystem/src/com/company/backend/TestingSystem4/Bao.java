package com.company.backend.TestingSystem4;

class Bao extends TaiLieu {
    private String ngayPhatHanh;

    public Bao(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, String ngayPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("Báo - Mã: " + maTaiLieu + ", NXB: " + tenNhaXuatBan + ", Số bản: " + soBanPhatHanh +
                ", Ngày phát hành: " + ngayPhatHanh);
    }
}

