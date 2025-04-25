package entity;

public class Student {
    private static int COUNT = 0;
    private final int id;
    private String name;

    public Student(String name) {
        this.id = ++COUNT;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Deprecated
    /**
     * @deprecated Please use getIdWithPrefix() instead.
     */
    public int getId() {
        return id;
    }

    public String getIdWithPrefix() {
        return "MSV: " + id;
    }
}
