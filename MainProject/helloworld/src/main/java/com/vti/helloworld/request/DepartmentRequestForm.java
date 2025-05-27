package com.vti.helloworld.request;

import com.vti.helloworld.entity.Account;
import com.vti.helloworld.validation.DepartmentNameNotExists;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class DepartmentRequestForm {
    @DepartmentNameNotExists()
    private String departmentName;

    private List<AccountRequestForm> accounts;
}
