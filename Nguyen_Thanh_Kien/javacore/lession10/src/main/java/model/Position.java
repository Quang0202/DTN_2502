package model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Position {
    int positionId;
    String positionName;

    public Position(int positionId) {
        this.positionId = positionId;
    }

    public Position(String positionName) {
        this.positionName = positionName;
    }
}
