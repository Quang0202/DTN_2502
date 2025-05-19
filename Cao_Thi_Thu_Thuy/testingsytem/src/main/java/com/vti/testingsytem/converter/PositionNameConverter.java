package com.vti.testingsytem.converter;

import com.vti.testingsytem.entity.EPositionName;
import jakarta.persistence.AttributeConverter;

public class PositionNameConverter implements AttributeConverter<EPositionName, String> {
    @Override
    public String convertToDatabaseColumn(EPositionName positionName) {
        return positionName.getName();
    }

    @Override
    public EPositionName convertToEntityAttribute(String dbData) {
        return EPositionName.getPositionName(dbData);
    }
}
