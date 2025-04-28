package vti.accountmanagement.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.test.web.servlet.MockMvc;
import vti.accountmanagement.config.WebSecurityConfig;
import vti.accountmanagement.payload.PageResponse;
import vti.accountmanagement.response.dto.position.PositionListDto;
import vti.accountmanagement.service.PositionService;

import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@Import(WebSecurityConfig.class)
@AutoConfigureMockMvc(addFilters = false)
class PositionControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PositionService positionService;

    @Test
    @DisplayName("GET /api/position - Success")
    void getAll_success() throws Exception {
        List<PositionListDto> positions = List.of(new PositionListDto());
        Page<PositionListDto> page = new PageImpl<>(positions);
        when(positionService.getAll(any(), any())).thenReturn(new PageResponse<>(page));

        // Thực hiện kiểm tra API
        mockMvc.perform(get("/api/position")
                        .param("page", "0")
                        .param("size", "10"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.content").isArray())
                .andExpect(jsonPath("$.content[0].positionId").value(0));
    }

    @Test
    @DisplayName("GET /api/position - Fail with size too large")
    void getAll_fail_sizeTooLarge() throws Exception {
        mockMvc.perform(get("/api/position")
                        .param("size", "1000"))
                .andExpect(status().isBadRequest());
    }
}
