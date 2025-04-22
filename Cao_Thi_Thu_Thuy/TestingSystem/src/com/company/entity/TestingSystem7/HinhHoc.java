package com.company.entity.TestingSystem7;

public abstract class HinhHoc {
    public static int count = 0;
    public HinhHoc() throws HinhHocException {
        if (count >= Configs.SO_LUONG_HINH_TOI_DA){
            throw new HinhHocException("Số lượng hình tối đa là: " + Configs. SO_LUONG_HINH_TOI_DA);
        }
        count += 1;
    }
    public abstract double tinhChuVi();
    public abstract double tinhDienTich();
}
