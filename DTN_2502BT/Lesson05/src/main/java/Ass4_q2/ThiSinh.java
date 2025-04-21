package Ass4_q2;

public class ThiSinh {
   private int SoBaoDanh;
   private String hoTen;
   private String diaCHi;
   private int KhoiUuTien;

    public ThiSinh( String hoTen,int soBaoDanh, String diaCHi, int KhoiUuTien) {
        this.SoBaoDanh = soBaoDanh;
        this.hoTen = hoTen;
        this.diaCHi = diaCHi;
this.KhoiUuTien = KhoiUuTien;
    }
    public ThiSinh() {

    }


    public int getSoBaoDanh() {
        return SoBaoDanh;
    }

    public void setSoBaoDanh(int soBaoDanh) {
        SoBaoDanh = soBaoDanh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaCHi() {
        return diaCHi;
    }

    public void setDiaCHi(String diaCHi) {
        this.diaCHi = diaCHi;
    }

    public int getKhoiUuTien() {
        return KhoiUuTien;
    }

    public void setKhoiUuTien(int khoiUuTien) {
        KhoiUuTien = khoiUuTien;
    }

    public void hienThiThongTin() {
    }

    @Override
    public String toString() {
        return "ThiSinh{" +
                "SoBaoDanh=" + SoBaoDanh +
                ", hoTen='" + hoTen + '\'' +
                ", diaCHi='" + diaCHi + '\'' +
                ", KhoiUuTien=" + KhoiUuTien +
                '}';
    }
}
