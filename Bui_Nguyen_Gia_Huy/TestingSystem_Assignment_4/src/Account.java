import java.time.LocalDate;

public class Account {
    private int id;
    private String email;
    private String username;
    private String firstName;
    private String lastName;
    private String fullName;
    private Position position;
    private LocalDate createDate;

    public Account() {}

    public Account(String username) {
        this.username = username;
    }

    public Account(int id, String email, String username, String firstName, String lastName) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
    }

    public Account(int id, String email, String username, String firstName, String lastName, Position position) {
        this(id, email, username, firstName, lastName);
        this.position = position;
        this.createDate = LocalDate.now();
    }

    public Account(int id, String email, String username, String firstName, String lastName, Position position, LocalDate createDate) {
        this(id, email, username, firstName, lastName, position);
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", fullName='" + fullName + '\'' +
                ", position='" + (position != null ? position.getName() : null) + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}