import java.io.Serializable;

public class Department implements Serializable {
    private int departmentId;
    private String name;
    private transient int salary;

    public Department(int departmentId, String name) {
        this.departmentId = departmentId;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
