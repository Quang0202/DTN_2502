public class Department {
    public int id;
    public String departmentName;

    public Department(int id, String name) {
        this.id = id;
        this.departmentName = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
