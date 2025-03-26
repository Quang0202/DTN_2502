package testingsystem_asssignmen1;

import testingsystem_asssignmen1.Account;

import java.time.LocalDateTime;

public class Group {
    public int groupId;
    public String groupName;
    public Account creator;
    public LocalDateTime createDate;

    public Group(int groupId, String groupName, Account creator, LocalDateTime createDate){
        this.groupId = groupId;
        this.groupName = groupName;
        this.creator = creator;
        this.createDate = createDate;
    }
}
