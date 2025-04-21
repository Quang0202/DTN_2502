package BackEnd;

public class HinhChuNhat extends HinhHoc {
    private double chieuDai;
    private double chieuRong;
    
    public HinhChuNhat(double chieuDai, double chieuRong) throws HinhHocException {
        super();
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    
    @Override
    public double tinhChuVi() {
        return 2 * (chieuDai + chieuRong);
    }
    
    @Override
    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }
    
    public double getChieuDai() {
        return chieuDai;
    }
    
    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }
    
    public double getChieuRong() {
        return chieuRong;
    }
    
    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }
}
