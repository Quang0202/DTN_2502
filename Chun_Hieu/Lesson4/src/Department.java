public class Department {
    private int Departmentid;
    private String DepartmentName;
    private String DepartmentAddress;


    public Department(int departmentid, String departmentName, String departmentAddress) {
        Departmentid = departmentid;
        DepartmentName = departmentName;
        DepartmentAddress = departmentAddress;
    }

    public int getDepartmentid() {
        return Departmentid;
    }

    public void setDepartmentid(int departmentid) {
        Departmentid = departmentid;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String departmentName) {
        DepartmentName = departmentName;
    }

    public String getDepartmentAddress() {
        return DepartmentAddress;
    }

    public void setDepartmentAddress(String departmentAddress) {
        DepartmentAddress = departmentAddress;
    }
}
