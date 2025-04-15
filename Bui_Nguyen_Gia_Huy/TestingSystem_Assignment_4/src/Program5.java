public class Program5 {
    public static void main(String[] args) {
        QLCB ql = new QLCB();
        ql.themCanBo(new CongNhan("Nam", 25, "Nam", "HN", 5));
        ql.themCanBo(new KySu("Linh", 30, "Nữ", "HCM", "CNTT"));
        ql.themCanBo(new NhanVien("Minh", 22, "Nam", "ĐN", "Hành chính"));

        System.out.println("Danh sách cán bộ:");
        ql.hienThiDanhSach();

        System.out.println("Tìm kiếm cán bộ tên 'Nam':");
        ql.timKiemTheoTen("Nam");

        System.out.println("Xoá cán bộ tên 'Minh'");
        ql.xoaTheoTen("Minh");
        ql.hienThiDanhSach();
    }
}
