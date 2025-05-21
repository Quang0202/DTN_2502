package com.vti.testingsytem.entity;

public enum EPositionName {
    DEV("Dev"), TEST("Test"), SCRUM_MASTER("Scrum_Master"), PM("PM");

    private String name;

    EPositionName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static EPositionName getPositionName(String name){
        for(EPositionName n : EPositionName.values()){
            if (n.getName().equals(name)){
                return n;
            }
        }
        return null;
    }
}
