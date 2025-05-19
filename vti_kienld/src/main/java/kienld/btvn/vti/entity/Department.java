package kienld.btvn.vti.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Department")

public class Department {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "DepartmentID", nullable = false)
    private Integer departmentID; 
    @Column(name = "DepartmentName", nullable = false, unique = true, length = 100)
    private String  departmentName;

    public Department(Integer departmentID, String departmentName) {
        this.departmentID = departmentID;
        this.departmentName = departmentName;
    }

        public Department() {

    }

        public Integer getDepartmentID() {
            return departmentID;
        }

        public void setDepartmentID(Integer departmentID) {
            this.departmentID = departmentID;
        }

        public String getDepartmentName() {
            return departmentName;
        }

        public void setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
        }








}
