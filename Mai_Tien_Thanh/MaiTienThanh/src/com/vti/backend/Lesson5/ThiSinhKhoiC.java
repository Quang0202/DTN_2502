package MaiTienThanh.src.com.vti.backend.Lesson5;

public class ThiSinhKhoiC extends ThiSinh {
    public ThiSinhKhoiC(String soBaoDanh, String hoTen, String mucUuTien, int mucUu) {
        super(soBaoDanh, hoTen, mucUuTien, mucUu);
    }

    @Override
    public String getKhoiThi() {
        return "Thí Sinh Khối A: Văn, Sử, Địa";
    }
}