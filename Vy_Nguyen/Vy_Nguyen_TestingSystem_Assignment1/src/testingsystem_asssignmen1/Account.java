package testingsystem_asssignmen1;

import java.time.LocalDateTime;

public class Account {
    public int accountId;
    public String email;
    public String username;
    public String fullname;
    public Department department;
    public Position position;
    public LocalDateTime createDate;

    public Account(int accountId, String email, String username, String fullname, Department department, Position position, LocalDateTime createDate){
        this.accountId = accountId;
        this.email = email;
        this.username = username;
        this.fullname = fullname;
        this.department = department;
        this.position = position;
        this.createDate = createDate;
    }
}
