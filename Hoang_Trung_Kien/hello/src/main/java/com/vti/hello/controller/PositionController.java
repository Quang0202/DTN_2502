package com.vti.hello.controller;

import com.vti.hello.entity.Department;
import com.vti.hello.entity.Position;
import com.vti.hello.repository.IPositionRepository;
import com.vti.hello.service.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @DeleteMapping("/delete")
    public void deleteDepartment(@RequestBody Position position) {
        repository.delete(position);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteDepartment(@PathVariable int id) {
        repository.deleteById(id);
    }
}
