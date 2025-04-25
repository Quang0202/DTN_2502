package vti.be.assignmentday09.exercise01;
import java.io.Serializable;
public class Student implements Serializable {
    private static int counter = 1;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Student(String name) {
        this.id = counter++;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    private int id;
    private String name;

}
