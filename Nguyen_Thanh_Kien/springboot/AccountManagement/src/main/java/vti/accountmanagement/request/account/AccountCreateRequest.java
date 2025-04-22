package vti.accountmanagement.request.account;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.hibernate.validator.constraints.Length;
import vti.accountmanagement.anotation.FormatWhiteSpace;
import vti.accountmanagement.anotation.Trim;
import vti.accountmanagement.anotation.ValidateEnum;
import vti.accountmanagement.enums.Role;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AccountCreateRequest {
    @Trim
    @Pattern(regexp = "^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$",
            message = "{account.email.invalid}")
    String email;

    @NotNull(message = "{account.username.required}")
    @NotBlank(message = "{account.username.required}")
    @Length(max = 20, message = "{account.username.length}")
    @Trim
    String username;

    @NotNull(message = "{account.fullName.required}")
    @NotBlank(message = "{account.fullName.required}")
    @Length(max = 50, message = "{account.fullName.length}")
    @FormatWhiteSpace
    String fullName;

    @NotNull(message = "{account.password.required}")
    @NotBlank(message = "{account.password.required}")
    @Length(min = 6, max = 20, message = "{account.password.length}")
    String password;

    @ValidateEnum(enumClass = Role.class, name = "role", message = "{account.role.not.exists}")
    @NotNull(message = "{account.role.required}")
    @NotBlank(message = "{account.role.required}")
    String role;
    int departmentId;
    int positionId;
}
