package MaiTienThanh.src.com.vti.backend.Lesson4;

public class CanBo {
    protected String hoTen;
    protected int tuoi;
    protected String gioiTinh;
    protected String diaChi;

    public CanBo(String hoTen, int tuoi, String gioiTinh, String diaChi){
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public void hienThi(){
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Giới tính: " + gioiTinh);
        System.out.println("Địa chỉ: " + diaChi);
    }
}
