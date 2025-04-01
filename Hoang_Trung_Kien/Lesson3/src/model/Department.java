package model;

import java.util.Objects;

public class Department {
    int getDepartmentId;
    String departmentName;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(departmentName, that.departmentName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(departmentName);
    }

    @Override
    public String toString() {
        return "model.Department{" +
                "departmentId=" + getDepartmentId +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }

    public void setDepartmentId(int getDepartmentId) {
        this.getDepartmentId = getDepartmentId;
    }

    public int getDepartmentId() {
        return getDepartmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
