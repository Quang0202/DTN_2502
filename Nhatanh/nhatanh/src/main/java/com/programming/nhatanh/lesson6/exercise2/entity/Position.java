package com.programming.nhatanh.lesson6.exercise2.entity;

public class Position {
    public int positionId;
    public String positionName;

    public Position() {
        ScannerUtils scannerUtils = new ScannerUtils();
        positionId = scannerUtils.inputInt("Invalid input");
        positionName = scannerUtils.inputString();
    }
}
