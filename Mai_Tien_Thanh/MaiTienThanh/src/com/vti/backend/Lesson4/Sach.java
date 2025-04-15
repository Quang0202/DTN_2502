package MaiTienThanh.src.com.vti.backend.Lesson4;

public class Sach extends TaiLieu{
    private String bookCreator;
    private int pageNumb;

    public Sach(String code, String creator, int createAmount, String bookCreator, int pageNumb) {
        super(code, creator, createAmount);
        this.bookCreator = bookCreator;
        this.pageNumb = pageNumb;
    }
    @Override
    public void hienThi(){
        System.out.println("Sách");
        System.out.println("Mã: " + code);
        System.out.println("Nhà xuất bản: " + creator);
        System.out.println("Số bản phát hành: " + createAmount);
        System.out.println("Tác giả: " + bookCreator);
        System.out.println("Số trang: " + pageNumb);
    }

}
