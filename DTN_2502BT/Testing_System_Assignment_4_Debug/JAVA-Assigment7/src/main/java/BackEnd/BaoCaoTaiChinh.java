package BackEnd;

import java.util.List;

public class BaoCaoTaiChinh {
    private List<NguyenVatLieu> nguyenVatLieu;
    private List<NhanCong> nhanCong;
    private List<ChiPhiChung> chiPhiChung;
    private double doanhThu;
    private double chiPhiBanHang;
    private double chiPhiQuanLy;
    private double thuNhapKhac;

    public BaoCaoTaiChinh(List<NguyenVatLieu> nguyenVatLieu, List<NhanCong> nhanCong, 
                         List<ChiPhiChung> chiPhiChung, double doanhThu, 
                         double chiPhiBanHang, double chiPhiQuanLy, double thuNhapKhac) {
        this.nguyenVatLieu = nguyenVatLieu;
        this.nhanCong = nhanCong;
        this.chiPhiChung = chiPhiChung;
        this.doanhThu = doanhThu;
        this.chiPhiBanHang = chiPhiBanHang;
        this.chiPhiQuanLy = chiPhiQuanLy;
        this.thuNhapKhac = thuNhapKhac;
    }

    public double tinhTongChiPhiNVL() {
        return nguyenVatLieu.stream().mapToDouble(NguyenVatLieu::getTongChiPhi).sum();
    }

    public double tinhTongChiPhiNhanCong() {
        return nhanCong.stream().mapToDouble(NhanCong::getTongChiPhi).sum();
    }

    public double tinhTongChiPhiChung() {
        return chiPhiChung.stream().mapToDouble(ChiPhiChung::getSoTien).sum();
    }

    public double tinhTongChiPhiSanXuat() {
        return tinhTongChiPhiNVL() + tinhTongChiPhiNhanCong() + tinhTongChiPhiChung();
    }

    public double tinhLoiNhuanGop() {
        return doanhThu - tinhTongChiPhiSanXuat();
    }

    public double tinhLoiNhuanTruocThue() {
        return tinhLoiNhuanGop() - chiPhiBanHang - chiPhiQuanLy + thuNhapKhac;
    }

    public double tinhThueNDN() {
        return tinhLoiNhuanTruocThue() * 0.2; // Thuế suất 20%
    }

    public double tinhLoiNhuanSauThue() {
        return tinhLoiNhuanTruocThue() - tinhThueNDN();
    }

    public void inBaoCaoTaiChinh() {
        System.out.println("=== BÁO CÁO TÀI CHÍNH ===\n");
        
        System.out.println("1. Chi phí nguyên vật liệu trực tiếp:");
        nguyenVatLieu.forEach(System.out::println);
        System.out.printf("Tổng chi phí NVL: %.0f VNĐ\n\n", tinhTongChiPhiNVL());
        
        System.out.println("2. Chi phí nhân công trực tiếp:");
        nhanCong.forEach(System.out::println);
        System.out.printf("Tổng chi phí nhân công: %.0f VNĐ\n\n", tinhTongChiPhiNhanCong());
        
        System.out.println("3. Chi phí sản xuất chung:");
        chiPhiChung.forEach(System.out::println);
        System.out.printf("Tổng chi phí chung: %.0f VNĐ\n\n", tinhTongChiPhiChung());
        
        System.out.println("=== BÁO CÁO THU NHẬP ===");
        System.out.printf("Doanh thu thuần: %.0f VNĐ\n", doanhThu);
        System.out.printf("(-) Giá vốn hàng bán: %.0f VNĐ\n", tinhTongChiPhiSanXuat());
        System.out.printf("= Lợi nhuận gộp: %.0f VNĐ\n", tinhLoiNhuanGop());
        System.out.printf("(-) Chi phí bán hàng: %.0f VNĐ\n", chiPhiBanHang);
        System.out.printf("(-) Chi phí quản lý doanh nghiệp: %.0f VNĐ\n", chiPhiQuanLy);
        System.out.printf("(+) Thu nhập khác: %.0f VNĐ\n", thuNhapKhac);
        System.out.printf("= Lợi nhuận trước thuế: %.0f VNĐ\n", tinhLoiNhuanTruocThue());
        System.out.printf("(-) Thuế TNDN (20%%): %.0f VNĐ\n", tinhThueNDN());
        System.out.printf("= Lợi nhuận sau thuế: %.0f VNĐ\n", tinhLoiNhuanSauThue());
    }
} 