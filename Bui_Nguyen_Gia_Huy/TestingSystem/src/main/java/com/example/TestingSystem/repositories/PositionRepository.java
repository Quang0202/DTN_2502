package com.example.TestingSystem.repositories;

import com.example.TestingSystem.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionRepository extends JpaRepository<Position, Short> {
}
