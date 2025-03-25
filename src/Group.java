import java.time.LocalDate;
import java.util.Arrays;

public class Group {
     int id;
     String name;
     int creatorID;
     LocalDate createDate;
     Account[] accounts;
    LocalDate joinDate;



    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", creatorID=" + creatorID +
                ", createDate=" + createDate +
                ", accounts=" + Arrays.toString(accounts) +
                ", joinDate=" + joinDate +
                '}';
    }
}
