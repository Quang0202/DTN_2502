package com.vti.hello.controller;

import com.vti.hello.entity.Position;
import com.vti.hello.repository.IPositionRepository;
import com.vti.hello.service.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/position")
public class PositionController {

    @Autowired
    private IPositionRepository repository;

    @GetMapping("/")
    public List<Position> getAllPositions() {
        return repository.findAll();
    }
}
