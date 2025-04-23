package Exercise1;

public abstract class ThiSinh {
    protected String soBaoDanh;
    protected String hoTen;
    protected String diaChi;
    protected int mucUuTien;

    public ThiSinh(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        this.soBaoDanh = soBaoDanh;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.mucUuTien = mucUuTien;
    }

    public abstract String getKhoi();

    public void displayInfo() {
        System.out.println("SBD: " + soBaoDanh + ", Ho ten: " + hoTen + ", Dia chi: " + diaChi + ", Muc uu tien: " + mucUuTien + ", Khoi: " + getKhoi());
    }
}