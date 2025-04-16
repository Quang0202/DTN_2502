package vti.be.assignmentday08.exercise01;

public abstract class HinhHocc {
    private static int count = 0;

    public HinhHocc() throws HinhHocException {
        if (count >= Config.SO_LUONG_HINH_TOI_DA) {
            throw new HinhHocException("Số lượng hình tối đa là: " + Config.SO_LUONG_HINH_TOI_DA);
        }
        count++;
    }

    public abstract double tinhChuVi();
    public abstract double tinhDienTich();
}
