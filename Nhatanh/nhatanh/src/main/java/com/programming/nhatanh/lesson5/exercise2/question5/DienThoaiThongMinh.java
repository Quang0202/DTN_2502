package com.programming.nhatanh.lesson5.exercise2.question5;

public class DienThoaiThongMinh extends DienThoaiDiDong{
    @Override
    public void nghe() {
        System.out.println("nghe từ smartphone");

    }

    @Override
    public void goi() {
        System.out.println("Gọi từ smartphone");

    }

    @Override
    public void guiTinNhan() {
        System.out.println("gửi tin nhắn từ smartphone");

    }

    @Override
    public void nhanTinNhan() {
        System.out.println("nhận tin nhắn từ smartphone");

    }

    public void suDung3G() {
        System.out.println("Dùng 3G từ smartphone");

    }

    public void chupHinh() {
        System.out.println("Chụp");
    }
}
