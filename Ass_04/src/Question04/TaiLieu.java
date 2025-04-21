package Question04;

public class TaiLieu {

 private String NXB;
 private int soBanXuatHanh;
 private static int dem = 0;
 private String maTaiLieu;
    public TaiLieu() {
        dem++;
        this.maTaiLieu = "TaiLieu"+ String.format("%03d",dem);
    }
    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public TaiLieu(String NXB, int SoBanXuatHanh, String maTaiLieu) {
        this.NXB = NXB;
        this.maTaiLieu = maTaiLieu;
        this.soBanXuatHanh = SoBanXuatHanh;
    }
    @Override
    public String toString() {
        return "TaiLieu{" +
                "NXB='" + NXB + '\'' +
                ", soBanXuatHanh=" + soBanXuatHanh +
                ", maTaiLieu='" + maTaiLieu + '\'' +
                '}';
    }
}
