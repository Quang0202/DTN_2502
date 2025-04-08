package entity;

public class HCN {
    private float chieuDai;
    private float chieuRong;

    public HCN(float chieuDai, float chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public void tinhChuVi(){
        if(this instanceof HV) {
            System.out.println("Chu vi hinh vuong: " + (chieuDai + chieuRong) * 2);
        } else {
            System.out.println("Chu vi hinh chu nhat: " + (chieuDai + chieuRong) * 2);
        }
    }
    public void tinhDienTich(){
        System.out.println("Dien tich la : "+ (chieuDai*chieuRong));
    }
}
