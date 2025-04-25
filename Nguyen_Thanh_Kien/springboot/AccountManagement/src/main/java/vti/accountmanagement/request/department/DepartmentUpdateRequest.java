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
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentUpdateRequest {

    @NotNull(message = "{department.id.required}")
    @Schema(
            description = "ID of the department to update",
            example = "3"
    )
    private Integer departmentId;

    @NotNull(message = "{department.name.required}")
    @NotBlank(message = "{department.name.required}")
    @Length(max = 20, message = "{department.name.length}")
    @FormatWhiteSpace
    @Schema(
            description = "New name of the department (max 20 characters)",
            example = "Marketing"
    )
    private String departmentName;
}
