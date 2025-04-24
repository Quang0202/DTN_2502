package Exercise2.Q3;

public class MainHinh {
    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat(5, 3);
        hcn.tinhChuVi();
        hcn.tinhDienTich();

        System.out.println();

        HinhVuong hv = new HinhVuong(4);
        hv.tinhChuVi();
        hv.tinhDienTich();
    }
}

