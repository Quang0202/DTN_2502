package MaiTienThanh.src.com.vti.backend.Lesson4;

public class Bao extends TaiLieu{
    private int createDay;

    public Bao(String code, String creator, int createAmount, int createDay){
        super(code, creator, createAmount);
        this.createDay = createDay;
    }

    @Override
    public void hienThi(){
        System.out.println("Báo");
        System.out.println("Mã: " + code);
        System.out.println("Nhà xuất bản: " + creator);
        System.out.println("Số bản phát hành: " + createAmount);
        System.out.println("Ngày phát hành " + createDay);
    }
}
