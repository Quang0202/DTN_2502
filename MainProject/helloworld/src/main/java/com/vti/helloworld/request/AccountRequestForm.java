package com.vti.helloworld.request;

import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class AccountRequestForm {
    private Integer accountId;
    @Email(message = "Email không hợp lệ")
    private String email;
    @Length(min = 6, max = 50)
    private String userName;
    private String fullName;
    private String departmentName;
    private Integer positionId;
    @PastOrPresent
    private LocalDateTime createDate;
}
