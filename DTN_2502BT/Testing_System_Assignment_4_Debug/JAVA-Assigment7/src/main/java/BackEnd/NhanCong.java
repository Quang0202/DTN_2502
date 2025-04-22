package BackEnd;

public class NhanCong {
    private int stt;
    private String tenNhanVien;
    private String boPhan;
    private String congViec;
    private int soGioLam;
    private double donGiaGio;
    private double tongChiPhi;

    public NhanCong(int stt, String tenNhanVien, String boPhan, String congViec, int soGioLam, double donGiaGio) {
        this.stt = stt;
        this.tenNhanVien = tenNhanVien;
        this.boPhan = boPhan;
        this.congViec = congViec;
        this.soGioLam = soGioLam;
        this.donGiaGio = donGiaGio;
        this.tongChiPhi = soGioLam * donGiaGio;
    }

    public double getTongChiPhi() {
        return tongChiPhi;
    }

    @Override
    public String toString() {
        return String.format("%d. %s - %s (%s): %d giờ x %.0f = %.0f VNĐ", 
            stt, tenNhanVien, boPhan, congViec, soGioLam, donGiaGio, tongChiPhi);
    }
} 