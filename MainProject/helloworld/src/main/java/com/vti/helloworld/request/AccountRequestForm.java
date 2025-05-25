package com.vti.helloworld.request;

import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AccountRequestForm {
    private Integer accountId;
    @NotNull(message = "email not null")
    @Email(message = "Email không hợp lệ")
    private String email;
    @Pattern(regexp = "\\d{10}", message = "UserName phải có 10 ký tự ")
    private String userName;
    private String fullName;
    @Positive
    private Integer departmentId;
    private Integer positionId;
}
