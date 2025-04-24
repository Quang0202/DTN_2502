package Exercise2.Q2;

import java.util.Scanner;

public class Person {
    protected String ten;
    protected String gioiTinh;
    protected String ngaySinh;
    protected String diaChi;

    public Person() {}

    public Person(String ten, String gioiTinh, String ngaySinh, String diaChi) {
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        ten = scanner.nextLine();
        System.out.print("Nhập giới tính: ");
        gioiTinh = scanner.nextLine();
        System.out.print("Nhập ngày sinh: ");
        ngaySinh = scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        diaChi = scanner.nextLine();
    }

    public void showInfo() {
        System.out.println("Tên: " + ten);
        System.out.println("Giới tính: " + gioiTinh);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Địa chỉ: " + diaChi);
    }
}
