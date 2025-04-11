package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Position {
    private int positionId;
    private String positionName;

    public Position(int positionId) {
        this.positionId = positionId;
    }

    public Position(String positionName) {
        this.positionName = positionName;
    }
}
