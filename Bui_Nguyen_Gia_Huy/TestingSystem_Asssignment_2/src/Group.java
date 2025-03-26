import java.time.LocalDate;

public class Group {
    public int id;
    public String groupName;
    public LocalDate createDate;
    private Account[] accounts;
    private int memberCount;

    public Group(int id, String name, LocalDate createDate) {
        this.id = id;
        this.groupName = name;
        this.createDate = createDate;
        this.accounts = new Account[100];
        this.memberCount = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }

    public void addMember(Account account) {
        if (memberCount < accounts.length) {
            accounts[memberCount] = account;
            memberCount++;
            System.out.println("Added " + account.getUserName() + " to group " + groupName);
        }
        else {
            System.out.println("Group is full");
        }
    }
}
