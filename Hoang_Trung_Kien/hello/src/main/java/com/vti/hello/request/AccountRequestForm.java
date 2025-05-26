package com.vti.hello.request;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AccountRequestForm {
    private String email;
    private String username;
    private String name;
    private Integer departmentId;
    private Integer positionId;

}
