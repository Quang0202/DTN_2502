package com.vti.QLNV.service;

import com.vti.QLNV.entity.Department;
import com.vti.QLNV.entity.Position;
import com.vti.QLNV.repository.PositionRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionService implements IPositionService{
    @Autowired
    private PositionRepository positionRepository;

    @Override
    public Page<Position> getAllPosition(Pageable pageable) {
        var pagedResult =  positionRepository.findAll(pageable);
        if(pagedResult.hasContent()) {
            return pagedResult;
        } else {
            return null;
        }
    }

    @Override
    @Transactional
    public String deletePositionById(Integer id) {
        positionRepository.deletePositionByPositionId(id);
        return "Deleted position";
    }
}
