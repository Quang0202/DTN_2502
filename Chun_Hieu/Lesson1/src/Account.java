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
    LocalDateTime createdate;
    Group[] groups;
    Question[] questions;
    LocalDateTime[] joinedDate;

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
                ", createdate=" + createdate +
                ", groups=" + Arrays.toString(groups) +
                ", joinedDate=" + Arrays.toString(joinedDate) +
                '}';
    }
}
