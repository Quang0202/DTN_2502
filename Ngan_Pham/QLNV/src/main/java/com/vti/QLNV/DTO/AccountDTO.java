package com.vti.QLNV.DTO;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.vti.QLNV.entity.PositionName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor//day du thong tin
@NoArgsConstructor//rong
public class AccountDTO {
    private int accountId;
    private String email;
    private String userName;
    private String fullName;
    @JsonProperty("department")
    private String departmentDepartmentName;
    private PositionName positionName;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDateTime createDate;
}
