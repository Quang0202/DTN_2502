package Exercise1.entity;

public abstract class HinhHoc {
    private static int count = 0;
    public abstract void tinhChuVi();
    public abstract void tinhDienTich();

    public HinhHoc() throws HinhHocException {
        if (count >= Configs.SO_LUONG_HINH_TOI_DA) {
            throw new HinhHocException("Số lượng hình tối đa là: " + Configs. SO_LUONG_HINH_TOI_DA);
        } else {
            count ++;
        }
    }
}
