package com.vti.QLNV.service;

import com.vti.QLNV.entity.Position;
import com.vti.QLNV.repository.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionService implements IPositionService{
    @Autowired
    private PositionRepository positionRepository;

    @Override
    public List<Position> getAllPosition() {
        return positionRepository.getAllPosition();
    }

    @Override
    public String deletePositionById(Integer id) {
        positionRepository.deletePositionById(id);
        return "Deleted position";
    }
}
