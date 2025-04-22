package Ass4_q2;

public  class KhoiC  extends  ThiSinh{
  private String monThiC  ="Van,Su,Dia";

    public KhoiC(String hoTen, int soBaoDanh, String diaCHi,int KhoiUuTien, String monThiC) {
        super(hoTen, soBaoDanh, diaCHi, KhoiUuTien);
        this.monThiC = monThiC;
    }

    public KhoiC(String monThiC) {
        this.monThiC = monThiC;
    }

    public KhoiC( ) {

    }

    public String getMonThiC() {
        return monThiC;
    }

    public void setMonThiC(String monThiC) {
        this.monThiC = monThiC;
    }

    @Override
    public String toString() {
        return "KhoiC{" +
                "monThiC='" + monThiC + '\'' +
                "} " + super.toString();
    }
}
