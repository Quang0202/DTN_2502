package com.vti.backend;

public class TaiLieu {
    private String maTaiLieu;
    private String nhaXuatBan;
    private int soBan;

    public TaiLieu(String maTaiLieu, String nhaXuatBan, int soBan) {
        this.maTaiLieu = maTaiLieu;
        this.nhaXuatBan = nhaXuatBan;
        this.soBan = soBan;
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public int getSoBan() {
        return soBan;
    }

    public void setSoBan(int soBan) {
        this.soBan = soBan;
    }

    @Override
    public String toString() {
        return "TaiLieu{" +
                "maTaiLieu='" + maTaiLieu + '\'' +
                ", nhaXuatBan='" + nhaXuatBan + '\'' +
                ", soBan=" + soBan +
                '}';
    }
}
