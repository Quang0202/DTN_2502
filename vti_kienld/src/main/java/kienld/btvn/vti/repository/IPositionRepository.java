package kienld.btvn.vti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kienld.btvn.vti.entity.Position;

@Repository
public interface IPositionRepository extends JpaRepository<Position, Integer>{

}
