package vti.accountmanagement.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
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
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Position implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="PositionID")
    Integer positionId;

    @Column(nullable = false, unique = true, name="PositionName")
    @Enumerated(EnumType.STRING)
    PositionName positionName;

    @OneToMany(mappedBy="position")
    List<Account> accounts;

    public Position(Integer positionId) {
        this.positionId = positionId;
    }

}
