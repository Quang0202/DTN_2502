package com.company.backend.TestingSystem4;

public class Sach extends TaiLieu{
    private String tenTacGia;
    private int soTrang;

    public Sach(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, String tenTacGia, int soTrang) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("Sách - Mã: " + maTaiLieu + ", NXB: " + tenNhaXuatBan + ", Số bản: " + soBanPhatHanh +
                ", Tác giả: " + tenTacGia + ", Số trang: " + soTrang);
    }
}
