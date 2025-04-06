import java.time.LocalDate;

public class Account {
    String email;
    String username;
    String fullName;
    LocalDate createDate;

//    public Account(String email, String username, String fullName, LocalDate createDate) {
//        this.email = email;
//        this.username = username;
//        this.fullName = fullName;
//        this.createDate = createDate;
//    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Account{" +
                "email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", fullName='" + fullName + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
