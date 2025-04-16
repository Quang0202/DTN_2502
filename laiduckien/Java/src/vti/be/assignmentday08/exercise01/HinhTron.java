package vti.be.assignmentday08.exercise01;

public class HinhTron extends HinhHocc {
    int bankinh;
    public HinhTron(int bankinh) throws HinhHocException {
        super();
        this.bankinh = bankinh;
    }

    @Override
    public double tinhChuVi() {
        double cv = bankinh*2*3.14;
        System.out.println("Chuvila: " + bankinh*2*3.14);

        return cv;
    }

    @Override
    public double tinhDienTich() {
        double dt = bankinh*bankinh*3.14;

        System.out.println("DienTicLa: " + bankinh*bankinh*3.14);

        return dt;
    }
}
