import java.util.Arrays;

public class Account{
    public int id;
    String department;
    String[] groups;
    String position;
    String email;
    String fullName;
    Account[] accounts = new Account[100];
    @Override
    public String toString() {
        return "Account{" +
                "department='" + department + '\'' +
                ", groups=" + Arrays.toString(groups) +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", fullName='" + fullName + '\'' +
                ", accounts=" + Arrays.toString(accounts) +
                '}';
    }
}
