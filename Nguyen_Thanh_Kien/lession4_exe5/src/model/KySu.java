package model;

public class KySu extends CanBo {
    private String nganhDaoTao;

    @Override
    public String toString() {
        return "KySu{" +
                "nganhDaoTao='" + nganhDaoTao + '\'' +
                ", hoTen='" + super.getHoTen() + '\'' +
                ", tuoi=" + super.getTuoi() +
                ", gioiTinh=" + super.getGioiTinh() +
                ", diaChi='" + super.getDiaChi() + '\'' +
                '}';
    }

    public KySu() {
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }
}
