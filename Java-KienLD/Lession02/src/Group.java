import java.time.LocalDateTime;
import java.util.Arrays;

public class Group {
    public int group_id;
    public String group_name;
    public String creator;
    public LocalDateTime CreateDate;
    public Account[] accounts;


//    @Override
//    public String toString() {
//        return "Group{" +
//                "group_id=" + group_id +
//                ", group_name='" + group_name + '\'' +
//                ", creator=" + creator +
//                ", CreateDate=" + CreateDate +
//                ", accounts=" + Arrays.toString(accounts) +
//                '}';
//    }
}
