package vti.accountmanagement.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
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
@Tag(name = "Department", description = "API for managing departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    @GetMapping("")
    @PreAuthorize("hasAuthority('admin:read')")
    @Operation(summary = "Get paginated list of departments", description = "Retrieve departments with optional pagination, sorting, and keyword filtering.")
    public ResponseEntity<PageResponse<DepartmentListDto>> getDepartment(
            @Parameter(description = "Page number (0-based)")
            @Min(value = 0, message = "Page must not be less than 0")
            @RequestParam(defaultValue = "0") Integer page,

            @Parameter(description = "Page size (1 to " + ConstantUtils.MAX_PAGE_SIZE + ")")
            @Max(value = ConstantUtils.MAX_PAGE_SIZE, message = "Size must not be greater than " + ConstantUtils.MAX_PAGE_SIZE)
            @Min(value = 1, message = "Size must not be less than 1")
            @RequestParam(defaultValue = "10") Integer size,

            @Parameter(description = "Sort format: field,direction (e.g. departmentId,asc)")
            @RequestParam(defaultValue = "departmentId,asc") String[] sort,

            @Parameter(description = "Keyword to search departments")
            @RequestParam(required = false, defaultValue = "") String search
    ) {
        return ResponseEntity.ok(departmentService.getAll(PageRequest.of(page, size, SortUtils.getSort(sort)), search));
    }

    @PostMapping("/create")
    @Operation(summary = "Create a new department", description = "Create a new department with the provided data.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Department created successfully"),
            @ApiResponse(responseCode = "400", description = "Invalid input data")
    })
    public ResponseEntity<String> createDepartment(
            @Parameter(description = "Department creation data")
            @RequestBody @Valid DepartmentCreateRequest department
    ) {
        departmentService.save(department);
        return ResponseEntity.ok(ConstantUtils.CREATE_SUCCESSFULLY);
    }

    @PostMapping("/update")
    @Operation(summary = "Update an existing department", description = "Update a department's details based on provided data.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Department updated successfully"),
            @ApiResponse(responseCode = "404", description = "Department not found")
    })
    public ResponseEntity<String> updateDepartment(
            @Parameter(description = "Updated department data")
            @RequestBody @Valid DepartmentUpdateRequest department
    ) {
        departmentService.update(department);
        return ResponseEntity.ok(ConstantUtils.UPDATE_SUCCESSFULLY);
    }

    @DeleteMapping("{id}")
    @Operation(summary = "Delete a department", description = "Remove a department by its ID.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Department deleted successfully"),
            @ApiResponse(responseCode = "404", description = "Department not found")
    })
    public ResponseEntity<String> deleteDepartment(
            @Parameter(description = "ID of the department to delete")
            @PathVariable Integer id
    ) {
        departmentService.delete(id);
        return ResponseEntity.ok(ConstantUtils.DELETE_SUCCESSFULLY);
    }
}
