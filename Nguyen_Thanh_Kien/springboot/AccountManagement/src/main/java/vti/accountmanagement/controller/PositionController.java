package vti.accountmanagement.controller;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import vti.accountmanagement.response.dto.position.PositionListDto;
import vti.accountmanagement.service.PositionService;
import vti.accountmanagement.utils.ConstantUtils;
import vti.accountmanagement.utils.SortUtils;

@RestController
@RequestMapping("/api/position")
@AllArgsConstructor
@Validated
public class PositionController {

    private final PositionService positionService;

    @GetMapping("")
    public ResponseEntity<Page<PositionListDto>> getDepartment(
            @Min(value = 0, message = "Page must not be less than 0")
            @RequestParam(defaultValue = "0")
            Integer page,
            @Max(value = ConstantUtils.MAX_PAGE_SIZE, message = "Size must not be greater than " + ConstantUtils.MAX_PAGE_SIZE)
            @Min(value = 1, message = "Size must not be less than 1")
            @RequestParam(defaultValue = "10")
            Integer size,
            @RequestParam(defaultValue = "positionId,asc")
            String[] sort,
            @RequestParam(required = false, defaultValue = "")
            String search
    ) {
        return ResponseEntity.ok(positionService.getAll(PageRequest.of(page, size, SortUtils.getSort(sort)), search));
    }

}
