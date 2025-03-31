package model;

public class CongNhan extends CanBo{
    private int bac;

    @Override
    public String toString() {
        return "CongNhan{" +
                "bac=" + bac +
                ", hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh=" + gioiTinh +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }

    public CongNhan() {
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }
}
