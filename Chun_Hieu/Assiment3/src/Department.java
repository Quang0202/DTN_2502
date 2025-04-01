public class Department {
    int departmentId;
    String departmentName;
    public Department(int departmentId, String departmentName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
    public String getName() {
        return departmentName;
    }

    public boolean equals(Department other) {
        return this.departmentName.equalsIgnoreCase(other.departmentName);
    }
}
