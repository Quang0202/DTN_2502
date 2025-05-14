package Exercise2.backend;

import Exercise2.entity.Student;

import java.util.Date;

public class Exercise2 {
    public void ques1() {
        @SuppressWarnings("deprecation")
        Date date = new Date(2020, 4, 18);
    }

    public void ques2() {
        Student student = new Student("Nguyen Van A");
        System.out.println(student.getName());
        System.out.println(student.getId());
    }
}
