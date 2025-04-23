package entity;

public class HinhTron extends HinhHoc{
    private double radius;

    public HinhTron(double radius) throws HinhHocException {
        super();
        this.radius = radius;
    }

    @Override
    public double tinhChuVi() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI * radius * radius;
    }
}
