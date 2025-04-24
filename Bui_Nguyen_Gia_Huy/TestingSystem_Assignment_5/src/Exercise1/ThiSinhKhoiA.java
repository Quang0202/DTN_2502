package Exercise1;

public class ThiSinhKhoiA extends ThiSinh {
    public ThiSinhKhoiA(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }
    public String getKhoi() {
        return "A (Toan, Ly, Hoa)";
    }
}