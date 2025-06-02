package com.example.TestingSystem.repositories;

import com.example.TestingSystem.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IPositionRepository extends JpaRepository<Position, Short> {
    Optional<Position> findByPositionName(Position.PositionName position);
}
