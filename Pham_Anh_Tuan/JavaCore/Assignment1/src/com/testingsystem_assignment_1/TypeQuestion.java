package com.testingsystem_assignment_1;

public class TypeQuestion {
    int typeId;
    String typeName;

    public TypeQuestion(int typeId, String typeName) {
        this.typeId = typeId;
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "TypeQuestion{" +
                "typeId=" + typeId +
                ", typeName='" + typeName + '\'' +
                '}';
    }
}
