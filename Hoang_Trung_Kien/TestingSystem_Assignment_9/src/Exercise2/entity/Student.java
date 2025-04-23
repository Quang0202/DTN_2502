package Exercise2.entity;

public class Student {
    private static int count;
    private int id;
    private String name;

    public Student(String name) {
        count++;
        id = count;
        this.name = name;
    }

    /**
     * Use getMSV() instead!
     */
    @Deprecated
    public int getId() {
        return id;
    }

    public String getMSV() {
        return "MSV: " + id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
