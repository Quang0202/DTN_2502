package com.vti.demo.repository;

import com.vti.demo.entity.Position;
import com.vti.demo.entity.PositionName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPositionRepository extends JpaRepository<Position, Integer> {

//   Position findPositionName(PositionName name);
}
