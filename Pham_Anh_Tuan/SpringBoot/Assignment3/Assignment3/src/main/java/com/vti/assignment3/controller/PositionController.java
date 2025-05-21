package com.vti.assignment3.controller;
import com.vti.assignment3.entity.Position;
import com.vti.assignment3.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/positions")
public class PositionController {

    @Autowired
    private PositionService service;

    @GetMapping
    public List<Position> getAllPositions() {
        return service.getAllPositions();
    }

    @DeleteMapping("/{id}")
    public void deletePosition(@PathVariable int id) {
        service.deletePosition(id);
    }
}
