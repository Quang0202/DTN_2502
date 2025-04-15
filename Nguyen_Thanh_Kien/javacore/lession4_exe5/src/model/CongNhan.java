package model;

public class CongNhan extends CanBo{
    private int bac;

    @Override
    public String toString() {
        return "CongNhan{" +
                "bac=" + bac +
                ", hoTen='" + super.getHoTen() + '\'' +
                ", tuoi=" + super.getTuoi() +
                ", gioiTinh=" + super.getGioiTinh() +
                ", diaChi='" + super.getDiaChi() + '\'' +
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
