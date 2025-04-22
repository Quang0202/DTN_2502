package FrontEnd;

import BackEnd.*;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
        // Tạo danh sách nguyên vật liệu
        List<NguyenVatLieu> nguyenVatLieu = Arrays.asList(
            new NguyenVatLieu(1, "Mật ong thô", "lít", 500, 50000),
            new NguyenVatLieu(2, "Men vi sinh", "gram", 200, 10000),
            new NguyenVatLieu(3, "Nước tinh khiết", "lít", 1000, 2000),
            new NguyenVatLieu(4, "Chai thủy tinh", "cái", 1000, 5000)
        );

        // Tạo danh sách nhân công
        List<NhanCong> nhanCong = Arrays.asList(
            new NhanCong(1, "Nguyễn Văn A", "Sản xuất", "Pha chế nguyên liệu", 160, 40000),
            new NhanCong(2, "Trần Thị B", "Sản xuất", "Kiểm tra chất lượng", 160, 45000)
        );

        // Tạo danh sách chi phí chung
        List<ChiPhiChung> chiPhiChung = Arrays.asList(
            new ChiPhiChung(1, "Lương quản đốc", 10000000),
            new ChiPhiChung(2, "Khấu hao máy móc", 8000000),
            new ChiPhiChung(3, "Điện - nước", 5000000),
            new ChiPhiChung(4, "Vật tư phụ trợ", 2000000)
        );

        // Tạo báo cáo tài chính
        BaoCaoTaiChinh baoCao = new BaoCaoTaiChinh(
            nguyenVatLieu,
            nhanCong,
            chiPhiChung,
            480000000,  // Doanh thu
            30000000,   // Chi phí bán hàng
            50000000,   // Chi phí quản lý
            5000000     // Thu nhập khác
        );

        // In báo cáo
        baoCao.inBaoCaoTaiChinh();
    }
}

