package model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Account {
    int accountId;
    String email;
    String password;
    String username;
    String fullName;
    Department department;
    Position position;
    LocalDate createDate;

    public Account() {
        this.createDate = LocalDate.now();
    }
}

