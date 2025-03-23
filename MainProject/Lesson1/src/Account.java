import java.time.LocalDateTime;
import java.util.Arrays;

public class Account {
    int accountId;
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
                ", gender=" + gender +
                ", department=" + department +
                ", position=" + position +
                ", createDate=" + createDate +
                ", groups=" + Arrays.toString(groups) +
                ", joinDate=" + Arrays.toString(joinDate) +
                '}';
    }
}
