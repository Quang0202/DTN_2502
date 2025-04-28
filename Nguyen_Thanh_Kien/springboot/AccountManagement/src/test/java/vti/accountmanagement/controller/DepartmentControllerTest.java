package vti.accountmanagement.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import vti.accountmanagement.config.WebSecurityConfig;
import vti.accountmanagement.exception.NotFoundException;
import vti.accountmanagement.payload.PageResponse;
import vti.accountmanagement.request.department.DepartmentCreateRequest;
import vti.accountmanagement.request.department.DepartmentUpdateRequest;
import vti.accountmanagement.response.dto.department.DepartmentListDto;
import vti.accountmanagement.service.DepartmentService;
import vti.accountmanagement.utils.ConstantUtils;
import vti.accountmanagement.utils.MessageUtil;

import java.util.List;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@SpringBootTest
@Import(WebSecurityConfig.class)
@AutoConfigureMockMvc(addFilters = false)
class DepartmentControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private DepartmentService departmentService;

    @Test
    @DisplayName("GET /api/department - Success")
    @WithMockUser(authorities = "admin:read")
    void getAll_success() throws Exception {
        List<DepartmentListDto> departments = List.of(new DepartmentListDto());
        Page<DepartmentListDto> page = new PageImpl<>(departments);
        when(departmentService.getAll(any(), any())).thenReturn(new PageResponse<>(page));

        // Thực hiện kiểm tra API
        mockMvc.perform(get("/api/department")
                        .param("page", "0")
                        .param("size", "10"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.content").isArray())
                .andExpect(jsonPath("$.content[0].departmentId").value(0));
    }

    @Test
    @DisplayName("GET /api/department - Fail with size too large")
    @WithMockUser(authorities = "admin:read")
    void getAll_fail_sizeTooLarge() throws Exception {
        mockMvc.perform(get("/api/department")
                        .param("size", "1000"))
                .andExpect(status().isBadRequest());
    }

    @Test
    @DisplayName("POST /create - Success")
    @WithMockUser(roles = "ADMIN")
    void createDepartment_success() throws Exception {
        DepartmentCreateRequest department = new DepartmentCreateRequest("test name");
        String requestJson = new ObjectMapper().writeValueAsString(department);
        doNothing().when(departmentService).save(any(DepartmentCreateRequest.class));

        mockMvc.perform(post("/api/department/create")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(requestJson))
                .andExpect(status().isOk())
                .andExpect(content().string(ConstantUtils.CREATE_SUCCESSFULLY));
    }

    @Test
    @DisplayName("POST /create - Fail (Invalid Data)")
    void createDepartment_fail_invalidData() throws Exception {
        DepartmentCreateRequest department = new DepartmentCreateRequest("");
        String requestJson = new ObjectMapper().writeValueAsString(department);
        String expectedMessage = MessageUtil.getMessage("department.name.required");

        mockMvc.perform(post("/api/department/create")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(requestJson))
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$.message").value("Validation failed"))
                .andExpect(jsonPath("$.errors[0].field").value("departmentName"))
                .andExpect(jsonPath("$.errors[0].message").value(expectedMessage));
    }

    @Test
    @DisplayName("POST /update - Success")
    @WithMockUser(roles = "ADMIN")
    void updateDepartment_success() throws Exception {
        DepartmentUpdateRequest department = new DepartmentUpdateRequest(1,"test");
        String requestJson = new ObjectMapper().writeValueAsString(department);
        doNothing().when(departmentService).update(any(DepartmentUpdateRequest.class));

        mockMvc.perform(post("/api/department/update")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(requestJson))
                .andExpect(status().isOk())
                .andExpect(content().string(ConstantUtils.UPDATE_SUCCESSFULLY));
    }

    @Test
    @DisplayName("POST /update - Fail (Invalid Data)")
    void updateDepartment_fail_invalidData() throws Exception {
        DepartmentUpdateRequest department = new DepartmentUpdateRequest(1,"");
        String requestJson = new ObjectMapper().writeValueAsString(department);
        // Lấy thông điệp từ messages.properties
        String expectedMessage = MessageUtil.getMessage("department.name.required");

        mockMvc.perform(post("/api/department/update")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(requestJson))
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$.message").value("Validation failed"))
                .andExpect(jsonPath("$.errors[0].field").value("departmentName"))
                .andExpect(jsonPath("$.errors[0].message").value(expectedMessage));
    }

    @Test
    @DisplayName("DELETE /api/department/{id} - Success")
    @WithMockUser(roles = "ADMIN")
    void deleteDepartment_success() throws Exception {

        doNothing().when(departmentService).delete(1);

        mockMvc.perform(delete("/api/department/{id}", 1))
                .andExpect(status().isOk())
                .andExpect(content().string(ConstantUtils.DELETE_SUCCESSFULLY));
    }

    @Test
    @DisplayName("DELETE /api/department/{id} - Fail (Department not found)")
    @WithMockUser(roles = "ADMIN")
    void deleteDepartment_fail_departmentNotFound() throws Exception {
        String expectedMessage = MessageUtil.getMessage("department.id.not.exists");
        doThrow(new NotFoundException(expectedMessage)).when(departmentService).delete(999);
        mockMvc.perform(delete("/api/department/{id}", 999))
                .andExpect(status().isNotFound())
                .andExpect(result -> assertInstanceOf(NotFoundException.class, result.getResolvedException()))
                .andExpect(result -> assertEquals(expectedMessage, Objects.requireNonNull(result.getResolvedException()).getMessage()));
    }

}
