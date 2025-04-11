package vti.accountmanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

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
public class Account implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer accountId;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false, unique = true)
    private String email;

    private String fullName;

    @CreatedDate
    private Date createdAt;

    @ManyToOne
    @JoinColumn(name = "PositionID")
    private Position position;

    @ManyToOne
    @JoinColumn(name = "DepartmentID")
    private Department department;
}
