package com.vti.QLNV.service;

import com.vti.QLNV.entity.Position;

import java.util.List;

public interface IPositionService {
    List<Position> getAllPosition();
    String deletePositionById(Integer id);

}
