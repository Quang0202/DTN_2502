package com.vti.QLNV.controller;

import com.vti.QLNV.entity.Position;
import com.vti.QLNV.service.IPositionService;
import com.vti.QLNV.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/position/v1")
public class PositionController {

    @Autowired
    private IPositionService service;

    public PositionController(PositionService service){
        this.service = service;
    }

    @DeleteMapping(value = "/delete/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> deleteDepartment(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(service.deletePositionById(id));
    }
    @GetMapping()
    public ResponseEntity<List<Position>> createDepartment() {
        return ResponseEntity.ok(service.getAllPosition());
    }

}
    