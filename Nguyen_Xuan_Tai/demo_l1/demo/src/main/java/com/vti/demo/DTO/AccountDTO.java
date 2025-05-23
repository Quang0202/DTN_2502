package com.vti.demo.DTO;

import com.vti.demo.entity.Department;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDTO {

    private int accountId;
    private String email;
    private String userName;
    private String fullName;
    private String departmentName;



}
