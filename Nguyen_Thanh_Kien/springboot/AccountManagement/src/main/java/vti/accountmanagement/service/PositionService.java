package vti.accountmanagement.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vti.accountmanagement.response.dto.position.PositionListDto;

@Service
public interface PositionService {
    Page<PositionListDto> getAll(Pageable pageable);
//    Optional<T> findById(Long id);
//    void save(T t);
//    void update(T t);
//    void delete(T t);
}
