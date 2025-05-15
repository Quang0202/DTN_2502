package entity;

import backend.ScannerUtils;

public class Department {
    private int id;
    private String name;

    public Department() {
        System.out.println("Nhap id Department: ");
        id = ScannerUtils.inputInt("ID phải là số nguyên. Nhập lại:");
        System.out.println("Nhap name Department: ");
        name = ScannerUtils.inputString("Tên không được để trống. Nhập lại:");
    }

    public String toString() {
        return "Department: ID=" + id + ", Name=" + name;
    }
}
