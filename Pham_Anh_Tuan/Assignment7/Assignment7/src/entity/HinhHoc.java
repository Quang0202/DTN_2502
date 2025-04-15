package entity;

public abstract  class HinhHoc {
    private static int count = 0;

    public HinhHoc() throws HinhHocException {
        if (count >= Configs.SO_LUONG_HINH_TOI_DA) {
            throw new HinhHocException("Số lượng hình tối đa là: " + Configs.SO_LUONG_HINH_TOI_DA);
        }
        count++;
    }

    public static int getSoLuongHinh() {
        return count;
    }

    public abstract double tinhChuVi();
    public abstract double tinhDienTich();
}
