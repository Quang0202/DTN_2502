package Exercise2;

public class Q4_Department {
    private int id;
    private String name;

    public Q4_Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{id=" + id + ", name='" + name + "'}";
    }
}
