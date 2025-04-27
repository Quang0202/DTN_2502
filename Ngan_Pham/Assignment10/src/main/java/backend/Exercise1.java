package backend;

import entity.Position;
import entity.PositionRepository;

import java.util.List;

public class Exercise1 {
    public void question2() {
        PositionRepository p = new PositionRepository();
        List<Position> positionList = p.getAllPosition();
        for (Position position : positionList) {
            System.out.println(position);
        }
    }

    public void question3() {
        PositionRepository p = new PositionRepository();
        p.createPosition("Dev");
    }
}
