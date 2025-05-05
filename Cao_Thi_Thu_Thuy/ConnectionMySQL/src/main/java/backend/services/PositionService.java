package backend.services;

import backend.repositories.IPositionRepository;
import backend.repositories.PositionRepository;
import entity.Position;

public class PositionService implements IPositionService{
    private IPositionRepository positionRepository;
    public PositionService(){
        positionRepository = new PositionRepository();
    }
    @Override
    public Position getPositionByID(int id) {
        return positionRepository.getPositionByID(id);
    }
}
