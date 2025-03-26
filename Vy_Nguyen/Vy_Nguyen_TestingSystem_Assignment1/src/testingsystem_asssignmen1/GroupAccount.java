package testingsystem_asssignmen1;

import testingsystem_asssignmen1.Account;

import java.util.Date;

public class GroupAccount {
    public int groupId;
    public Account account;
    public Date joinDate;

    public GroupAccount(int groupId, Account account, Date joinDate){
        this.groupId = groupId;
        this.account = account;
        this.joinDate = joinDate;
    }
}
