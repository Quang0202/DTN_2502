package kienld.btvn.vti.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import kienld.btvn.vti.entity.Position;

public interface IPositionController {
        public ResponseEntity<List<Position>> get_all_Positions_Controller();
        public String delete_Positions_Controller(Integer id);
}
