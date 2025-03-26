import java.time.LocalDateTime;

public class Account {
    public int accountId;
    String userName;
    String email;
    String fullName;
    Gender gender;
    Department department;
    Position position;
    LocalDateTime createDate;
    Group[] groups;
    LocalDateTime[] joinDate;

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", fullName='" + fullName + '\'' +
                ", gender='" + gender + '\'' +
                ", department=" + department +
                ", position=" + position +
                ", createDate=" + createDate +
                '}';
    }
}
