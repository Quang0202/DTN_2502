package Question04;

public class Sach  extends TaiLieu {
    private String TenTacGia;
    private int sotrang;

    public Sach() {

    }

    public Sach(String TenTacGia, int sotrang) {
        this.TenTacGia = TenTacGia;
        this.sotrang = sotrang;
    }

    public Sach(String NXB, int SoBanXuatHanh, String maTaiLieu, String tenTacGia, int sotrang) {
        super(NXB, SoBanXuatHanh, maTaiLieu);
        TenTacGia = tenTacGia;
        this.sotrang = sotrang;
    }

    public String getTenTacGia() {
        return TenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        TenTacGia = tenTacGia;
    }

    public int getSotrang() {
        return sotrang;
    }

    public void setSotrang(int sotrang) {
        this.sotrang = sotrang;
    }

    @Override
    public String toString() {
        return "Sach{" +
                "TenTacGia='" + TenTacGia + '\'' +
                ", sotrang=" + sotrang +
                "} " + super.toString();
    }
}
