package vti.accountmanagement.utils;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import vti.accountmanagement.enums.PositionName;

@Converter(autoApply = true)
public class PositionNameConverter implements AttributeConverter<PositionName, String> { //NOSONAR

    @Override
    public String convertToDatabaseColumn(PositionName attribute) {
        return attribute == null ? null : attribute.name();
    }

    @Override
    public PositionName convertToEntityAttribute(String dbData) {
        return dbData == null ? null : PositionName.valueOf(dbData.toUpperCase());
    }
}

