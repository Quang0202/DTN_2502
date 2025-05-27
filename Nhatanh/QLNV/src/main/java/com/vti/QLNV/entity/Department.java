package com.vti.QLNV.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name= "Department", uniqueConstraints = @UniqueConstraint(columnNames={"departmentName", "abc"}))
public class Department {
    @Id
    @Column(name = "departmentId")
    private Integer departmentId;

    @ColumnDefault("sale")
    @Column(name = "departmentName", nullable = false)
    private String departmentName;

    @OneToMany(mappedBy = "department")
    private List<Account> accounts;

}

