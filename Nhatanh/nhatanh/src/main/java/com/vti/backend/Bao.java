package com.vti.backend;

public class Bao extends TaiLieu {

    private int ngayPhatHanh;

    public Bao(String maTaiLieu, String nhaXuatBan, int soBan, int ngayPhatHanh) {
        super(maTaiLieu, nhaXuatBan, soBan);
        this.ngayPhatHanh = ngayPhatHanh;
    }


    public int getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(int ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public String toString() {
        return "Sach{" +
                "maTaiLieu='" + super.getMaTaiLieu() + '\'' +
                ", nhaXuatBan='" + super.getNhaXuatBan() + '\'' +
                ", soBan=" + super.getSoBan() +
                ", thangPhatHanh=" + ngayPhatHanh +
                '}';
    }
}
