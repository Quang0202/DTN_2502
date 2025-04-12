package vti.accountmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vti.accountmanagement.model.Position;

@Repository
public interface PositionRepository extends JpaRepository<Position, Integer> {
    Position findByPositionId(int id);
//    Position findByPositionName(String name);
}
