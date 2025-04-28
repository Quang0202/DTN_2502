package vti.data;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Group {
    public int group_id;
    public String group_name;

    public Group(int group_id, String group_name, Account creator, LocalDateTime createDateTime, Account[] accounts) {
        this.group_id = group_id;
        this.group_name = group_name;
        this.creator = creator;
        CreateDateTime = createDateTime;
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "Group{" +
                "group_id=" + group_id +
                ", group_name='" + group_name + '\'' +
                ", creator=" + creator +
                ", CreateDateTime=" + CreateDateTime +
                ", accounts=" + Arrays.toString(accounts) +
                '}';
    }

    public Account creator;
    public LocalDateTime CreateDateTime;
    public Account[] accounts;
}
