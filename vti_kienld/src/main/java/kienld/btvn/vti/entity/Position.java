package kienld.btvn.vti.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name = "Position")
public class Position {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer PositionID;
    @Enumerated(EnumType.STRING)
    private PositionName positionName 
    
    ;
    public Integer getPositionID() {
        return PositionID;
    }
    public void setPositionID(Integer positionID) {
        PositionID = positionID;
    }
    public PositionName getPositionName() {
        return positionName;
    }
    public void setPositionName(PositionName positionName) {
        this.positionName = positionName;
    }
    @Override
    public String toString() {
        return "Position [PositionID=" + PositionID + ", positionName=" + positionName + "]";
    }
    public Position() {
    }
    public Position(Integer positionID, PositionName positionName) {
        PositionID = positionID;
        this.positionName = positionName;
    }
}
