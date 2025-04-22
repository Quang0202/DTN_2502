package Q3_system5;

public class HinhVuong  extends HinhChuNhat{

    public HinhVuong(double canh) {
        super(canh, canh); // Hình vuông có chiều dài = chiều rộng = cạnh
    }
    public double tinhChuVi() {
        System.out.println("Tính chu vi theo Hình Vuông:");
        return super.tinhChuVi();
    }
    public double tinhDienTich() {
        System.out.println("Tính diện tích theo Hình Vuông:");
        return super.tinhDienTich();
    }
}
