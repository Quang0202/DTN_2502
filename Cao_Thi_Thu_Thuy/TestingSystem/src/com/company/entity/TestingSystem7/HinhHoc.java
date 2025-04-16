package com.company.entity.TestingSystem7;

public abstract class HinhHoc {
    public HinhHoc() throws HinhHocException {
        if (Configs.SO_LUONG_HINH_TOI_DA >= 5){
            throw new HinhHocException("Số lượng hình tối đa là: " + Configs. SO_LUONG_HINH_TOI_DA);
        }
        Configs.SO_LUONG_HINH_TOI_DA += 1;
    }
    public abstract double tinhChuVi();
    public abstract double tinhDienTich();
}
