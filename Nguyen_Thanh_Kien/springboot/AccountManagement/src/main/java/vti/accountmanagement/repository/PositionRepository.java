package vti.accountmanagement.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import vti.accountmanagement.model.Position;

@Repository
public interface PositionRepository extends JpaRepository<Position, Integer> {
    Position findByPositionId(int id);
    @Query(value = "SELECT pos FROM Position pos " +
            "WHERE CAST(pos.positionName AS string) LIKE %:search%")
    Page<Position> findAll(Pageable pageable, String search);
}
