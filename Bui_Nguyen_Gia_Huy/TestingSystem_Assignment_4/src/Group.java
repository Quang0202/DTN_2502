import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Group {
    private String groupName;
    private String creator;
    private List<Account> accounts;
    private LocalDate createDate;

    public Group() {}

    public Group(String groupName, String creator, Account[] accounts, LocalDate createDate) {
        this.groupName = groupName;
        this.creator = creator;
        this.accounts = new ArrayList<>();
        for (Account acc : accounts) {
            this.accounts.add(acc);
        }
        this.createDate = createDate;
    }

    public Group(String groupName, String creator, String[] usernames, LocalDate createDate) {
        this.groupName = groupName;
        this.creator = creator;
        this.accounts = new ArrayList<>();
        for (String username : usernames) {
            this.accounts.add(new Account(username));
        }
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupName='" + groupName + '\'' +
                ", creator='" + creator + '\'' +
                ", accounts=" + accounts +
                ", createDate=" + createDate +
                '}';
    }
}