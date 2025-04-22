public class Kysu  extends CanBo{
    String nganhDaoTao;

    public Kysu(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }
    public Kysu() {

    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public String toString() {
        return "Kysu{" +
                "nganhDaoTao='" + nganhDaoTao + '\'' +
                ", HoVaTen='" + HoVaTen + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", address='" + address + '\'' +
                "} " + super.toString();
    }
}
