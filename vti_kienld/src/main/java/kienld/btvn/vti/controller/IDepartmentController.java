package kienld.btvn.vti.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import kienld.btvn.vti.entity.Department;

public interface IDepartmentController {
    public ResponseEntity<List<Department>>  getAllDepartmentController();

    public  Department  CreateNewDepartmentController(Department department);
    public  Department  UpdateDepartmentController(Integer id, Department department);
    public  String  DeleteDepartmentController(Integer id);

}
