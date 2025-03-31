import java.time.LocalDate;
import java.util.Objects;

public class Account {
    String email;
    String userName;
    String fullName;
    LocalDate createDate;

    public Account(String email, String userName, String fullName, LocalDate createDate) {
        this.email = email;
        this.userName = userName;
        this.fullName = fullName;
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Account{" +
                "email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
