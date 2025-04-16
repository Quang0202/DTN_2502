package com.vti.entity;

public class DienThoaiCoDien extends Dienthoaididong implements VuKhi{
    @Override
    public void nghe() {
        System.out.println("nghe bằng điện thoại cổ điển");
    }

    @Override
    public void goi() {
        System.out.println("Gọi bằng điện thoại cổ điển");
    }

    @Override
    public void guiTinNhan() {
        System.out.println("Gửi tin nhắn bằng điện thoại cổ điển");
    }

    @Override
    public void nhanTinNhan() {
        System.out.println("Nhận tin nhắn bằng điện thoại cổ điển ");
    }

    public void ngheRadio(){
        System.out.println("ngheRadio");
    }

    @Override
    public void tanCongKeXau() {
        System.out.println("điện thoại cổ điển tanCongKeXau");
    }
}
