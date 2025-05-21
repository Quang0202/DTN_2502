package com.vti.testingsytem.service;

import com.vti.testingsytem.entity.Position;
import com.vti.testingsytem.repository.IPositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IPositionService {
    List<Position> getAll();
}
