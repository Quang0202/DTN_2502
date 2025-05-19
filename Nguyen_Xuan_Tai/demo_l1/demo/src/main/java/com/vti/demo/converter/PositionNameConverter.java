package com.vti.demo.converter;

import com.vti.demo.entity.PositionName;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class PositionNameConverter implements AttributeConverter<PositionName, String> {
    @Override
    public String convertToDatabaseColumn(PositionName positionName) {
        return positionName.getName();
    }

    @Override
    public PositionName convertToEntityAttribute(String s) {
        return PositionName.getPositionName(s);
    }
}
