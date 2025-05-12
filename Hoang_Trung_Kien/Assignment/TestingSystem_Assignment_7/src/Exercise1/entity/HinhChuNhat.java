package Exercise1.entity;

public class HinhChuNhat extends HinhHoc {
    private double dai;
    private double rong;

    public HinhChuNhat(double dai, double rong) throws HinhHocException {
        this.dai = dai;
        this.rong = rong;
    }

    public double getDai() {
        return dai;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }

    public double getRong() {
        return rong;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }

    @Override
    public void tinhChuVi() {
        System.out.println("Chu vi hinh chu nhat la " + (dai + rong) * 2);
    }

    @Override
    public void tinhDienTich() {
        System.out.println("Dien tich hinh chu nhat la " + dai * rong);
    }
}
