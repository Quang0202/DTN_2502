package com.vti.testingsytem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class GroupAccount {
    @EmbeddedId
    private GroupAccountId groupAccountId;

    private LocalDate joinDate;
}
