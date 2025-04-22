public class NhanVien extends CanBo{
    String congViec;

    public NhanVien() {

    }
    public NhanVien(String congViec) {
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "congViec='" + congViec + '\'' +
                ", HoVaTen='" + HoVaTen + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", address='" + address + '\'' +
                "} " + super.toString();
    }
}
