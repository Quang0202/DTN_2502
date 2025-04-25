package vti.accountmanagement.response.dto.position;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import vti.accountmanagement.enums.PositionName;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PositionListDto {
    int positionId;
    PositionName positionName;
}
