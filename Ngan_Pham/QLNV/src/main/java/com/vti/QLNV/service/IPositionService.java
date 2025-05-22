package com.vti.QLNV.service;

import com.vti.QLNV.entity.Position;

import java.util.List;

public interface IPositionService {
    List<Position> getAllPositions();
    Position createPosition(Position position);
    void deletePositionById(int id);
}
