package vti.accountmanagement.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vti.accountmanagement.exception.NotFoundException;
import vti.accountmanagement.model.Position;
import vti.accountmanagement.payload.PageResponse;
import vti.accountmanagement.repository.PositionRepository;
import vti.accountmanagement.response.dto.position.PositionListDto;
import vti.accountmanagement.service.PositionService;
import vti.accountmanagement.utils.ObjectMapperUtils;

@Service
@AllArgsConstructor
public class PositionServiceImpl implements PositionService {

    private final PositionRepository positionRepository;
    private final ObjectMapperUtils objectMapperUtils = new ObjectMapperUtils();

    @Override
    public PageResponse<PositionListDto> getAll(Pageable pageable, String search) {
        Page<Position> positions = positionRepository.findAll(pageable,search);
        return new PageResponse<>(objectMapperUtils.mapEntityPageIntoDtoPage(positions, PositionListDto.class));
    }
}
