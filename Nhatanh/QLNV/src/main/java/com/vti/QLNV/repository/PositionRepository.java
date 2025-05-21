package com.vti.QLNV.repository;

import com.vti.QLNV.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PositionRepository extends JpaRepository<Position, Integer> {

    List<Position> getAllPosition();
    void deletePositionById(Integer id);

}
