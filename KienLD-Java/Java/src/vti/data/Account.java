package vti.data;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Account {
    public int account_id;

    public Account(int account_id, String email, String username, String full_name, Department department, Position position, LocalDateTime createDateTime, Group[] groups) {
        this.account_id = account_id;
        Email = email;
        Username = username;
        Full_name = full_name;
        this.department = department;
        this.position = position;
        CreateDateTime = createDateTime;
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "Account{" +
                "account_id=" + account_id +
                ", Email='" + Email + '\'' +
                ", Username='" + Username + '\'' +
                ", Full_name='" + Full_name + '\'' +
                ", department=" + department +
                ", position=" + position +
                ", CreateDateTime=" + CreateDateTime +
                ", groups=" + Arrays.toString(groups) +
                '}';
    }

    public String Email;
    public String Username;
    public String Full_name;
    public Department department;
    public Position position;
    public LocalDateTime CreateDateTime;
    public Group[] groups;
}
