package vti.accountmanagement.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import vti.accountmanagement.enums.Role;

import java.io.Serial;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Account")
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@EntityListeners(AuditingEntityListener.class)
public class Account implements Serializable, UserDetails {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AccountID")
    Integer accountId;

    @Column(nullable = false, unique = true, name = "Username")
    String username;

    @Column(name = "password")
    String password;

    @Column(nullable = false, unique = true, name = "Email")
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
    Department department;

    @Enumerated(EnumType.STRING)
    private Role role;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return role.getAuthorities();
    }
}
