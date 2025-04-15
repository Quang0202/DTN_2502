package vti.accountmanagement.response.dto.position;

import lombok.Getter;
import lombok.Setter;
import vti.accountmanagement.enums.PositionName;

@Getter
@Setter
public class PositionListDto {
    private int positionId;
    PositionName positionName;
}
