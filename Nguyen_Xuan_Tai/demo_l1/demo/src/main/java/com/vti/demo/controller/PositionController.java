package com.vti.demo.controller;

import com.vti.demo.entity.Position;
import com.vti.demo.entity.PositionName;
import com.vti.demo.repository.IPositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/position")
public class PositionController {

    @Autowired
    private IPositionRepository positionRepository;

    @GetMapping("/")
    private List<Position> findAllPosition() {
        return positionRepository.findAll();
    }

    @GetMapping("/{id}")
    public Position getPositionById(@PathVariable int id) {
       return positionRepository.findById(id).orElse(null);

    }

    @DeleteMapping("/{id}")
    public void  DeleteById(@PathVariable int id) {
        positionRepository.deleteById(id);
    }

//    @PostMapping("/create/{id}")
//    public Position  findByName(@RequestBody PositionName name) {
//        return positionRepository.findPositionName(name);
//    }

}
