package vti.accountmanagement.service;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vti.accountmanagement.payload.PageResponse;
import vti.accountmanagement.request.department.DepartmentCreateRequest;
import vti.accountmanagement.request.department.DepartmentUpdateRequest;
import vti.accountmanagement.response.dto.department.DepartmentListDto;



@Service
public interface DepartmentService {
    PageResponse<DepartmentListDto> getAll(Pageable pageable, String search);
    void save(DepartmentCreateRequest department);
    void update(DepartmentUpdateRequest department);
    void delete(Integer id);
}
