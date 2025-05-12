package Exercise1.entity;

public class HinhTron extends HinhHoc {
    private double r;

    public HinhTron(double r) throws HinhHocException {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public void tinhChuVi() {
        System.out.println("Chu vi hinh tron la " + Math.PI * r * 2);
    }

    @Override
    public void tinhDienTich() {
        System.out.println("Dien tich hinh tron la " + Math.PI * r * r);
    }
}
