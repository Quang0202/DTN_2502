package model;

public class Department {
    private int departmentId;
    private String departmentName;
    public Department() {
        System.out.println("Enter Id Department: ");
        this.departmentId = ScannerUtils.inputInt("Please input a number as int");
        System.out.println("Enter Name Department: ");
        this.departmentName = ScannerUtils.inputString();
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
