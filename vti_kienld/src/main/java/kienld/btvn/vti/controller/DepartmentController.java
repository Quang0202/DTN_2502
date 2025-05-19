package kienld.btvn.vti.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kienld.btvn.vti.entity.Department;
import kienld.btvn.vti.services.DepartmentServices;
@RestController
@RequestMapping("/api/v1/department")
public class DepartmentController implements IDepartmentController{

    private final DepartmentServices departmentServices;

    public DepartmentController(DepartmentServices departmentServices) {
        this.departmentServices = departmentServices;
    }



    @GetMapping("")
    public ResponseEntity<List<Department>> getAllDepartmentController() {
        
        List<Department> departments = departmentServices.getAllDepartment(); 
        return ResponseEntity.ok(departments);
    }
    @PostMapping("")
    public Department CreateNewDepartmentController(@RequestBody  Department department) {
        
        Department departments = departmentServices.CreateNewDepartment(department);
        return departments;
    }
    @PutMapping("/{id}")
    public Department UpdateDepartmentController(@PathVariable Integer id , @RequestBody  Department department ) {
            Department departments = departmentServices.UpdateDepartment(id, department);

        return departments;
    }  




        @DeleteMapping("/{id}")
    public String DeleteDepartmentController(@PathVariable Integer id ) {
            departmentServices.DeleteDepartment(id);

        return "Delete Success!";
    }  
}





