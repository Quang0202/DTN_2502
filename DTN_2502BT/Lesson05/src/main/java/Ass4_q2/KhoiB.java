package Ass4_q2;

public  class KhoiB  extends ThiSinh {

    private String monThiB  = "Toan,Hoa,Sinh";

    public KhoiB(String hoTen, int soBaoDanh, String diaCHi,int KhoiUuTien, String monThiB) {
        super(hoTen, soBaoDanh, diaCHi,KhoiUuTien);
        this.monThiB = monThiB;
    }

    public KhoiB(String monThiB) {
        this.monThiB = monThiB;
    }

    public KhoiB() {
    }

    public String getMonThiB() {
        return monThiB;
    }

    public void setMonThiB(String monThiB) {
        this.monThiB = monThiB;
    }

    @Override
    public String toString() {
        return "KhoiB{" +
                "monThiB='" + monThiB + '\'' +
                "} " + super.toString();
    }
}
