package vti.accountmanagement.model;

import jakarta.persistence.*;
import lombok.*;
import vti.accountmanagement.enums.PositionName;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Position")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Position implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="PositionID")
    private Integer positionId;

    @Column(nullable = false, unique = true, name="PositionName")
    @Enumerated(EnumType.STRING)
    private PositionName positionName;

    @OneToMany(mappedBy="position")
    private List<Account> accounts;

    public Position(Integer positionId) {
        this.positionId = positionId;
    }

}
