package vti.accountmanagement.controller;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import vti.accountmanagement.request.department.DepartmentCreateRequest;
import vti.accountmanagement.request.department.DepartmentUpdateRequest;
import vti.accountmanagement.service.DepartmentService;
import vti.accountmanagement.utils.ConstantUtils;
import vti.accountmanagement.utils.SortUtils;

@RestController
@RequestMapping("/api/department")
@AllArgsConstructor
@Validated
public class DepartmentController {

    private final DepartmentService departmentService;

    @GetMapping("")
    public ResponseEntity<?> getDepartment(
            @Min(value = 0, message = "Page must not be less than 0")
            @RequestParam(defaultValue = "0")
            Integer page,
            @Max(value = ConstantUtils.MAX_PAGE_SIZE, message = "Size must not be greater than " + ConstantUtils.MAX_PAGE_SIZE)
            @Min(value = 1, message = "Size must not be less than 1")
            @RequestParam(defaultValue = "10")
            Integer size,
            @RequestParam(defaultValue = "departmentId,asc")
            String[] sort
    ) {
        return ResponseEntity.ok(departmentService.getAll(PageRequest.of(page, size, SortUtils.getSort(sort))));
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
