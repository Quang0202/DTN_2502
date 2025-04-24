package vti.accountmanagement.request.account;

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

    private int accountId;

    @Trim
    @Pattern(
            regexp = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$",
            message = "{account.email.invalid}"
    )
    private String email;

    @NotNull(message = "{account.fullName.required}")
    @NotBlank(message = "{account.fullName.required}")
    @Length(max = 50, message = "{account.fullName.length}")
    @FormatWhiteSpace
    private String fullName;

    private int departmentId;
    private int positionId;
}
