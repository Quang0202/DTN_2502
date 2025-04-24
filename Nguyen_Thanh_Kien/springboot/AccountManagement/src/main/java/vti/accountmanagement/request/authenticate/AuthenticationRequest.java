package vti.accountmanagement.request.authenticate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import vti.accountmanagement.anotation.Trim;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationRequest {
    @NotNull(message = "{account.username.required}")
    @NotBlank(message = "{account.username.required}")
    @Length(max = 20, message = "{account.username.length}")
    @Trim
    private String username;

    @NotNull(message = "{account.password.required}")
    @NotBlank(message = "{account.password.required}")
    @Length(min = 6, max = 20, message = "{account.password.length}")
    private String password;

}
