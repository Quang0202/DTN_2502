package vti.accountmanagement.request.account;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import vti.accountmanagement.anotation.FormatWhiteSpace;
import vti.accountmanagement.anotation.Trim;

@Getter
@Setter
public class AccountUpdateRequest {

    @Schema(description = "Unique ID of the account to be updated", example = "101")
    private int accountId;

    @Trim
    @Pattern(
            regexp = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$",
            message = "{account.email.invalid}"
    )
    @Schema(description = "New email address (optional)", example = "updated.email@example.com")
    private String email;

    @NotNull(message = "{account.fullName.required}")
    @NotBlank(message = "{account.fullName.required}")
    @Length(max = 50, message = "{account.fullName.length}")
    @FormatWhiteSpace
    @Schema(description = "Full name of the user (max 50 characters)", example = "Jane Doe")
    private String fullName;

    @Schema(description = "Updated department ID", example = "3")
    private int departmentId;

    @Schema(description = "Updated position ID", example = "5")
    private int positionId;
}
