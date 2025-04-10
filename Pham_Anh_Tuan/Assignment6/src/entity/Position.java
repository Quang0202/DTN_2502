package entity;

import backend.ScannerUtils;

public class Position {
    private int id;
    private String name;

    public Position() {
        System.out.println("Nhap id Position: ");
        id = ScannerUtils.inputInt("ID phải là số nguyên. Nhập lại:");
        System.out.println("Nhap name Position: ");
        name = ScannerUtils.inputString("Tên không được để trống. Nhập lại:");
    }

    public String toString() {
        return "Position: ID=" + id + ", Name=" + name;
    }
}
