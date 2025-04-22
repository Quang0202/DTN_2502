package Q3_system5;

public class HinhChuNhat {


    private double chieudai;
    private double chieuRong;


    public HinhChuNhat(double chieudai, double chieuRong) {
        this.chieudai = chieudai;
        this.chieuRong = chieuRong;
    }

    public HinhChuNhat() {

    }

    public double getChieudai() {
        return chieudai;
    }

    public void setChieudai(double chieudai) {
        this.chieudai = chieudai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public double tinhChuVi() {
        double tinhChuVi = chieudai * chieuRong;
        System.out.println("tinhChuVi = ");
        return tinhChuVi;
    }
    public double tinhDienTich() {
        double dienTich = chieudai * chieuRong;
        System.out.println("Tính diện tích ");
        return dienTich;
    }
}
