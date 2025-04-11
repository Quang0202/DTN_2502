package model;

import lombok.*;

import java.time.LocalDate;

@Data
public class Account {
    private int accountId;
    private String email;
    private String password;
    private String username;
    private String fullName;
    private Department department;
    private Position position;
    private LocalDate createDate;

    public Account() {
        this.createDate = LocalDate.now();
    }
}

