package MaiTienThanh.src.com.vti.backend.Lesson4;

public class KySu extends CanBo {
    private String nganhDaoTao;
    public KySu(String hoTen, int tuoi, String gioiTinh, String diaChi, String nganhDaoTao){
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }
    public void NganhDaoTao(String nganhDaoTao){
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public void hienThi(){
        super.hienThi();
        System.out.println("Ngành đào tạo: " + nganhDaoTao);
    }
}
