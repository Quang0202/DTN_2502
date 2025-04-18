package vti.accountmanagement.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.Length;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "department")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Department implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DepartmentID")
    Integer departmentId;

    @Column(name="DepartmentName", nullable = false, unique = true)
    String departmentName;

    @OneToMany(mappedBy="department")
    List<Account> accounts;

    public Department(Integer departmentId) {
        this.departmentId = departmentId;
    }
}
