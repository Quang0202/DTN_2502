package com.vti.assignment45.repository;

import com.vti.assignment45.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

public interface PositionRepository extends JpaRepository<Position, Integer> {

    Optional<Position> findByPositionName(Position.PositionName positionName);
}
