package vti.accountmanagement.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vti.accountmanagement.exception.NotFoundException;
import vti.accountmanagement.exception.DuplicateException;
import vti.accountmanagement.model.Account;
import vti.accountmanagement.model.Department;
import vti.accountmanagement.payload.PageResponse;
import vti.accountmanagement.repository.AccountRepository;
import vti.accountmanagement.repository.DepartmentRepository;
import vti.accountmanagement.request.department.DepartmentCreateRequest;
import vti.accountmanagement.request.department.DepartmentUpdateRequest;
import vti.accountmanagement.response.dto.department.DepartmentListDto;
import vti.accountmanagement.service.DepartmentService;
import vti.accountmanagement.utils.MessageUtil;
import vti.accountmanagement.utils.ObjectMapperUtils;

import java.util.List;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;
    private final AccountRepository accountRepository;
    private final MessageSource messageSource;
    private final ObjectMapperUtils objectMapperUtils = new ObjectMapperUtils();
    private static final String DEPARTMENT_ID_NOT_EXISTS = "department.id.not.exists";
    private static final String DEPARTMENT_NAME_EXISTS = "department.name.exists";

    @Override
    public PageResponse<DepartmentListDto> getAll(Pageable pageable, String search) {
        Page<Department> departments = departmentRepository.findAll(pageable, search);
        return new PageResponse<>(objectMapperUtils.mapEntityPageIntoDtoPage(departments, DepartmentListDto.class));
    }

    @Override
    public void save(DepartmentCreateRequest department) {
        if (departmentRepository.findByDepartmentName(department.getDepartmentName()) == null) {
            Department dep = objectMapperUtils.map(department, Department.class);
            departmentRepository.save(dep);
        } else {
            throw new DuplicateException(MessageUtil.getMessage(DEPARTMENT_NAME_EXISTS));
        }
    }

    @Override
    public void update(DepartmentUpdateRequest department) {
        Department dep = departmentRepository.findById(department.getDepartmentId()).orElse(null);
        if (dep == null) {
            throw new NotFoundException(MessageUtil.getMessage(DEPARTMENT_ID_NOT_EXISTS));
        }
        if (departmentRepository.findByDepartmentNameAndDepartmentIdNot(department.getDepartmentName(), department.getDepartmentId()) == null) {
            dep = objectMapperUtils.map(department, Department.class);
            departmentRepository.save(dep);
        } else {
            throw new DuplicateException(MessageUtil.getMessage(DEPARTMENT_NAME_EXISTS));
        }
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        Department department = departmentRepository.findByDepartmentId(id);
        if (department == null) {
            throw new NotFoundException(MessageUtil.getMessage(DEPARTMENT_ID_NOT_EXISTS));
        }
        List<Account> accounts = accountRepository.findByDepartment_DepartmentId(id);
        if (accounts != null && !accounts.isEmpty()) {
            throw new NotFoundException(MessageUtil.getMessage("department.id.exists.reference.key.account"));
        }
        departmentRepository.delete(department);
    }
}
