package com.vti.hello.repository;

import com.vti.hello.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPositionRepository extends JpaRepository<Position, Integer> {

}
