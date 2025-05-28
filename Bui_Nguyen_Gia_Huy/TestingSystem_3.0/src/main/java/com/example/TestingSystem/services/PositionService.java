package com.example.TestingSystem.services;

import com.example.TestingSystem.dto.PositionDTO;
import com.example.TestingSystem.entity.Position;
import com.example.TestingSystem.repositories.IPositionRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PositionService {
    private final IPositionRepository IPositionRepository;
    private final ModelMapper modelMapper;


    public PositionService(IPositionRepository IPositionRepository, ModelMapper modelMapper) {
        this.IPositionRepository = IPositionRepository;
        this.modelMapper = modelMapper;
    }

//    private PositionDTO positionDTO(Position position) {
//        PositionDTO positionDTO = new PositionDTO();
//        positionDTO.setPositionID(position.getPositionID());
//        positionDTO.setPositionName(position.getPositionName().name());
//        return positionDTO;
//    }

    public PositionDTO positionDTO(Position position) {
        return modelMapper.map(position, PositionDTO.class);
    }

    public List<PositionDTO> getAllPositions() {
        return IPositionRepository.findAll().stream()
                .map(this::positionDTO)
                .collect(Collectors.toList());
    }

    public void deletePosition(Short positionId) {
        IPositionRepository.deleteById(positionId);
    }
}
