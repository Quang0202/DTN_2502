package com.vti.QLNV.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name= "Department", uniqueConstraints = @UniqueConstraint(columnNames={"departmentName", "abc"}))
public class Department {
    @Id
    private Integer departmentId;

    @ColumnDefault("sale")
    private String departmentName;

}

