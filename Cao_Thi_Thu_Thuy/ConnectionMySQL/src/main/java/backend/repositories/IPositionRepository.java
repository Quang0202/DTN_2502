package backend.repositories;

import entity.Position;

public interface IPositionRepository {
    Position getPositionByID(int id);
}
