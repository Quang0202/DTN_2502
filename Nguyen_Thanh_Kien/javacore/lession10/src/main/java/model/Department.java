package model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Department {
    int departmentId;
    String departmentName;

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public Department(int departmentId) {
        this.departmentId = departmentId;
    }
}
