package com.programming.nhatanh.lesson7.entity;

public abstract class HinhHoc {

    private int shapeCount = 0;

    public int getShapeCount() {
        return shapeCount;
    }

    public void setShapeCount(int shapeCount) {
        this.shapeCount = shapeCount;
    }

    public void increaseShapeCount(){
        this.shapeCount += 1;
    }

    public abstract float perimeter();
    public abstract float area();
}
