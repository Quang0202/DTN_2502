package entity;

import utils.Configs;

public abstract class HinhHoc {
    private static int countHinh = 0;

    public HinhHoc() throws HinhHocException {
        countHinh++;
        if (countHinh > Configs.SO_LUONG_HINH_TOI_DA) {
            throw new HinhHocException("Số lượng hình tối đa là: " + Configs.SO_LUONG_HINH_TOI_DA);
        }
    }

    public abstract double tinhChuVi();
    public abstract double tinhDienTich();
}
