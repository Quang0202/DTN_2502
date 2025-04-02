package model;

public class NhanVien extends CanBo{
    private String congViec;

    public NhanVien() {
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "congViec='" + congViec + '\'' +
                ", hoTen='" + super.getHoTen() + '\'' +
                ", tuoi=" + super.getTuoi() +
                ", gioiTinh=" + super.getGioiTinh() +
                ", diaChi='" + super.getDiaChi() + '\'' +
                '}';
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }
}
