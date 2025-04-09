package com.vti.inheritance;

public class TapChi extends TaiLieu {
    private String soPhatHanh;
    private String thangPhatHanh;

    public TapChi(String maTaiLieu, String soPhatHanh) {
        super(maTaiLieu);
        this.soPhatHanh = soPhatHanh;
    }

    public String getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(String soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public String getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(String thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public String toString() {
        return "TapChi{" +
                "soPhatHanh='" + soPhatHanh + '\'' +
                ", thangPhatHanh='" + thangPhatHanh + '\'' +
                "} " + super.toString();
    }
}
