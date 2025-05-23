package com.vti.QLNV.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class DepartmentDTO {

    private String departmentName;

    private List<AccountDTO> accounts;
}
