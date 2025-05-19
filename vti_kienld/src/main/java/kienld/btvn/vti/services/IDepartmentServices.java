package kienld.btvn.vti.services;

import java.util.List;

import kienld.btvn.vti.entity.Department;

public interface IDepartmentServices {
    public List<Department> getAllDepartment();

    public Department CreateNewDepartment(Department department);


    public Department UpdateDepartment(Integer id,  Department department);
    public void DeleteDepartment(Integer id);

}
