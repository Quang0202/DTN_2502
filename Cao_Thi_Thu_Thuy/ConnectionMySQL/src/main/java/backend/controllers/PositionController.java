package backend.controllers;

import backend.services.IPositionService;
import backend.services.PositionService;
import entity.Position;

public class PositionController {
    private IPositionService positionService;
    public PositionController(){
        positionService = new PositionService();
    }
    public Position getPositionByID(int id){
        return positionService.getPositionByID(id);
    }
}
