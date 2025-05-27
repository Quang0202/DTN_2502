package com.vti.QLNV.entity;

public enum PositionName {
    DEV("Dev"), TEST("Test"), SCRUM_MASTER("Scrum_Master"), PM("PM");

    private String name;

    PositionName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static PositionName getPositionName(String name){
        for(PositionName position: PositionName.values()){
            if(position.getName().equalsIgnoreCase(name)){
                return position;
            }
        }
        throw new IllegalArgumentException("Invalid PositionName: " + name);
    }
}
