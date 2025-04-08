package com.programming.nhatanh.lesson5.exercise2.question5;

public abstract class DienThoaiDiDong implements VuKhi{
    @Override
    public void attack() {
        System.out.println("Tấn công");
    }

    public abstract void nghe();
    public abstract void goi();
    public abstract void guiTinNhan();
    public abstract void nhanTinNhan();
}
