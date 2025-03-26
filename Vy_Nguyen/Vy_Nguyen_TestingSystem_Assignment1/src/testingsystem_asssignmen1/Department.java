package testingsystem_asssignmen1;

public class Department {

        public int departmentId;
        public String departmentName;

        public Department(int departmentId, String departmentName){
            this.departmentId = departmentId;
            this.departmentName = departmentName;
        }

        // Override toString(): need this method if want to print object out nicely
        @Override
        public String toString() {
            return "Department{" +
                    "id=" + departmentId +
                    ", name='" + departmentName + '\'' +
                    '}';
        }



}
