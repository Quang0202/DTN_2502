package com.vti.inheritance;

public class Sach extends TaiLieu {
    private String tacGia;
    private int soTrang;

    public Sach(String maTaiLieu, String tacGia) {
        super(maTaiLieu);
        this.tacGia = tacGia;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return "Sach{" +
                "tacGia='" + tacGia + '\'' +
                ", soTrang=" + soTrang +
                "} " + super.toString();
    }
}
