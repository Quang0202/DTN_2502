package com.vti.testingsytem.entity;

public enum ETypeName {
    ESSAY("Essay"),
    MULTIPLE_CHOICE("Multiple-Choice");

    private String name;

    ETypeName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static ETypeName getTypeName(String name){
        for(ETypeName t : ETypeName.values()){
            if(t.getName().equals(name)){
                return t;
            }
        }
        return null;
    }
}
