package com.programming.nhatanh.lesson9.entity;

public class NgayThangNam {
    public int ngay;
    public int thang;
    public int nam;

    public class GioPhutGiay {
        public int gio, phut, giay;
        public void xuatThongTin(){
            System.out.println("Ngày: " + ngay + "/" + thang + "/" + nam);
            System.out.println("Giờ: " + gio + ":" + phut + ":" + giay);
        }
    }
}
