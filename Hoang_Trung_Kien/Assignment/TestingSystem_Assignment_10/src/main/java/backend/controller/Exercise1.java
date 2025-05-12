package backend.controller;

import backend.entity.Position;
import backend.repository.PositionRepository;

import java.util.List;

public class Exercise1 {
    public void ques2() {
        PositionRepository p = new PositionRepository();
        List<Position> positionList = p.getAllPosition();
        for (Position position : positionList) {
            System.out.println(position);
        }
    }

    public void ques3() {
        PositionRepository p = new PositionRepository();
        p.createPosition("Dev");
    }
}
