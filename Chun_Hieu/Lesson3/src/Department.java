import java.util.Objects;

public class Department {
    String DepartmentName;
    int DepartmentID;

//    public Department(int id, String name) {
//        this.DepartmentID = id;
//        this.DepartmentName = name;
//    }

    @Override
    public String toString() {
        return "Department{" +
                "DepartmentName='" + DepartmentName + '\'' +
                ", DepartmentID=" + DepartmentID +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(DepartmentName, that.DepartmentName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(DepartmentName);
    }
}
