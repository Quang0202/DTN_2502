package MaiTienThanh.src.com.vti.entity.Lesson7;

public class HinhChuNhat extends HinhHoc{
    private double chieudai;
    private double chieurong;

    public HinhChuNhat(double chieudai,double chieurong) throws HinhHocException{
        super();
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }
    @Override
    public double chuVi(){
        return 2*chieudai + 2*chieurong;
    }
    public double dienTich(){
        return chieudai*chieurong;
    }
}
