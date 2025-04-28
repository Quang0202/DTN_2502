package vti.accountmanagement.service.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.util.ReflectionTestUtils;
import vti.accountmanagement.enums.PositionName;
import vti.accountmanagement.model.Position;
import vti.accountmanagement.repository.PositionRepository;
import vti.accountmanagement.utils.ObjectMapperUtils;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class PositionServiceImplTest {
    @Mock
    private PositionRepository positionRepository;

    @InjectMocks
    private PositionServiceImpl positionService;

    private final ObjectMapperUtils objectMapperUtils = new ObjectMapperUtils();

    @BeforeEach
    void setUp() {
        ReflectionTestUtils.setField(positionService, "objectMapperUtils", objectMapperUtils);
    }

    @Test
    void getAll_success() {
        Pageable pageable = PageRequest.of(0, 10);
        Position position = new Position(1, PositionName.DEV);

        Page<Position> page = new PageImpl<>(List.of(position));

        when(positionRepository.findAll(pageable, null)).thenReturn(page);

        var result = positionService.getAll(pageable, null);

        assertEquals(1, result.getContent().size());
    }
}
