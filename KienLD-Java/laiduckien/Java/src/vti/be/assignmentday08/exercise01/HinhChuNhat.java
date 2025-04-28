package vti.be.assignmentday08.exercise01;

public class HinhChuNhat extends HinhHocc{
    public HinhChuNhat(int chieudai, int chieurong) throws HinhHocException {
        super();
        this.chieudai = chieudai;
        this.chieurong = chieurong;

    }

    int chieudai; int chieurong;
    @Override
    public double tinhChuVi() {

        return 0;
    }

    @Override
    public double tinhDienTich() {

        return 0;
    }
}
