package Exercise1;

public class ThiSinhKhoiB extends ThiSinh {
    public ThiSinhKhoiB(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }
    public String getKhoi() {
        return "B (Toan, Hoa, Sinh)";
    }
}