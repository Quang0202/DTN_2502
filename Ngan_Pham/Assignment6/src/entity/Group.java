package entity;

import backend.ScannerUtils;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private int id;
    private String name;
    private List<Account> accounts;

    public Group() {
        System.out.println("=== Nhập thông tin Group ===");
        this.id = ScannerUtils.inputInt("ID phải là số nguyên. Nhập lại:");
        this.name = ScannerUtils.inputString("Tên nhóm không được để trống. Nhập lại:");
        this.accounts = new ArrayList<>();

        while (true) {
            System.out.print("Bạn có muốn thêm Account vào group không? (yes/no): ");
            String answer = ScannerUtils.inputString().trim().toLowerCase();

            if (answer.equals("yes") || answer.equals("y")) {
                Account account = new Account();
                accounts.add(account);
            } else if (answer.equals("no") || answer.equals("n")) {
                break;
            } else {
                System.out.println("Vui lòng nhập 'yes' hoặc 'no'.");
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Group { ID=" + id + ", Name='" + name + "' }\nDanh sách account:");
        for (Account acc : accounts) {
            sb.append("\n - ").append(acc);
        }
        return sb.toString();
    }
}
