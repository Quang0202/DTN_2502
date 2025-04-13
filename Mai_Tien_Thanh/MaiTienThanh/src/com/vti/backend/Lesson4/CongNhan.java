package MaiTienThanh.src.com.vti.backend.Lesson4;

public class CongNhan extends CanBo{
    private int capBac;
    public CongNhan(String hoTen, int tuoi, String gioiTinh, String diaChi, int capBac){
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.capBac = capBac;
    }

    public int getCapBac() {
        return capBac;
    }
    public void setCapBac(int capBac) {
        this.capBac = capBac;
    }

    @Override
    public void hienThi(){
        super.hienThi();
        System.out.println("Cấp bậc: " + capBac);
    }
}
