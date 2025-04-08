package com.vti.entity;

public class HighSchoolStudent extends Student_5_3{
    private String clazz;
    private String desiredUniversity;

    public HighSchoolStudent(String name, int id, String clazz, String desiredUniversity) {
        super(name, id);
        this.clazz = clazz;
        this.desiredUniversity = desiredUniversity;
    }


    @Override
    public String toString() {
        return "HighSchoolStudent{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", clazz='" + clazz + '\'' +
                ", desiredUniversity='" + desiredUniversity + '\'' +
                '}';
    }
}
