package com.vti.hello.request;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class DepartmentRequestForm {
    private String departmentname;

    private List<AccountRequestForm> accounts;
}
