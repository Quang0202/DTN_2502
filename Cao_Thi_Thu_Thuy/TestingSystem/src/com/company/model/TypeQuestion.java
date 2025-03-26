package com.company.model;

public class TypeQuestion {
    int typeId;
    ETypeQuestion typeName;

    public TypeQuestion(int typeId, ETypeQuestion typeName) {
        this.typeId = typeId;
        this.typeName = typeName;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public ETypeQuestion getTypeName() {
        return typeName;
    }

    public void setTypeName(ETypeQuestion typeName) {
        this.typeName = typeName;
    }
}
