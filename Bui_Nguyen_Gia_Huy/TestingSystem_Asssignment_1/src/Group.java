import java.time.LocalDate;

public class Group {
    private int groupID;
    private String groupName;
    private Account creator;
    private LocalDate createDate;

    public Group(int groupID, String groupName, Account creator, LocalDate createDate) {
        this.groupID = groupID;
        this.groupName = groupName;
        this.creator = creator;
        this.createDate = createDate;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public Account getCreator() {
        return creator;
    }

    public void setCreator(Account creator) {
        this.creator = creator;
    }

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
