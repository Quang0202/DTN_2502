package MaiTienThanh.src.com.vti.entity.Lesson7;

public class HinhTron extends HinhHoc {
    private double radius;

    public HinhTron(double radius) throws HinhHocException {
        super();
        this.radius = radius;
    }

    @Override
    public double chuVi() {
        return radius * 2 * Math.PI;
    }

    public double dienTich() {
        return radius * radius * Math.PI;
    }
}
