package MaiTienThanh.src.com.vti.frontend.Lesson7;
import MaiTienThanh.src.com.vti.backend.Lesson7.*;
import MaiTienThanh.src.com.vti.entity.Lesson7.*;
import java.util.ArrayList;
import java.util.List;

public class Program1 {
    public static void main(String[] args) throws HinhHocException {
        Exercise1 exercise = new Exercise1();

        Student stu1 = new Student(1, "Nguyễn Văn A");
        Student stu2 = new Student(2, "Nguyễn Văn B");
        Student stu3 = new Student(3, "Nguyễn Văn C");
        List<Student> students = new ArrayList<>();
        students.add(stu1);
        students.add(stu2);
        students.add(stu3);
        exercise.question1(students);
        exercise.question2(students);
        exercise.question3();
        exercise.question5();
        exercise.question8();
    }
}
