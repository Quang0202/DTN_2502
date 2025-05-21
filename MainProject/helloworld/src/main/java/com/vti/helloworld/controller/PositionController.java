package com.vti.helloworld.controller;

import com.vti.helloworld.entity.Position;
import com.vti.helloworld.repository.IPositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/position")
public class PositionController {

    @Autowired
    private IPositionRepository positionRepository;

    @GetMapping("/")
    public List<Position> getAllPosition(){
        return positionRepository.findAll();
    }
}
