package backend.services;

import backend.repositories.DepartmentRepository;
import backend.repositories.IDepartmentRepository;
import entity.Department;

public class DepartmentService implements IDepartmentService{
    private IDepartmentRepository departmentRepository;
    public DepartmentService(){
        departmentRepository = new DepartmentRepository();
    }
    @Override
    public Department getDepartmentByID(int id) {
        return departmentRepository.getDepartmentByID(id);
    }
}
