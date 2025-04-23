package MaiTienThanh.src.com.vti.backend.Lesson7;

import MaiTienThanh.src.com.vti.entity.Lesson7.Student;

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

}
