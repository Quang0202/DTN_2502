package entity;

public class HinhChuNhat extends HinhHoc {
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat(double dai, double rong) throws HinhHocException {
        super();
        this.chieuDai = dai;
        this.chieuRong = rong;
    }

    @Override
    public double tinhChuVi() {
        return 2 * (chieuDai + chieuRong);
    }

    @Override
    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }
}