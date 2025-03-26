import java.time.LocalDateTime;
import java.util.Arrays;

public class Group {
    int groupId;
    String groupName;
    Account creator;
    LocalDateTime createDate;
    Account[] accounts;
    LocalDateTime[] joinedDate;

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
