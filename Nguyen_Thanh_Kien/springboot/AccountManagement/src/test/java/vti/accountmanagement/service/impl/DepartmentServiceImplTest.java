package vti.accountmanagement.service.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.context.MessageSource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.util.ReflectionTestUtils;
import vti.accountmanagement.exception.DuplicateException;
import vti.accountmanagement.exception.NotFoundException;
import vti.accountmanagement.model.Department;
import vti.accountmanagement.repository.AccountRepository;
import vti.accountmanagement.repository.DepartmentRepository;
import vti.accountmanagement.request.department.DepartmentCreateRequest;
import vti.accountmanagement.request.department.DepartmentUpdateRequest;
import vti.accountmanagement.utils.MessageUtil;
import vti.accountmanagement.utils.ObjectMapperUtils;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class DepartmentServiceImplTest {

    @Mock
    private AccountRepository accountRepository;

    @Mock
    private DepartmentRepository departmentRepository;

    @Mock
    MessageSource messageSource;

    @InjectMocks
    private DepartmentServiceImpl departmentService;

    private final ObjectMapperUtils objectMapperUtils = new ObjectMapperUtils();

    @BeforeEach
    void setUp() {
        ReflectionTestUtils.setField(departmentService, "objectMapperUtils", objectMapperUtils);
        MessageUtil.messageSource = messageSource;
        lenient().when(messageSource.getMessage(anyString(), any(), any()))
                .thenAnswer(invocation -> invocation.getArgument(0));
    }

    @Test
    void getAll_success() {
        Pageable pageable = PageRequest.of(0, 10);
        Department department = new Department(1,"name");

        Page<Department> page = new PageImpl<>(List.of(department));

        when(departmentRepository.findAll(pageable, null)).thenReturn(page);

        var result = departmentService.getAll(pageable, null);

        assertEquals(1, result.getContent().size());
    }

    @Test
    void save_success() {
        DepartmentCreateRequest request = new DepartmentCreateRequest("name");

        when(departmentRepository.findByDepartmentName("name")).thenReturn(null);

        departmentService.save(request);

        verify(departmentRepository, times(1)).save(any(Department.class));
    }

    @Test
    void save_duplicateName() {
        DepartmentCreateRequest request = new DepartmentCreateRequest("name");

        when(departmentRepository.findByDepartmentName("name")).thenReturn(new Department(1,"name"));

        DuplicateException ex = assertThrows(DuplicateException.class, () -> departmentService.save(request));
        assertTrue(ex.getMessage().contains("department.name.exists"));
    }

    @Test
    void update_success() {
        DepartmentUpdateRequest request = new DepartmentUpdateRequest();
        request.setDepartmentId(1);
        request.setDepartmentName("NewName");

        Department existing = new Department(1, "OldName");

        when(departmentRepository.findById(1)).thenReturn(Optional.of(existing));
        when(departmentRepository.findByDepartmentNameAndDepartmentIdNot("NewName", 1)).thenReturn(null);

        departmentService.update(request);

        ArgumentCaptor<Department> captor = ArgumentCaptor.forClass(Department.class);
        verify(departmentRepository).save(captor.capture());

        Department savedDep = captor.getValue();
        assertEquals("NewName", savedDep.getDepartmentName());
        assertEquals(1, savedDep.getDepartmentId());
    }


    @Test
    void update_departmentNotFound() {
        DepartmentUpdateRequest request = new DepartmentUpdateRequest();
        request.setDepartmentId(1);

        when(departmentRepository.findById(1)).thenReturn(Optional.empty());

        NotFoundException ex = assertThrows(NotFoundException.class, () -> departmentService.update(request));
        assertTrue(ex.getMessage().contains("department.id.not.exists"));
    }

    @Test
    void delete_success() {
        Department department = new Department(1);

        when(departmentRepository.findByDepartmentId(1)).thenReturn(department);
        when(accountRepository.findByDepartment_DepartmentId(1)).thenReturn(null);

        departmentService.delete(1);

        verify(departmentRepository).delete(department);
    }

    @Test
    void delete_notFound() {
        when(departmentRepository.findByDepartmentId(1)).thenReturn(null);

        assertThrows(NotFoundException.class, () -> departmentService.delete(1));
    }
}
