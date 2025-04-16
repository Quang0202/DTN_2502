package MaiTienThanh.src.com.vti.backend.Lesson5;

import java.util.ArrayList;
import java.util.List;

public class Exercise2 {
    public void question1(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Mai Tiến Thành", 1));
        students.add(new Student(2, "Đặng Khánh Hà", 1));
        students.add(new Student(3, "Mai Tiến Hà", 1));
        students.add(new Student(4, "Mai Khánh Thành", 2));
        students.add(new Student(5, "Mai Tiến Khánh", 2));
        students.add(new Student(6, "Mai Thành Hà", 2));
        students.add(new Student(7, "Đặng Tiến Hà", 2));
        students.add(new Student(8, "Đặng Khánh Thành", 3));
        students.add(new Student(9, "Đặng Tiến Khánh", 3));
        students.add(new Student(10, "Đặng Thành Hà", 3));
        System.out.println("----------Cả lớp điểm danh-----------");
        for(Student s : students){
            s.diemDanh();
        }
        System.out.println("----------Nhóm 1 đi học bài-----------");
        for(Student s : students){
            if (s.getGroup() == 1){
                s.hocBai();
            }
        }
        System.out.println("----------Nhóm 2 đi dọn vệ sinh-----------");
        for(Student s : students){
            if (s.getGroup() == 2){
                s.diDonVeSinh();
            }
        }
    }
    public void question2(){
        Student2 student = new Student2();
        student.inputInfo();
        student.showInfo();
        System.out.println("Sinh viên được nhận học bổng: " + (student.nhanHocBong() ? "Có" : "Không"));
    }

    public void question3(){
        HinhChuNhat a = new HinhChuNhat(2, 3);
        HinhChuNhat b = new HinhVuong(3);
        a.tinhDienTich();
        b.tinhDienTich();
    }

    public void question4(){
        MyMath myMath = new MyMath();

        int intSum = myMath.sum(10, 20);
        byte b1 = 5;
        byte b2 = 15;
        int byteSum = myMath.sum(b1, b2);
        float floatSum = myMath.sum(3.5f, 4.5f);

        System.out.println("Tổng int: " + intSum);
        System.out.println("Tổng byte: " + byteSum);
        System.out.println("Tổng float: " + floatSum);
    }
}
