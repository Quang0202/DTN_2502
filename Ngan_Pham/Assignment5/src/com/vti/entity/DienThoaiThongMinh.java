package com.vti.entity;

public class DienThoaiThongMinh extends DienThoaiDiDong implements VuKhi {
    @Override
    public void nghe() {
        System.out.println("Smartphone: Đang nghe điện thoại...");
    }

    @Override
    public void goi() {
        System.out.println("Smartphone: Đang gọi điện thoại...");
    }

    @Override
    public void guiTinNhan() {
        System.out.println("Smartphone: Đang gửi tin nhắn...");
    }

    @Override
    public void nhanTinNhan() {
        System.out.println("Smartphone: Đang nhận tin nhắn...");
    }

    public void suDung3G() {
        System.out.println("Smartphone: Đang dùng 3G...");
    }

    public void chupHinh() {
        System.out.println("Smartphone: Đang chụp hình...");
    }

    @Override
    public void tanCongKeXau() {
        System.out.println("điện thoại thông minh tanCongKeXau");
    }
}
