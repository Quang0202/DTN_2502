package backend.controllers;

import backend.services.DepartmentService;
import backend.services.IDepartmentService;
import entity.Department;

public class DepartmentController {
    private IDepartmentService departmentService;
    public DepartmentController(){
        departmentService = new DepartmentService();
    }
    public Department getDepartmentByID(int id){
        return departmentService.getDepartmentByID(id);
    }
}
