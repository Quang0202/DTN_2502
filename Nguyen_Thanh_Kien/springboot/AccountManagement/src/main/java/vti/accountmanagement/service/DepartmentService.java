package vti.accountmanagement.service;

import org.springframework.stereotype.Service;
import vti.accountmanagement.model.Department;
import vti.accountmanagement.request.department.DepartmentCreateRequest;
import vti.accountmanagement.request.department.DepartmentUpdateRequest;
import vti.accountmanagement.response.dto.department.DepartmentListDto;

import java.util.List;
import java.util.Optional;


@Service
public interface DepartmentService {
    List<DepartmentListDto> getAll();
//    Optional<T> findById(Long id);
    void save(DepartmentCreateRequest department);
    void update(DepartmentUpdateRequest department);
    void delete(Integer id);
}
