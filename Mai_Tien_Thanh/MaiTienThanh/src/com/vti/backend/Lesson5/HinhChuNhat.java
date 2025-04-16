package MaiTienThanh.src.com.vti.backend.Lesson5;

public class HinhChuNhat {
    private float chieuDai;
    private float chieuRong;

    public HinhChuNhat(float chieuDai, float chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public float getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(float chieuDai) {
        this.chieuDai = chieuDai;
    }

    public float getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(float chieuRong) {
        this.chieuRong = chieuRong;
    }

    public void tinhChuVi(){
        System.out.println("Tính chu vi theo hình chữ nhật: " + (chieuDai + chieuRong) * 2);
    }

    public void tinhDienTich(){
        System.out.println("Tính diện tích theo hình chữ nhật: " + (chieuDai * chieuRong));
    }
}
