package com.vti.testingsytem.converter;

import com.vti.testingsytem.entity.ETypeName;
import jakarta.persistence.AttributeConverter;

import java.lang.annotation.ElementType;

public class TypeNameConverter implements AttributeConverter<ETypeName, String> {
    @Override
    public String convertToDatabaseColumn(ETypeName typeName) {
        return typeName.getName();
    }

    @Override
    public ETypeName convertToEntityAttribute(String dbData) {
        return ETypeName.getTypeName(dbData);
    }
}
