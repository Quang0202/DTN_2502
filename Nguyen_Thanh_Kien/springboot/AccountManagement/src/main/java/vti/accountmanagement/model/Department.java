package vti.accountmanagement.model;

import jakarta.persistence.*;
import lombok.*;
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
public class Department implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DepartmentID")
    private Integer departmentId;

    @Column(name="DepartmentName", nullable = false, unique = true)
    private String departmentName;

    @OneToMany(mappedBy="department")
    private List<Account> accounts;
}
