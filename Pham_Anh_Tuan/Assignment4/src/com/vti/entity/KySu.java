package com.vti.entity;

public class KySu extends CanBo {
    private String nganhDaoTao;

    // Constructor
    public KySu(String hoTen, int tuoi, String gioiTinh, String diaChi, String nganhDaoTao) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    // Getter và Setter
    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }


    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Ngành đào tạo: " + nganhDaoTao);
    }
}

