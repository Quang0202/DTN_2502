package model;

public class Student {
    private final int id;
    private String name;
    private static int count = 0;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Student(String name) {
        count++;
        this.id = count;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Deprecated
    public int getId() {
        return id;
    }

    public String getIdNew() {
        return "MSV: " + id;
    }

    public String getName() {
        return name;
    }
}
