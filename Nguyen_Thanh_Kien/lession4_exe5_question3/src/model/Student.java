package model;

public abstract class Student extends Person {
    private int id;

    public Student(int id, String name) {
        super(name);
        this.id = id;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
