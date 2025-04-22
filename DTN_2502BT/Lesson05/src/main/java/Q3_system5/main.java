package Q3_system5;

public class main {
    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat(4, 5);
        System.out.println("Chu vi HCN: " + hcn.tinhChuVi());
        System.out.println("Diện tích HCN: " + hcn.tinhDienTich());

        System.out.println("------------------------");

        HinhVuong hv = new HinhVuong(3);
        System.out.println("Chu vi HV: " + hv.tinhChuVi());
        System.out.println("Diện tích HV: " + hv.tinhDienTich());
    }
}
