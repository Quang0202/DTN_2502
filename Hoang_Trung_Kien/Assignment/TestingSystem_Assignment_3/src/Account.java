import java.time.LocalDateTime;

public class Account {
    String email;
    String userName;
    String fullName;
    LocalDateTime createDate;

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
