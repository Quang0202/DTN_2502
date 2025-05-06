package entity;

import backend.ScannerUtils;

public class Department {
    private int id;
    private String name;

    public Department() {
        System.out.println("=== Nhập thông tin Department ===");
        this.id = ScannerUtils.inputInt("ID phải là số nguyên. Nhập lại:");
        this.name = ScannerUtils.inputString("Tên không được để trống. Nhập lại:");
    }

    @Override
    public String toString() {
        return "Department { ID=" + id + ", Name='" + name + "' }";
    }
}
