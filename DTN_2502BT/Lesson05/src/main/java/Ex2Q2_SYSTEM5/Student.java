package Ex2Q2_SYSTEM5;

import java.util.Scanner;

public class Student extends Person {
    private String name;
    private double diemtrungbinh;
    private String email;

    public Student(String name, String GioiString, String date, String address, String name1, double diemtrungbinh, String email) {
        super(name, GioiString, date, address);
        this.name = name1;
        this.diemtrungbinh = diemtrungbinh;
        this.email = email;
    }
public Student() {

}
    public Student(String name, double diemtrungbinh, String email) {
        this.name = name;
        this.diemtrungbinh = diemtrungbinh;
        this.email = email;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public double getDiemtrungbinh() {
        return diemtrungbinh;
    }

    public void setDiemtrungbinh(double diemtrungbinh) {
        this.diemtrungbinh = diemtrungbinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
//    public String toString() {
//        return "Student{" +
//                "Address='" + Address + '\'' +
//                ", date='" + date + '\'' +
//                ", age=" + GioiTinh +
//                ", name='" + name + '\'' +
//                ", email='" + email + '\'' +
//                ", diemtrungbinh=" + diemtrungbinh +
//                ", name='" + name + '\'' +
//                "} " + super.toString();
//    }
    public void inputInfo() {
        super.inputInfo(); // Gọi input của Person
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên: ");
        diemtrungbinh = scanner.nextDouble();
        System.out.print("Nhập email: ");
        email = scanner.nextLine();
    }

    public void showInfo() {
        super.showInfo();
    }

    public void XetDiemtrungbinh() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("vui long nhap dien ");
        diemtrungbinh = scanner.nextDouble();
        if (diemtrungbinh > 8) {
            System.out.println("duoc hoc bong");
        }
        else {
            System.out.println("co gang lan toi");
        }
    }
}
