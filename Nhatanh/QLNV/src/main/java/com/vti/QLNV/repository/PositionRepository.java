package com.vti.QLNV.repository;

import com.vti.QLNV.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PositionRepository extends JpaRepository<Position, Integer> {

    @Query(value = "DELETE FROM Position a WHERE a.PositionId = :positionId", nativeQuery = true)
    void deletePositionByPositionId(@Param(("positionId")) Integer positionId);

}
