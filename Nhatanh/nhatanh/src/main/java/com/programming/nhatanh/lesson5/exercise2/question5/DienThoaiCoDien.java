package com.programming.nhatanh.lesson5.exercise2.question5;

public class DienThoaiCoDien extends DienThoaiDiDong{
    @Override
    public void nghe() {
        System.out.println("nghe từ điện thoại cổ điẻn");

    }

    @Override
    public void goi() {
        System.out.println("Gọi từ điện thoại cổ điẻn");

    }

    @Override
    public void guiTinNhan() {
        System.out.println("gửi tin nhắn từ điện thoại cổ điẻn");

    }

    @Override
    public void nhanTinNhan() {
        System.out.println("nhận tin nhắn từ điện thoại cổ điẻn");

    }

    public void ngheRadio() {
        System.out.println("Nghe Radio");
    }
}
