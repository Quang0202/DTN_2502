package vti.accountmanagement.controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vti.accountmanagement.request.department.DepartmentCreateRequest;
import vti.accountmanagement.request.department.DepartmentUpdateRequest;
import vti.accountmanagement.service.DepartmentService;

@RestController
@RequestMapping("/api/department")
@AllArgsConstructor
public class DepartmentController {

    private final DepartmentService departmentService;

    @GetMapping("")
    public ResponseEntity<?> getDepartment() {
        return ResponseEntity.ok(departmentService.getAll());
    }

    @PostMapping("/create")
    public ResponseEntity<?> createDepartment(@RequestBody @Valid DepartmentCreateRequest department) {
        departmentService.save(department);
        return ResponseEntity.ok("Create department successfully");
    }

    @PostMapping("/update")
    public ResponseEntity<?> updateDepartment(@RequestBody @Valid DepartmentUpdateRequest department) {
        departmentService.update(department);
        return ResponseEntity.ok("Update department successfully");
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteDepartment(@PathVariable Integer id) {
        departmentService.delete(id);
        return ResponseEntity.ok("Delete department successfully");
    }

}
