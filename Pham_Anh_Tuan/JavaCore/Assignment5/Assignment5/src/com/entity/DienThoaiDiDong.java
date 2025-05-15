package com.entity;

public abstract class DienThoaiDiDong implements VuKhi {
    public void nghe() {
        System.out.println("Đang nghe điện thoại...");
    }

    public void goi() {
        System.out.println("Đang gọi điện thoại...");
    }

    public void guiTinNhan() {
        System.out.println("Đang gửi tin nhắn...");
    }

    public void nhanTinNhan() {
        System.out.println("Đang nhận tin nhắn...");
    }

    @Override
    public void tanCongKeXau() {
        System.out.println("Dùng điện thoại để tấn công kẻ xấu!");
    }
}
