import model.Student;

import java.util.ArrayList;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Student student = new Student(1, 1, "Kien");
        students.add(student);
        student = new Student(2, 2, "Trung");
        students.add(student);
        student = new Student(3, 3, "Tuan");
        students.add(student);
        student = new Student(4, 3, "Minh");
        students.add(student);
        student = new Student(5, 2, "Hang");
        students.add(student);
        student = new Student(6, 1, "Truc");
        students.add(student);
        student = new Student(7, 2, "Vi");
        students.add(student);
        student = new Student(8, 3, "Hoang");
        students.add(student);
        student = new Student(9, 2, "Phuc");
        students.add(student);
        student = new Student(10, 1, "Hai");
        students.add(student);

        student.diemDanh(students);
        student.hocBai((ArrayList<Student>) students.stream().filter(e -> e.getGroup() == 1).collect(Collectors.toList()));
        student.donVeSinh((ArrayList<Student>) students.stream().filter(e -> e.getGroup() == 2).collect(Collectors.toList()));
    }
}