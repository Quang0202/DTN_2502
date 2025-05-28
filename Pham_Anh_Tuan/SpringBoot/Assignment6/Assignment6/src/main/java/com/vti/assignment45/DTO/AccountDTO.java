package com.vti.assignment45.DTO;

import com.vti.assignment45.entity.Position;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AccountDTO {
    @NotBlank(message = "Email không được để trống")
    @Email(message = "Email không đúng định dạng")
    private String email;

    @NotBlank(message = "Username không được để trống")
    @Size(min = 6, max = 50, message = "Username phải từ 6 đến 50 ký tự")
    private String username;

    @NotBlank(message = "Fullname không được để trống")
    @Size(max = 50, message = "Fullname không được vượt quá 50 ký tự")
    private String fullName;

    @NotBlank(message = "Tên phòng ban không được để trống")
    private String departmentName;

    @NotNull(message = "Position không được để trống")
    @NotNull
    private Position.PositionName positionName;

    @PastOrPresent(message = "CreateDate không được lớn hơn ngày hiện tại")
    private LocalDateTime createDate;
}
