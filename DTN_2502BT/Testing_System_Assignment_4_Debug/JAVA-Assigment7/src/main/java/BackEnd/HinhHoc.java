package BackEnd;

public abstract class HinhHoc {
    private static int count = 0;
    
    protected HinhHoc() throws HinhHocException {
        count++;
        if (count > Configs.SO_LUONG_HINH_TOI_DA) {
            throw new HinhHocException("Số lượng hình tối đa là: " + Configs.SO_LUONG_HINH_TOI_DA);
        }
    }
    
    public abstract double tinhChuVi();
    public abstract double tinhDienTich();
    
    public static int getCount() {
        return count;
    }
}
