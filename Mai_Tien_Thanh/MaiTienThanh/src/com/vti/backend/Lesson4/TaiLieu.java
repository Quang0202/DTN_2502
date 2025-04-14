package MaiTienThanh.src.com.vti.backend.Lesson4;

public abstract class TaiLieu {
    protected String code;
    protected String creator;
    protected int createAmount;

    public TaiLieu(String code, String creator, int createAmount) {
        this.code = code;
        this.creator = creator;
        this.createAmount = createAmount;
    }

    public String getCode() {
        return code;
    }
    public abstract void hienThi();
}
