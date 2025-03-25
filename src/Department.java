public class Department {
     int id;
     String DepartmentName;


     public Department(int id, String departmentName) {
          this.id = id;
          DepartmentName = departmentName;
     }

     @Override
     public String toString() {
          return "Department{" +
                  "id=" + id +
                  ", DepartmentName='" + DepartmentName + '\'' +
                  '}';
     }
}
