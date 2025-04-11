package vti.accountmanagement.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import vti.accountmanagement.exception.CustomException;
import vti.accountmanagement.model.Account;
import vti.accountmanagement.model.Department;
import vti.accountmanagement.repository.AccountRepository;
import vti.accountmanagement.repository.DepartmentRepository;
import vti.accountmanagement.request.department.DepartmentCreateRequest;
import vti.accountmanagement.request.department.DepartmentUpdateRequest;
import vti.accountmanagement.response.dto.department.DepartmentListDto;
import vti.accountmanagement.service.DepartmentService;
import vti.accountmanagement.utils.ObjectMapperUtils;

import java.util.List;
import java.util.Locale;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;
    private final AccountRepository accountRepository;
    private final MessageSource messageSource;

    @Override
    public List<DepartmentListDto> getAll() {
        return ObjectMapperUtils.mapAll(departmentRepository.findAll(), DepartmentListDto.class);
    }

    @Override
    public void save(DepartmentCreateRequest department) {
        if (departmentRepository.findByDepartmentName(department.getDepartmentName()) == null) {
            Department dep = ObjectMapperUtils.map(department, Department.class);
            departmentRepository.save(dep);
        } else {
            throw new CustomException(messageSource.getMessage("department.name.exists", null, Locale.ENGLISH));
        }
    }

    @Override
    public void update(DepartmentUpdateRequest department) {
        Department dep = departmentRepository.findById(department.getDepartmentId()).orElse(null);
        if (dep == null) {
            throw new CustomException(messageSource.getMessage("department.id.not.exists", null, Locale.ENGLISH));
        }
        if (departmentRepository.findByDepartmentNameAndDepartmentIdNot(department.getDepartmentName(), department.getDepartmentId()) == null) {
            dep = ObjectMapperUtils.map(department, Department.class);
            departmentRepository.save(dep);
        } else {
            throw new CustomException(messageSource.getMessage("department.name.exists", null, Locale.ENGLISH));
        }
    }

    @Override
    public void delete(Integer id) {
        Department department = departmentRepository.findByDepartmentId(id);
        if (department == null) {
            throw new CustomException(messageSource.getMessage("department.id.not.exists", null, Locale.ENGLISH));
        }
        List<Account> accounts = accountRepository.findByDepartment_DepartmentId(id);
        if (accounts != null && !accounts.isEmpty()) {
            throw new CustomException(messageSource.getMessage("department.id.exists.reference.key.account", null, Locale.ENGLISH));
        }
        departmentRepository.delete(department);
    }
}
