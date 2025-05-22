package com.vti.QLNV.service;

import com.vti.QLNV.entity.Position;
import com.vti.QLNV.repository.IPositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionService implements IPositionService {

    @Autowired
    private IPositionRepository positionRepository;

    @Override
    public List<Position> getAllPositions() {
        return positionRepository.findAll();
    }

    @Override
    public Position createPosition(Position position) {
        if (position.getPositionName() == null) {
            throw new IllegalArgumentException("Vị trí không được để trống.");
        }

        if (positionRepository.existsByPositionName(position.getPositionName())) {
            throw new IllegalArgumentException("Vị trí đã tồn tại!");
        }

        return positionRepository.save(position);
    }

    @Override
    public void deletePositionById(int id) {
        Position position = positionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Không tìm thấy vị trí với ID = " + id));
        positionRepository.delete(position);
    }
}
