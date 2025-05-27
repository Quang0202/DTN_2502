package com.vti.helloworld.request;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import java.util.List;

@Data
@NoArgsConstructor
public class AccountParamForm {
    @Min(1)
    private int pageNumber;
    @Min(5)
    @Max(20)
    private int pageSize;

    private List<String> sort;
}
