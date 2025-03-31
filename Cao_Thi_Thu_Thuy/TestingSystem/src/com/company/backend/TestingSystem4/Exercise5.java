package com.company.backend.TestingSystem4;

public class Exercise5 {
    public void q1(){
        CongNhan congNhan = new CongNhan("Nguyễn Văn A", 30, "Nam", "Hà Nội", 5);
        KySu kySu = new KySu("Trần Thị B", 28, "Nữ", "Hồ Chí Minh", "Công nghệ thông tin");
        NhanVien nhanVien = new NhanVien("Lê Văn C", 35, "Nam", "Đà Nẵng", "Kế toán");

        System.out.println("Thông tin công nhân:");
        congNhan.hienThiThongTin();
        System.out.println("\nThông tin kỹ sư:");
        kySu.hienThiThongTin();
        System.out.println("\nThông tin nhân viên:");
        nhanVien.hienThiThongTin();
    }
    public void q2(){
        QLCB qlcb = new QLCB();
        qlcb.menu();
    }
    public void q3(){
        HighSchoolStudent hsStudent = new HighSchoolStudent(1, "Nam", "Chuyên Văn", "Đại học Công Nghệ");
        hsStudent.hienThiThongTin();
    }
    public void q4(){
        new QLTV().menu();
    }
}
