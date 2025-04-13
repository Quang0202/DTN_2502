package MaiTienThanh.src.com.vti.backend.Lesson4;
import java.util.ArrayList;
import java.util.Scanner;
public class Exercise5 {
    public void question1(){
        CongNhan congNhan = new CongNhan("Nguyễn Văn A", 30, "Nam", "Hà Nội", 5);
        KySu kySu = new KySu("Trần Thị B", 28, "Nữ", "Hồ Chí Minh", "Công nghệ thông tin");
        NhanVien nhanVien = new NhanVien("Lê Văn C", 35, "Nam", "Đà Nẵng", "Kế toán");

        System.out.println("Thông tin công nhân:");
        congNhan.hienThi();
        System.out.println("\nThông tin kỹ sư:");
        kySu.hienThi();
        System.out.println("\nThông tin nhân viên:");
        nhanVien.hienThi();
    }
    public void question2(){
        QLCB qlcb = new QLCB();
        qlcb.menuLuaChon();
    }
}
