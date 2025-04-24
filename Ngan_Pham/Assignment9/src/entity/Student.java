package entity;

public class Student {
    private static int counter = 0;
    private int id;
    private String name;

    public Student(String name) {
        this.id = ++counter;
        this.name = name;
    }

    @Deprecated
    public int getId() {
        return id;
    }

    public String getFormattedId() {
        return "MSV: " + id;
    }

    public String getName() {
        return name;
    }
}
