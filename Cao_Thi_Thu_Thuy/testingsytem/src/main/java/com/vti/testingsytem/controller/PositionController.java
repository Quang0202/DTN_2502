package com.vti.testingsytem.controller;

import com.vti.testingsytem.entity.Department;
import com.vti.testingsytem.service.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/position")
public class PositionController {
    @Autowired
    private IPositionService positionService;

    @GetMapping("/")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(positionService.getAll());
    }
}
