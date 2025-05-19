package com.example.TestingSystem.services;

import com.example.TestingSystem.dto.PositionDTO;
import com.example.TestingSystem.entity.Position;
import com.example.TestingSystem.repositories.PositionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PositionService {
    private final PositionRepository positionRepository;


    public PositionService(PositionRepository positionRepository) {
        this.positionRepository = positionRepository;
    }

    private PositionDTO positionDTO(Position position) {
        PositionDTO positionDTO = new PositionDTO();
        positionDTO.setPositionID(position.getPositionID());
        positionDTO.setPositionName(position.getPositionName().name());
        return positionDTO;
    }

    public List<PositionDTO> getAllPositions() {
        return positionRepository.findAll().stream()
                .map(this::positionDTO)
                .collect(Collectors.toList());
    }

    public void deletePosition(Short positionId) {
        positionRepository.deleteById(positionId);
    }
}
