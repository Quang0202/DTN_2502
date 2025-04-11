package vti.accountmanagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name = "Position")
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long positionId;

    @Column(nullable = false, unique = true)
    private String positionName;

    @OneToMany(mappedBy="position")
    private List<Account> accounts;
}
