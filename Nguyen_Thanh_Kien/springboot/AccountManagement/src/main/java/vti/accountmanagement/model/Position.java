package vti.accountmanagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Position")
@Data
@ToString
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
    private String positionName;

    @OneToMany(mappedBy="position")
    private List<Account> accounts;
}
