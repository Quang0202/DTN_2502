package vti.be.assignmentday08.exercise05;
import java.io.Serializable;

public class Student implements Serializable {
    public Student() {
        this.id = ScanerUtils.input_studentid("Student ID");
        this.name = ScanerUtils.input_studentname("Student Name");
    }
    int id;
    String name;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
