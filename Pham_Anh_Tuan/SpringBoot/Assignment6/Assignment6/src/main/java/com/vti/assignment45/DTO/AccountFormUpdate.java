package com.vti.assignment45.DTO;


import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class AccountFormUpdate {

    @NotNull(message = "ID tài khoản không được để trống")
    private Integer id;

    @Email(message = "Email không đúng định dạng")
    @Size(max = 50, message = "Email không được vượt quá 50 ký tự")
    private String email;

    @Size(min = 6, max = 50, message = "Username phải từ 6 đến 50 ký tự")
    private String username;

    @NotBlank(message = "Họ và tên không được để trống")
    @Size(max = 50, message = "Họ và tên không được vượt quá 50 ký tự")
    private String fullName;

    @NotNull(message = "Phòng ban không được để trống")
    private int departmentId;

    @NotNull(message = "Chức vụ không được để trống")
    private int positionId;

    @PastOrPresent(message = "Ngày tạo không được lớn hơn ngày hiện tại")
    private LocalDate createDate;
}
