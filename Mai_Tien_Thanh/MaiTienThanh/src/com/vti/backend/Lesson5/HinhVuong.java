package MaiTienThanh.src.com.vti.backend.Lesson5;

public class HinhVuong extends HinhChuNhat{

    public HinhVuong(float canh) {
        super(canh, canh);
    }

    @Override
    public void tinhChuVi() {
        if (this instanceof HinhVuong){
            System.out.println("Tính chu vi theo hình vuông: " + getChieuDai() * 4);
        } else {
            super.tinhChuVi();
        }
    }

    @Override
    public void tinhDienTich() {
        if (this instanceof HinhVuong){
            System.out.println("Tính diện tích theo hình vuông: " + getChieuDai() * getChieuRong());
        } else {
            super.tinhDienTich();
        }
    }
}
