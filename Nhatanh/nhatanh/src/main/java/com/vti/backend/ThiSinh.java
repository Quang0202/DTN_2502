package com.vti.backend;

import java.util.ArrayList;

public class ThiSinh {
    private String sobaodanh;
    private String hoten;
    private String diachi;
    private int mucuutien;
    private Khoi khoi;
    private ArrayList<String> mon;

    public String getSobaodanh() {
        return sobaodanh;
    }

    public void setSobaodanh(String sobaodanh) {
        this.sobaodanh = sobaodanh;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getMucuutien() {
        return mucuutien;
    }

    public void setMucuutien(int mucuutien) {
        this.mucuutien = mucuutien;
    }

    public Khoi getKhoi() {
        return khoi;
    }

    public void setMon(String mon) {
        this.mon.add(mon);
    }



    public void setKhoi(Khoi khoi) {
        this.khoi = khoi;
        if (khoi.equals(Khoi.A)){
            setMon("Toán");
            setMon("Lý");
            setMon("Hoá");
        } else if (khoi.equals(Khoi.B)) {
            setMon("Toán");
            setMon("Sinh");
            setMon("Hoá");
        } else if (khoi.equals(Khoi.C)) {
            setMon("Văn");
            setMon("Sử");
            setMon("Địa");
        }
    }

    public ThiSinh(String sobaodanh, String hoten, String diachi, int mucuutien, Khoi khoi) {
        this.sobaodanh = sobaodanh;
        this.hoten = hoten;
        this.diachi = diachi;
        this.mucuutien = mucuutien;
        setKhoi(khoi);
    }

    @Override
    public String toString() {
        return "ThiSinh{" +
                "sobaodanh='" + sobaodanh + '\'' +
                ", hoten='" + hoten + '\'' +
                ", diachi='" + diachi + '\'' +
                ", mucuutien=" + mucuutien +
                ", khoi=" + khoi +
                ", mon=" + mon.toString() +
                '}';
    }
}
