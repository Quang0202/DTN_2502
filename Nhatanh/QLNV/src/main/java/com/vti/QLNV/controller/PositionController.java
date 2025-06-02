package com.vti.QLNV.controller;

import com.vti.QLNV.entity.Position;
import com.vti.QLNV.service.IPositionService;
import com.vti.QLNV.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/position/v1")
public class PositionController {

    @Autowired
    private IPositionService service;

    @DeleteMapping(value = "/delete/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> deletePosition(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(service.deletePositionById(id));
    }
    @GetMapping()
    public ResponseEntity<Page<Position>> getAllPosition(@RequestParam(defaultValue = "0") Integer pageNo,
                                                         @RequestParam(defaultValue = "10") Integer pageSize,
                                                         @RequestParam(defaultValue = "positionId") String sortBy) {
        Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));
        return ResponseEntity.ok(service.getAllPosition(paging));
    }

}
    