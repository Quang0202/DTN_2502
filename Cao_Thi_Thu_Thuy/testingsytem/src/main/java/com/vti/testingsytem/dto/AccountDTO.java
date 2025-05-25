package com.vti.testingsytem.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.vti.testingsytem.entity.Department;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@RequiredArgsConstructor
public class AccountDTO {

    @NonNull
    private String email;

    @NonNull
    private String username;

    private String fullName;
    private LocalDate createDate;
    private String departmentName;
}
