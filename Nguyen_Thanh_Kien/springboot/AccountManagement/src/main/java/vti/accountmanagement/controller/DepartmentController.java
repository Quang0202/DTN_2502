package vti.accountmanagement.controller;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import vti.accountmanagement.payload.PageResponse;
import vti.accountmanagement.request.department.DepartmentCreateRequest;
import vti.accountmanagement.request.department.DepartmentUpdateRequest;
import vti.accountmanagement.response.dto.department.DepartmentListDto;
import vti.accountmanagement.service.DepartmentService;
import vti.accountmanagement.utils.ConstantUtils;
import vti.accountmanagement.utils.SortUtils;

@RestController
@RequestMapping("/api/department")
@AllArgsConstructor
@Validated
@PreAuthorize("hasAnyRole('ADMIN','USER')")
public class DepartmentController {

    private final DepartmentService departmentService;

    @GetMapping("")
    @PreAuthorize("hasAuthority('admin:read')")
    public ResponseEntity<PageResponse<DepartmentListDto>> getDepartment(
            @Min(value = 0, message = "Page must not be less than 0")
            @RequestParam(defaultValue = "0")
            Integer page,
            @Max(value = ConstantUtils.MAX_PAGE_SIZE, message = "Size must not be greater than " + ConstantUtils.MAX_PAGE_SIZE)
            @Min(value = 1, message = "Size must not be less than 1")
            @RequestParam(defaultValue = "10")
            Integer size,
            @RequestParam(defaultValue = "departmentId,asc")
            String[] sort,
            @RequestParam(required = false, defaultValue = "")
            String search
    ) {
        return ResponseEntity.ok(departmentService.getAll(PageRequest.of(page, size, SortUtils.getSort(sort)), search));
    }

    @PostMapping("/create")
    public ResponseEntity<String> createDepartment(@RequestBody @Valid DepartmentCreateRequest department) {
        departmentService.save(department);
        return ResponseEntity.ok(ConstantUtils.CREATE_SUCCESSFULLY);
    }

    @PostMapping("/update")
    public ResponseEntity<String> updateDepartment(@RequestBody @Valid DepartmentUpdateRequest department) {
        departmentService.update(department);
        return ResponseEntity.ok(ConstantUtils.UPDATE_SUCCESSFULLY);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteDepartment(@PathVariable Integer id) {
        departmentService.delete(id);
        return ResponseEntity.ok(ConstantUtils.DELETE_SUCCESSFULLY);
    }

}
