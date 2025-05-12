import java.time.LocalDateTime;

public class Group {
    int groupId;
    String groupName;
    Account creator;
    LocalDateTime createDate;
    Account[] accounts;
    LocalDateTime[] joinDate;

    @Override
    public String toString() {
        return "Group{" +
                "groupId=" + groupId +
                ", groupName='" + groupName + '\'' +
                ", creator=" + creator +
                ", createDate=" + createDate +
                '}';
    }
}
