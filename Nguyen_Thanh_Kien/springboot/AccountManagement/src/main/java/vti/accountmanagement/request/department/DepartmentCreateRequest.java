package vti.accountmanagement.request.department;

import io.swagger.v3.oas.annotations.media.Schema;
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
    @Schema(
            description = "Name of the department (required, max 20 characters)",
            example = "Human Resources"
    )
    private String departmentName;
}
