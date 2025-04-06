package com.vti.backend;

public class TapChi extends TaiLieu{

    private int soPhatHanh;
    private int thangPhatHanh;

    public TapChi(String maTaiLieu, String nhaXuatBan, int soBan, int soPhatHanh, int thangPhatHanh) {
        super(maTaiLieu, nhaXuatBan, soBan);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public String toString() {
        return "Sach{" +
                "maTaiLieu='" + super.getMaTaiLieu() + '\'' +
                ", nhaXuatBan='" + super.getNhaXuatBan() + '\'' +
                ", soBan=" + super.getSoBan() +
                ", soPhatHanh='" + soPhatHanh + '\'' +
                ", thangPhatHanh=" + thangPhatHanh +
                '}';
    }
}
