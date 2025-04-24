package vti.accountmanagement.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vti.accountmanagement.exception.NotFoundException;
import vti.accountmanagement.model.Position;
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
    public Page<PositionListDto>  getAll(Pageable pageable, String search) {
        Page<Position> positions;
        try{
            positions = positionRepository.findAll(pageable,search);
        } catch (Exception e){
//            catch truong hop trong enum khong ton tai name hien co trong database
            throw new NotFoundException(e.getMessage());
        }
        return objectMapperUtils.mapEntityPageIntoDtoPage(positions, PositionListDto.class);
    }
}
