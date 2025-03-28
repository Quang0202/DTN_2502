import java.time.LocalDate;

public class GroupAccount {
    private Group group;
    private Account account;
    private LocalDate joinDate;

    public GroupAccount(Group group, Account account, LocalDate joinDate) {
        this.group = group;
        this.account = account;
        this.joinDate = joinDate;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }
}
