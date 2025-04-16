package MaiTienThanh.src.com.vti.backend.Lesson4;

public class TapChi extends TaiLieu{
    private int createNo;
    private int createMonth;

    public TapChi(String code, String creator, int createAmount, int createNo, int createMonth) {
        super(code, creator, createAmount);
        this.createNo = createNo;
        this.createMonth = createMonth;
    }

    @Override
    public void hienThi(){
        System.out.println("Tạp chí");
        System.out.println("Mã: " + code);
        System.out.println("Nhà xuất bản: " + creator);
        System.out.println("Số bản phát hành: " + createAmount);
        System.out.println("Số phát hành: " + createNo);
        System.out.println("Tháng phát hành: " + createMonth);
    }
}
