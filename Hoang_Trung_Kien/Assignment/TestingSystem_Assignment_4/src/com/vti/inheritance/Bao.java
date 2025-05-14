package com.vti.inheritance;

public class Bao extends TaiLieu {
    private String ngayPhatHanh;

    public Bao(String maTaiLieu, String ngayPhatHanh) {
        super(maTaiLieu);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public String toString() {
        return "Bao{" +
                "ngayPhatHanh='" + ngayPhatHanh + '\'' +
                "} " + super.toString();
    }
}
