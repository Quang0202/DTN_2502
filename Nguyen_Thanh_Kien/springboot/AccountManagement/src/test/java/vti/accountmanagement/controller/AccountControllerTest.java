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
import org.springframework.test.web.servlet.MockMvc;
import vti.accountmanagement.config.WebSecurityConfig;
import vti.accountmanagement.exception.NotFoundException;
import vti.accountmanagement.payload.PageResponse;
import vti.accountmanagement.request.account.AccountCreateRequest;
import vti.accountmanagement.request.account.AccountUpdateRequest;
import vti.accountmanagement.response.dto.account.AccountInfoDto;
import vti.accountmanagement.response.dto.account.AccountListDto;
import vti.accountmanagement.service.AccountService;
import vti.accountmanagement.utils.ConstantUtils;
import vti.accountmanagement.utils.MessageUtil;

import java.time.LocalDate;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@Import(WebSecurityConfig.class)
@AutoConfigureMockMvc(addFilters = false)
class AccountControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private AccountService accountService;

    @Test
    @DisplayName("GET /api/account - Success")
    void getAll_success() throws Exception {
        List<AccountListDto> accounts = List.of(new AccountListDto());
        Page<AccountListDto> page = new PageImpl<>(accounts);
        when(accountService.getAll(any(), any())).thenReturn(new PageResponse<>(page));

        // Thực hiện kiểm tra API
        mockMvc.perform(get("/api/account")
                        .param("page", "0")
                        .param("size", "10"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.content").isArray())
                .andExpect(jsonPath("$.content[0].accountId").value(0));
    }

    @Test
    @DisplayName("GET /api/account - Fail with size too large")
    void getAll_fail_sizeTooLarge() throws Exception {
        mockMvc.perform(get("/api/account")
                        .param("size", "1000"))
                .andExpect(status().isBadRequest());
    }

    @Test
    @DisplayName("GET /api/account/{id} - Success")
    void getAccountById_success() throws Exception {
        AccountInfoDto accountInfo = new AccountInfoDto(1, "user@example.com", "username", "Full Name", LocalDate.now(), "IT", "Developer");
        when(accountService.getAccountById(1)).thenReturn(accountInfo);
        mockMvc.perform(get("/api/account/{id}", 1))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.accountId").value(1))
                .andExpect(jsonPath("$.email").value("user@example.com"))
                .andExpect(jsonPath("$.username").value("username"))
                .andExpect(jsonPath("$.fullName").value("Full Name"))
                .andExpect(jsonPath("$.createDate").exists())
                .andExpect(jsonPath("$.departmentName").value("IT"))
                .andExpect(jsonPath("$.positionName").value("Developer"));
    }

    @Test
    @DisplayName("GET /api/account/{id} - Fail (Account not found)")
    void getAccountById_fail() throws Exception {
        when(accountService.getAccountById(999)).thenThrow(new NotFoundException("Account not found"));

        // Thực hiện GET yêu cầu
        mockMvc.perform(get("/api/account/{id}", 999))
                .andExpect(status().isNotFound())
                .andExpect(jsonPath("$.message").value("Account not found"));
    }

    @Test
    @DisplayName("POST /create - Success")
    void createAccount_success() throws Exception {
        AccountCreateRequest account = new AccountCreateRequest();
        account.setEmail("test@example.com");
        account.setUsername("testuser");
        account.setFullName("Test User");
        account.setPassword("password123");
        account.setRole("USER");
        account.setDepartmentId(1);
        account.setPositionId(1);
        String requestJson = new ObjectMapper().writeValueAsString(account);
        doNothing().when(accountService).save(any(AccountCreateRequest.class));

        mockMvc.perform(post("/api/account/create")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(requestJson))
                .andExpect(status().isOk())
                .andExpect(content().string(ConstantUtils.CREATE_SUCCESSFULLY));
    }

    @Test
    @DisplayName("POST /create - Fail (Invalid Data)")
    void createAccount_fail_invalidData() throws Exception {
        AccountCreateRequest account = new AccountCreateRequest();
        account.setEmail("test1234example.com");
        account.setUsername("testuser");
        account.setFullName("Test User");
        account.setPassword("password123");
        account.setRole("USER");
        account.setDepartmentId(1);
        account.setPositionId(1);
        String requestJson = new ObjectMapper().writeValueAsString(account);
        String expectedMessage = MessageUtil.getMessage("account.email.invalid");
        mockMvc.perform(post("/api/account/create")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(requestJson))
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$.message").value("Validation failed"))
                .andExpect(jsonPath("$.errors[0].field").value("email"))
                .andExpect(jsonPath("$.errors[0].message").value(expectedMessage));
    }

    @Test
    @DisplayName("POST /update - Success")
    void updateAccount_success() throws Exception {
        AccountUpdateRequest validRequest = new AccountUpdateRequest();
        validRequest.setAccountId(1);
        validRequest.setEmail("test@example.com");
        validRequest.setFullName("Test User");
        validRequest.setDepartmentId(1);
        validRequest.setPositionId(1);

        String validRequestJson = new ObjectMapper().writeValueAsString(validRequest);
        doNothing().when(accountService).update(any(AccountUpdateRequest.class));

        mockMvc.perform(post("/api/account/update")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(validRequestJson))
                .andExpect(status().isOk())
                .andExpect(content().string(ConstantUtils.UPDATE_SUCCESSFULLY));
    }

    @Test
    @DisplayName("POST /update - Fail (Invalid Data)")
    void updateAccount_fail_invalidData() throws Exception {
        // Tạo dữ liệu không hợp lệ (email không hợp lệ)
        AccountUpdateRequest invalidRequest = new AccountUpdateRequest();
        invalidRequest.setAccountId(1);
        invalidRequest.setEmail("invalid-email");
        invalidRequest.setFullName("Test User");
        invalidRequest.setDepartmentId(1);
        invalidRequest.setPositionId(1);
        String invalidRequestJson = new ObjectMapper().writeValueAsString(invalidRequest);
        String expectedMessage = MessageUtil.getMessage("account.email.invalid");

        mockMvc.perform(post("/api/account/update")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(invalidRequestJson))
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$.message").value("Validation failed"))
                .andExpect(jsonPath("$.errors[0].field").value("email"))
                .andExpect(jsonPath("$.errors[0].message").value(expectedMessage));
    }

    @Test
    @DisplayName("DELETE /api/account/{id} - Success")
    void deleteAccount_success() throws Exception {

        doNothing().when(accountService).delete(1);

        mockMvc.perform(delete("/api/account/{id}", 1))
                .andExpect(status().isOk())
                .andExpect(content().string(ConstantUtils.DELETE_SUCCESSFULLY));
    }

    @Test
    @DisplayName("DELETE /api/account/{id} - Fail (Account not found)")
    void deleteAccount_fail_accountNotFound() throws Exception {
        String expectedMessage = MessageUtil.getMessage("account.id.not.exists");
        doThrow(new NotFoundException(expectedMessage)).when(accountService).delete(999);

        mockMvc.perform(delete("/api/account/{id}", 999))
                .andExpect(status().isNotFound())
                .andExpect(jsonPath("$.message").value(expectedMessage));
    }

}