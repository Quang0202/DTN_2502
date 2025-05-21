package kienld.btvn.vti.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kienld.btvn.vti.entity.Position;
import kienld.btvn.vti.services.PositionServices;

@RestController
@RequestMapping("/api/v1/position")

public class PositionController {
    private final PositionServices positionServices; 
    

    public PositionController(PositionServices positionServices) {
        this.positionServices = positionServices;
    }
    @GetMapping(" ")
    public ResponseEntity<List<Position>> get_all_Positions_Controller() {
        return ResponseEntity.ok().body(this.positionServices.get_all_Positions());
    }
    @DeleteMapping("/{id}")
        public String delete_Positions_Controller(@PathVariable Integer id) {
            this.positionServices.delete_Positions( id

            ); 
            return "Delete Success!";
        } 
}

