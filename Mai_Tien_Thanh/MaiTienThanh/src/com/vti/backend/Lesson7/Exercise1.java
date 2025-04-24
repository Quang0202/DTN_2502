package MaiTienThanh.src.com.vti.backend.Lesson7;
import MaiTienThanh.src.com.vti.entity.Lesson7.*;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
    public void question1(List<Student> students) {
        for(Student s : students){
            System.out.println(s.toString());
        }
        Student.setCollege("Đại học Công Nghệ");
        for(Student s : students){
            System.out.println(s.toString());
        }
    }

    public void question2(List<Student> students){
        for(Student s: students){
            s.nopQuy(100);
        }
        Student.printMoneyGroup("Bước 1");

        students.get(0).layQuy(50);
        Student.printMoneyGroup("Bước 2");

        students.get(0).layQuy(20);
        Student.printMoneyGroup("Bước 3");

        students.get(0).layQuy(150);
        Student.printMoneyGroup("Bước 4");

        for(Student s: students){
            s.nopQuy(50);
        }
        Student.printMoneyGroup("Bước 5");
    }

    public void question3(){
        System.out.println("Max: " + MyMath.max(3,5));
        System.out.println("Min: " + MyMath.min(6,4));
        System.out.println("Sum: " + MyMath.sum(5,1));
    }

    public void question5(){
        Student st1 = new Student(1, "Mai");
        Student st2 = new Student(2, "Tiến");
        Student st3 = new Student(3, "Thành");
        Student st4 = new PrimaryStudent(4, "Đặng");
        Student st5 = new PrimaryStudent(5, "Khánh");
        Student st6 = new SecondaryStudent(6, "Hà");
        Student st7 = new SecondaryStudent(7, "Ba");
        Student st8 = new SecondaryStudent(8, "Càng");
        Student st9 = new SecondaryStudent(9, "Phơ");
        System.out.println("Số lượng Student: " + Student.getCountStudent());
        System.out.println("Số lượng Primary Student: " + PrimaryStudent.getCountPrimaryStudent());
        System.out.println("Số lượng Secondary Student: " + SecondaryStudent.getCountSecondaryStudent());
    }
    public void question8() throws HinhHocException{
        HinhHoc hh1 = new HinhChuNhat(3,4);
        HinhHoc hh2 = new HinhChuNhat(5,6);
        HinhHoc hh3 = new HinhChuNhat(6,1);
        HinhHoc hh4 = new HinhTron(5);
        HinhHoc hh5 = new HinhTron(3);

        System.out.println(Configs.So_LUONG_HINH_TOI_DA);
    }
}
