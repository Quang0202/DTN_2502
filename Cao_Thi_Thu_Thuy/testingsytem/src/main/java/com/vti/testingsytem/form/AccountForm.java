package com.vti.testingsytem.form;

import com.vti.testingsytem.entity.UniqueUsername;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AccountForm {
    private String email;

    @UniqueUsername
    private String username;
    private String fullName;
    private String departmentName;
    private int positionId;
}
