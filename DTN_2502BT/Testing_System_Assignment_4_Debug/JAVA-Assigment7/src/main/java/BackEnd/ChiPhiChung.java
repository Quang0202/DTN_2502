package BackEnd;

public class ChiPhiChung {
    private int stt;
    private String khoanMuc;
    private double soTien;

    public ChiPhiChung(int stt, String khoanMuc, double soTien) {
        this.stt = stt;
        this.khoanMuc = khoanMuc;
        this.soTien = soTien;
    }

    public double getSoTien() {
        return soTien;
    }

    @Override
    public String toString() {
        return String.format("%d. %s: %.0f VNĐ", stt, khoanMuc, soTien);
    }
} 