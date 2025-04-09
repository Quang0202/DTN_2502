package com.vti.inheritance;

public class TaiLieu {
    private String maTaiLieu;
    private String NXB;
    private int soBan;

    public TaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public TaiLieu(String NXB, int soBan, String maTaiLieu) {
        this.NXB = NXB;
        this.soBan = soBan;
        this.maTaiLieu = maTaiLieu;
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public int getSoBan() {
        return soBan;
    }

    public void setSoBan(int soBan) {
        this.soBan = soBan;
    }

    public String getNXB() {
        return NXB;
    }

    public void setNXB(String NXB) {
        this.NXB = NXB;
    }

    @Override
    public String toString() {
        return "TaiLieu{" +
                "maTaiLieu='" + maTaiLieu + '\'' +
                ", NXB='" + NXB + '\'' +
                ", soBan=" + soBan +
                '}';
    }
}
