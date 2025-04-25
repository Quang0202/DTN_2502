package vti.accountmanagement.request.department;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import vti.accountmanagement.anotation.FormatWhiteSpace;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentCreateRequest {

    @NotNull(message = "{department.name.required}")
    @NotBlank(message = "{department.name.required}")
    @Length(max = 20, message = "{department.name.length}")
    @FormatWhiteSpace
    private String departmentName;
}
