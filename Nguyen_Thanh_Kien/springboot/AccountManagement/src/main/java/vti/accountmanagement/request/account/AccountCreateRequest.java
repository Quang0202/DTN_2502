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
public class AccountCreateRequest {
    @Trim
    @Pattern(regexp = "^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$",
            message = "{account.email.invalid}")
    private String email;

    @NotNull(message = "{account.username.required}")
    @NotBlank(message = "{account.username.required}")
    @Length(max = 20, message = "{account.username.length}")
    @Trim
    private String username;

    @NotNull(message = "{account.fullName.required}")
    @NotBlank(message = "{account.fullName.required}")
    @Length(max = 50, message = "{account.fullName.length}")
    @FormatWhiteSpace
    private String fullName;

    private int departmentId;
    private int positionId;
}
