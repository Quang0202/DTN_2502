package com.vti.QLNV.service;

import com.vti.QLNV.entity.Position;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IPositionService {
    Page<Position> getAllPosition(Pageable pageable);
    String deletePositionById(Integer id);

}
