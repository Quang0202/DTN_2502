package com.vti.entity;

public class CongNhan extends CanBo {
    private int bac;

    public CongNhan(String name, int bac) {
        super(name);
        this.bac = bac;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "bac=" + bac +
                "} " + super.toString();
    }
}
