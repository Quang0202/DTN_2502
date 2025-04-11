import java.time.LocalDate;

public class Account {
    private String email;
    private String username;
    private String fullName;
    private LocalDate createDate;

    public Account(String email, String username, String fullName, LocalDate createDate) {
        this.email = email;
        this.username = username;
        this.fullName = fullName;
        this.createDate = createDate;
    }

    public String toString() {
        return "Email: " + email + ", Username: " + username + ", Full Name: " + fullName + ", Created: " + createDate;
    }
}
