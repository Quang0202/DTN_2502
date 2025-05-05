package backend;

import entity.Department;
import entity.DepartmentRepository;

public class Exercise2 {
    public void question2() {
        DepartmentRepository departmentRepository = new DepartmentRepository();
        Department department = departmentRepository.getDepartmentById(2);
        System.out.println(department);
    }

    public void question3() {
        DepartmentRepository departmentRepository = new DepartmentRepository();
        Department department = departmentRepository.getDepartmentById();
        System.out.println(department);
    }

    public void question4() {
        DepartmentRepository departmentRepository = new DepartmentRepository();
        System.out.println(departmentRepository.isDepartmentNameExist("asd "));
    }

    public void question5() {
        DepartmentRepository departmentRepository = new DepartmentRepository();
        departmentRepository.createDepartment("chill");
    }
}
