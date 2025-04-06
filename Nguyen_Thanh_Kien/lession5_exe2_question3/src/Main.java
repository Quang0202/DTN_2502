import model.HinhChuNhat;
import model.HinhVuong;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HinhVuong hv = new HinhVuong(2);
        HinhChuNhat hinhChuNhat = new HinhChuNhat(3,4);
        System.out.println(hv.chuVi());
        System.out.println(hinhChuNhat.chuVi());
    }
}