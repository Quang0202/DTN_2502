package vti.accountmanagement.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import vti.accountmanagement.enums.Role;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "account")
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@EntityListeners(AuditingEntityListener.class)
public class Account implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AccountID")
    Integer accountId;

    @Column(nullable = false, unique = true, name = "username")
    String username;

    @Column(name = "password")
    String password;

    @Column(nullable = false, unique = true, name = "email")
    String email;

    @Column(name = "FullName")
    String fullName;

    @CreatedDate
    @Column(name = "CreateDate")
    Date createDate;

    @ManyToOne
    @JoinColumn(name = "PositionID")
    Position position;

    @ManyToOne
    @JoinColumn(name = "DepartmentID")
    @JsonBackReference
    Department department;

    @Enumerated(EnumType.STRING)
    Role role;

}
