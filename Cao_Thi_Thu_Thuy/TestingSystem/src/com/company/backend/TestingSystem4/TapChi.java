package com.company.backend.TestingSystem4;

class TapChi extends TaiLieu {
    private int soPhatHanh;
    private int thangPhatHanh;

    public TapChi(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, int soPhatHanh, int thangPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("Tạp chí - Mã: " + maTaiLieu + ", NXB: " + tenNhaXuatBan + ", Số bản: " + soBanPhatHanh +
                ", Số phát hành: " + soPhatHanh + ", Tháng phát hành: " + thangPhatHanh);
    }
}

