package entity;

import backend.ScannerUtils;

public class Position {
    private int id;
    private String name;

    public Position() {
        System.out.println("=== Nhập thông tin Position ===");
        this.id = ScannerUtils.inputInt("ID phải là số nguyên. Nhập lại:");
        this.name = ScannerUtils.inputString("Tên chức vụ không được để trống. Nhập lại:");
    }

    @Override
    public String toString() {
        return "Position { ID=" + id + ", Name='" + name + "' }";
    }
}
