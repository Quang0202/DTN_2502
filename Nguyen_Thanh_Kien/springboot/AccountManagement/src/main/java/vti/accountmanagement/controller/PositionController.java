package vti.accountmanagement.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import vti.accountmanagement.payload.PageResponse;
import vti.accountmanagement.response.dto.position.PositionListDto;
import vti.accountmanagement.service.PositionService;
import vti.accountmanagement.utils.ConstantUtils;
import vti.accountmanagement.utils.SortUtils;

@RestController
@RequestMapping("/api/position")
@AllArgsConstructor
@Validated
@Tag(name = "Position", description = "API for retrieving position information")
public class PositionController {

    private final PositionService positionService;

    @GetMapping("")
    @Operation(
            summary = "Get paginated list of positions",
            description = "Retrieve a paginated list of positions with optional sorting and keyword search."
    )
    public ResponseEntity<PageResponse<PositionListDto>> getDepartment(
            @Parameter(description = "Page number (0-based)")
            @Min(value = 0, message = "Page must not be less than 0")
            @RequestParam(defaultValue = "0") Integer page,

            @Parameter(description = "Page size (1 to " + ConstantUtils.MAX_PAGE_SIZE + ")")
            @Max(value = ConstantUtils.MAX_PAGE_SIZE, message = "Size must not be greater than " + ConstantUtils.MAX_PAGE_SIZE)
            @Min(value = 1, message = "Size must not be less than 1")
            @RequestParam(defaultValue = "10") Integer size,

            @Parameter(description = "Sort format: field,direction (e.g. positionId,asc)")
            @RequestParam(defaultValue = "positionId,asc") String[] sort,

            @Parameter(description = "Keyword to search positions")
            @RequestParam(required = false, defaultValue = "") String search
    ) {
        return ResponseEntity.ok(
                positionService.getAll(PageRequest.of(page, size, SortUtils.getSort(sort)), search)
        );
    }
}
