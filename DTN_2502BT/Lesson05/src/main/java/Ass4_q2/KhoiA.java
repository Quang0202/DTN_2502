package Ass4_q2;

public  class KhoiA extends ThiSinh {
private String monThi ;

    public KhoiA(String hoTen, int soBaoDanh, String diaCHi,int KhoiUuTien, String monThi) {
        super(hoTen, soBaoDanh, diaCHi, KhoiUuTien);
        this.monThi = monThi;
    }

    public KhoiA(String monThi) {
        this.monThi = monThi;
    }

    public KhoiA() {
    }

    public String getMonThi() {
        return monThi;
    }

    public void setMonThi(String monThi) {
        this.monThi = monThi;
    }

    @Override
    public String toString() {
        return "KhoiA{" +
                "monThi='" + monThi + '\'' +
                "} " + super.toString();
    }
}
