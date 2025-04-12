package vti.accountmanagement.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Account")
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
public class Account implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AccountID")
    private Integer accountId;

    @Column(nullable = false, unique = true, name = "Username")
    private String username;

    @Column(nullable = false, unique = true, name = "Email")
    private String email;

    @Column(name = "FullName")
    private String fullName;

    @CreatedDate
    @Column(name = "CreateDate")
    private Date createDate;

    @ManyToOne
    @JoinColumn(name = "PositionID")
    private Position position;

    @ManyToOne
    @JoinColumn(name = "DepartmentID")
    private Department department;
}
