package vti.accountmanagement.service;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vti.accountmanagement.payload.PageResponse;
import vti.accountmanagement.response.dto.position.PositionListDto;

@Service
public interface PositionService {
    PageResponse<PositionListDto> getAll(Pageable pageable, String search);
}
