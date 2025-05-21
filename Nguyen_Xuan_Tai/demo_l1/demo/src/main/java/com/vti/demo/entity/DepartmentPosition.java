package com.vti.demo.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "DepartmentPosition")
public class DepartmentPosition {

    @EmbeddedId
private DBPKEY id;

    @ManyToOne
    @MapsId("departmentId")
    @JoinColumn(name = "departmentid")
    private Department department;

    @ManyToOne
    @MapsId("positionId")
    @JoinColumn(name = "positionId")
    private Position position;

    public DepartmentPosition() {

    }

    public DBPKEY getId() {
        return id;
    }

    public void setId(DBPKEY id) {
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
}
