package com.vti.QLNV.controller;

import com.vti.QLNV.entity.Position;
import com.vti.QLNV.service.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/position")
public class PositionController {

    @Autowired
    private IPositionService positionService;

    @GetMapping("/list")
    public ResponseEntity<List<Position>> getAllPositions() {
        return ResponseEntity.ok(positionService.getAllPositions());
    }

    @PostMapping("/create")
    public ResponseEntity<?> createPosition(@RequestBody Position position) {
        try {
            Position created = positionService.createPosition(position);
            return ResponseEntity.ok(created);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deletePosition(@PathVariable int id) {
        try {
            positionService.deletePositionById(id);
            return ResponseEntity.ok("Xoá vị trí thành công.");
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
