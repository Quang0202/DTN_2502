package com.vti.QLNV.dto.request;

import com.vti.QLNV.annotation.EmailNotExist;
import com.vti.QLNV.annotation.UsernameNotExist;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CreateAccountRequest {
    @Column(nullable = false, unique = true)
    @NotBlank
    @Email(message = "Email is not valid", regexp = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")
    @EmailNotExist
    private String email;

    @NotBlank
    @Length(min = 6, max = 50, message = "invalid username length")
    @UsernameNotExist
    private String username;

    @NotBlank
    @Max(value = 50, message="fullname has too many characters")
    private String fullname;

    private String departmentName;

    private String positionName;

}
