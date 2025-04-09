package backend;

import model2_1.Student;

public class Exercise2 {
    public void ques1a() {
        Student student1 = new Student("a", 1, 1);
        Student student2 = new Student("b", 2, 2);
        Student student3 = new Student("c", 3, 3);
        Student student4 = new Student("d", 4, 2);
        Student student5 = new Student("e", 5, 3);
        Student student6 = new Student("f", 6, 1);
        Student student7 = new Student("g", 7, 2);
        Student student8 = new Student("h", 8, 1);
        Student student9 = new Student("j", 9, 1);
        Student student10 = new Student("i", 10, 1);
        Student[] students = {student1, student2, student6, student10, student3, student7, student5, student9, student4, student8};
    }

    public void ques1b(Student[] students) {
        for (Student student : students) {
            student.diemDanh();
        }
    }

    public void ques1c(Student[] students) {
        for (Student student : students) {
            if (student.getGroup() == 1)
                student.hocBai();
        }
    }

    public void ques1d(Student[] students) {
        for (Student student : students) {
            if (student.getGroup() == 2)
                student.donVeSinh();
        }
    }
}
