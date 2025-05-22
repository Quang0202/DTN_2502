package com.vti.assignment3.service;


import com.vti.assignment3.entity.Position;
import com.vti.assignment3.repository.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionService {

    @Autowired
    private PositionRepository repository;

    public List<Position> getAllPositions() {
        return repository.findAll();
    }

    public void deletePosition(Integer id) {
        repository.deleteById(id);
    }
}