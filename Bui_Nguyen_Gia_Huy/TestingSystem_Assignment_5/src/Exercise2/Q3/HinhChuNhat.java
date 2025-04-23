package Exercise2.Q3;

public class HinhChuNhat {
    protected double chieuDai;
    protected double chieuRong;

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double tinhChuVi() {
        double chuVi = 2 * (chieuDai + chieuRong);
        System.out.println("Tính chu vi theo Hình Chữ Nhật: " + chuVi);
        return chuVi;
    }

    public double tinhDienTich() {
        double dienTich = chieuDai * chieuRong;
        System.out.println("Tính diện tích theo Hình Chữ Nhật: " + dienTich);
        return dienTich;
    }
}
