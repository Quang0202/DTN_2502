package backend;

import entity.Department;
import entity.DepartmentRepository;

public class Exercise2 {
    public void ques2() {
        DepartmentRepository departmentRepository = new DepartmentRepository();
        Department department = departmentRepository.getDepartmentById(2);
        System.out.println(department);
    }

    public void ques3() {
        DepartmentRepository departmentRepository = new DepartmentRepository();
        Department department = departmentRepository.getDepartmentById();
        System.out.println(department);
    }

    public void ques4() {
        DepartmentRepository departmentRepository = new DepartmentRepository();
        System.out.println(departmentRepository.isDepartmentNameExist("asd "));
    }

    public void ques5() {
        DepartmentRepository departmentRepository = new DepartmentRepository();
        departmentRepository.createDepartment("chill");
    }
}
