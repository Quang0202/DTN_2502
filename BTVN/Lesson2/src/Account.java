import java.util.Date;


public class Account {
    public int accountId;
    public String username;
    public String email;
    public String fullName;
    public Gender gender;
    public Department department;
    public Position position;
    public Date createDate;
    public Group[] groups;

    public Account() {}

    public Account(int accountId, String username, String email, String fullName, Gender gender, Department department, Position position, Date createDate) {
        this.accountId = accountId;
        this.username = username;
        this.email = email;
        this.fullName = fullName;
        this.gender = gender;
        this.department = department;
        this.position = position;
        this.createDate = createDate;
    }

    public Account(int accountId, String email, String fullName, Department department) {
        this.accountId = accountId;
        this.email = email;
        this.fullName = fullName;
        this.department = department;
    }

    public Account(int i, String s, String trần_văn_b, Object o, Object o1, Object o2, Object o3) {
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", fullName='" + fullName + '\'' +
                ", gender=" + gender +
                ", department=" + (department != null ? department.departmentName : "Nhân viên này chưa có phòng ban") +
                ", position=" + position +
                ", createDate=" + createDate +
                '}';
    }
}
