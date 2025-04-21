package entity;

public class HinhTron extends HinhHoc {
    private double banKinh;

    public HinhTron(double banKinh) throws HinhHocException {
        super();
        this.banKinh = banKinh;
    }

    @Override
    public double tinhChuVi() {
        return 2 * Math.PI * banKinh;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }
}