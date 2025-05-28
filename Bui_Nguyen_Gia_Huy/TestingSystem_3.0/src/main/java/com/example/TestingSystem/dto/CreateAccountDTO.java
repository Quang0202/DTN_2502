package com.example.TestingSystem.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NonNull;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class CreateAccountDTO {

    @NotBlank(message = "Email khong duoc de trong")
    @Email(message = "Email khong hop le")
    private String email;

    @NotBlank(message = "Username khong duoc de trong")
    @Size(min = 6, max = 50, message = "Username phai tu 6 den 50 ky tu")
    private String username;

    @NotBlank(message = "Fullname khong duoc de trong")
    @Size(max = 50, message = "Fullname chi duoc toi da 50 ky tu")
    private String fullName;

    @NotBlank(message = "Department name không được để trống")
    @Size(max = 50, message = "Tên phòng ban không được vượt quá 50 ký tự")
    private String departmentName;

    @NonNull
    @NotBlank(message = "PositionName không được để trống")
    private String positionName;

    @PastOrPresent(message = "CreateDate khong duoc sau hon ngay hien tai")
    private LocalDateTime createDate = LocalDateTime.now();

    private Short departmentID;
    private Short positionID;
}
