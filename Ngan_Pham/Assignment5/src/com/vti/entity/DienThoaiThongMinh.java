package com.vti.entity;

public class DienThoaiThongMinh extends Dienthoaididong implements VuKhi {
    @Override
    public void nghe() {
        System.out.println("nghe bằng điện thoại thông minh");
    }

    @Override
    public void goi() {
        System.out.println("Gọi bằng điện thoại thông minh");
    }

    @Override
    public void guiTinNhan() {
        System.out.println("Gửi tin nhắn bằng điện thoại thông minh");
    }

    @Override
    public void nhanTinNhan() {
        System.out.println("Nhận tin nhắn bằng điện thoại thông minh");
    }

    public void suDung3G(){
        System.out.println("Su dung 3G");
    }
    public void chupHinh(){
        System.out.println("chup hinh");
    }
    @Override
    public void tanCongKeXau() {
        System.out.println("điện thoại thông minh tanCongKeXau");
    }
}
