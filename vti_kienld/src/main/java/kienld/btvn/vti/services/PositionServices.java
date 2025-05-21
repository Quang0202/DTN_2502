package kienld.btvn.vti.services;

import java.util.List;

import org.springframework.stereotype.Service;

import kienld.btvn.vti.entity.Position;
import kienld.btvn.vti.repository.IPositionRepository;

@Service
public class PositionServices {
    private final IPositionRepository iPositionRepository;
    
    public PositionServices(IPositionRepository iPositionRepository) {
        this.iPositionRepository = iPositionRepository;
    }

    public List<Position> get_all_Positions() {
        return this.iPositionRepository.findAll();
    }

    public void delete_Positions(Integer id) {
        this.iPositionRepository.deleteById(id);
    }
}



