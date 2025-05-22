package com.vti.QLNV.repository;

import com.vti.QLNV.entity.Position;
import com.vti.QLNV.entity.PositionName;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPositionRepository extends JpaRepository<Position, Integer> {
    boolean existsByPositionName(PositionName positionName);
}
