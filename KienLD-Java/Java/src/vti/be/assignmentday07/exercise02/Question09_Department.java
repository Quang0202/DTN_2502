package vti.be.assignmentday07.exercise02;

public class Question09_Department {
    public Question09_Department() {
        this.department_id = Utils.input_departmentid("Enter department ID");
        this.department_name = Utils.input_departmentname("Enter department Name");
    }

    @Override
    public String toString() {
        return "Question09_Department{" +
                "department_id=" + department_id +
                ", department_name='" + department_name + '\'' +
                '}';
    }
    int department_id;
    String department_name;

}
