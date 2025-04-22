package BackEnd;

public class NguyenVatLieu {
    private int stt;
    private String tenNguyenVatLieu;
    private String donVi;
    private int soLuongSuDung;
    private double donGia;
    private double tongChiPhi;

    public NguyenVatLieu(int stt, String tenNguyenVatLieu, String donVi, int soLuongSuDung, double donGia) {
        this.stt = stt;
        this.tenNguyenVatLieu = tenNguyenVatLieu;
        this.donVi = donVi;
        this.soLuongSuDung = soLuongSuDung;
        this.donGia = donGia;
        this.tongChiPhi = soLuongSuDung * donGia;
    }

    public double getTongChiPhi() {
        return tongChiPhi;
    }

    @Override
    public String toString() {
        return String.format("%d. %s (%s): %d x %.0f = %.0f VNĐ", 
            stt, tenNguyenVatLieu, donVi, soLuongSuDung, donGia, tongChiPhi);
    }
} 