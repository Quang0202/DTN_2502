package model3;

public class HCN {
    private float chieuDai;
    private float chieuRong;

    public HCN(float chieuDai, float chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public HCN(float chieuDai) {
        this.chieuDai = chieuDai;
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

    public void tinhChuVi() {
        if (this instanceof HV) {
            System.out.println("CV hinh vuong:" + (chieuDai + chieuRong)*2);
        } else {
            System.out.println("CV hinh chu nhat:" + (chieuDai + chieuRong)*2);
        }
    }

    public void tinhDienTich() {
        if (this instanceof HV) {
            System.out.println("S hinh vuong:" + chieuDai * chieuRong);
        } else {
            System.out.println("S hinh chu nhat:" + chieuDai * chieuRong);
        }
    }
}
