package com.example.TestingSystem.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CreateDepartmentDTO {
    @NotBlank(message = "Tên phòng ban không được để trống")
    @Size(max = 50, message = "Tên phòng ban không được vượt quá 50 ký tự")
    private String departmentName;
}
