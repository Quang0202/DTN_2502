package Ex2Q2_SYSTEM5;

import java.util.Date;
import java.util.Scanner;

public class Person {
    String name;
    String GioiTinh;
    String date;
    String Address;

    public Person(String name, String gioiTinh, String date, String address) {
        this.name = name;
        this.GioiTinh = gioiTinh;
        this.date = date;
        Address = address;
    }
    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        GioiTinh = gioiTinh;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    void inputInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        name = scanner.nextLine();
        System.out.print("Nhập giới tính: ");
        GioiTinh = scanner.nextLine();
        System.out.print("Nhập ngày sinh (dd/mm/yyyy): ");
        date = scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        Address = scanner.nextLine();    }
    void showInfo() {
        System.out.println(name + " sex: " + GioiTinh + " date: " + date + " address: " + Address);
    }
}
