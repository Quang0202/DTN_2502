package com.company.entity.TestingSystem9;

public class NgayThangNam {
    public int ngay, thang, nam;

    public class GioPhutGiay {
        public int gio, phut, giay;

        public void xuatThongTin() {
            System.out.println("Ngày: " + ngay + "/" + thang + "/" + nam);
            System.out.println("Giờ: " + gio + ":" + phut + ":" + giay);
        }
    }
}
