package vti.be.assignmentday09.exercise03;

public class Student<T>  {
    T id;

    public Student(T id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    String name;

}
