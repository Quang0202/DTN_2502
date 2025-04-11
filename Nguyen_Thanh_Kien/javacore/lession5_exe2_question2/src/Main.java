import model.Gender;
import model.Student;

import java.time.LocalDate;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static ArrayList<Student> students = new ArrayList<Student>();

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("John");
        student.setBirthday(LocalDate.parse("2000-02-02"));
        student.setEmail("john@gmail.com");
        student.setGender(Gender.Nam);
        student.setAddress("Ha Noi");
        student.setCode("12345");
        student.setAverage(9.0);
        students.add(student);
        for (Student s : students) {
            s.showInfo();
            System.out.println(s.checkScholarship());
        }

        students.add(student.inputInfo());
    }
}