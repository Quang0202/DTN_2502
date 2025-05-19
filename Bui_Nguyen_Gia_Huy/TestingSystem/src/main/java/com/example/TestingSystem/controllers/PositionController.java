package com.example.TestingSystem.controllers;

import com.example.TestingSystem.dto.PositionDTO;
import com.example.TestingSystem.services.PositionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/positions")
public class PositionController {
    private final PositionService positionService;

    public PositionController(PositionService positionService) {
        this.positionService = positionService;
    }

    @GetMapping
    public List<PositionDTO> getAllPositions() {
        return positionService.getAllPositions();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePosition(@PathVariable Short id) {
        positionService.deletePosition(id);
        return ResponseEntity.noContent().build();
    }
}
