package com.vti.testingsytem.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DepartmentDTO {

    @NonNull
    private int departmentId;

    @NonNull
    private String departmentName;
}
