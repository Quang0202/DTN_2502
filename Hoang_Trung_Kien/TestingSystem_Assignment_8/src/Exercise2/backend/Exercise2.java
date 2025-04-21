package Exercise2.backend;

import Exercise2.entity.Student;

import java.util.ArrayList;
import java.util.Comparator;

public class Exercise2 {
    public void ques1() {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("nve", "21/12/2003"));
        students.add(new Student("nvd", "11/04/2003"));
        students.add(new Student("nvc", "01/03/2003"));
        students.add(new Student("nvd", "15/02/2003"));
        students.add(new Student("nve", "19/01/2003"));

        students.sort(Student::compareTo);

        for (Student s : students) {
            System.out.println(s);
        }
    }

    public void ques2() {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("nve", "21/12/2003"));
        students.add(new Student("nvd", "11/04/2003"));
        students.add(new Student("nvc", "01/03/2003"));
        students.add(new Student("nvb", "15/02/2003"));
        students.add(new Student("nve", "19/01/2003"));

        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        for (Student s : students) {
            System.out.println(s);
        }
    }
}
