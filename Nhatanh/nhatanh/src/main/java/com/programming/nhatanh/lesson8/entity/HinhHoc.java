package com.programming.nhatanh.lesson8.entity;

public abstract class HinhHoc {

    private static int shapeCount = 0;

    public int getShapeCount() {
        return shapeCount;
    }

    public void setShapeCount(int shapeCount) {
        HinhHoc.shapeCount = shapeCount;
    }

    public void increaseShapeCount(){
        HinhHoc.shapeCount += 1;
    }

    public abstract float perimeter();
    public abstract float area();
}
