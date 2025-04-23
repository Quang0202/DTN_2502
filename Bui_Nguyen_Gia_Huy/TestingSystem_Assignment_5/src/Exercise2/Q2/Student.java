package Exercise2.Q2;

import java.util.Scanner;

public class Student extends Person {
    private String maSV;
    private float diemTB;
    private String email;

    public Student() {
        super();
    }

    public Student(String ten, String gioiTinh, String ngaySinh, String diaChi,
                    String maSV, float diemTB, String email) {
        super(ten, gioiTinh, ngaySinh, diaChi);
        this.maSV = maSV;
        this.diemTB = diemTB;
        this.email = email;
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên: ");
        maSV = scanner.nextLine();
        System.out.print("Nhập điểm trung bình: ");
        diemTB = scanner.nextFloat();
        scanner.nextLine(); // Consume newline
        System.out.print("Nhập email: ");
        email = scanner.nextLine();
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Mã SV: " + maSV);
        System.out.println("Điểm TB: " + diemTB);
        System.out.println("Email: " + email);
        System.out.println("Có học bổng: " + (isHocBong() ? "Có" : "Không"));
    }

    public boolean isHocBong() {
        return diemTB >= 8.0;
    }
}