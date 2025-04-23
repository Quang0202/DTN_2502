package entity;

public class HinhChuNhat extends HinhHoc{
    private double width;
    private double height;

    public HinhChuNhat(double width, double height) throws HinhHocException {
        super();
        this.width = width;
        this.height = height;
    }

    @Override
    public double tinhChuVi() {
        return 2 * (width + height);
    }

    @Override
    public double tinhDienTich() {
        return width * height;
    }
}
