package com.vti.entity;

public class DienThoaiCoDien extends DienThoaiDiDong implements VuKhi{
    @Override
    public void nghe() {
        System.out.println("Điện thoại cổ điển: Đang nghe...");
    }

    @Override
    public void goi() {
        System.out.println("Điện thoại cổ điển: Đang gọi...");
    }

    @Override
    public void guiTinNhan() {
        System.out.println("Điện thoại cổ điển: Gửi tin nhắn");
    }

    @Override
    public void nhanTinNhan() {
        System.out.println("Điện thoại cổ điển: Nhận tin nhắn");
    }

    public void ngheRadio() {
        System.out.println("Điện thoại cổ điển: Đang nghe radio ");
    }

    @Override
    public void tanCongKeXau() {
        System.out.println("điện thoại cổ điển tanCongKeXau");
    }
}
