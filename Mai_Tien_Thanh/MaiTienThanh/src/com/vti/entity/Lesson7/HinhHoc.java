package MaiTienThanh.src.com.vti.entity.Lesson7;

public abstract class HinhHoc {
    public static int count = 0;
    public HinhHoc() throws HinhHocException{
        if(count >= Configs.So_LUONG_HINH_TOI_DA){
            throw new HinhHocException("Số lượng hình tối đa là: " + Configs.So_LUONG_HINH_TOI_DA);
        }
        count +=1;
    }
    public abstract double chuVi();
    public abstract double dienTich();
}
