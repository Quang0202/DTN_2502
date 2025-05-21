package com.vti.helloworld.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "DepartmentPosition")
public class DepartmentPosition {

    @EmbeddedId
    private DPKey id;

    @ManyToOne
    @MapsId("departmentId")
    @JoinColumn(name = "departmentId")
    @JsonIgnoreProperties({"accounts","positions"})
    private Department department;

    @ManyToOne
    @MapsId("positionId")
    @JoinColumn(name = "positionId")
    @JsonIgnoreProperties({"accounts","departmentPosition"})
    private Position position;

    private LocalDateTime joinDate;
    public DepartmentPosition(){}

    public DPKey getId() {
        return id;
    }

    public void setId(DPKey id) {
        this.id = id;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public LocalDateTime getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDateTime joinDate) {
        this.joinDate = joinDate;
    }
}
