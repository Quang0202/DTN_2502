package model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Department {
    private int departmentId;
    private String departmentName;

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }
}
