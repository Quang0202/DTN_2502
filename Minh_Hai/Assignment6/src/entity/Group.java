package entity;

import backend.ScannerUtils;

public class Group {
    private int id;
    private String name;
    private Account[] accounts;

    public Group() {
        System.out.println("Khởi tạo Group:");
        System.out.println("Nhap id Group: ");
        id = ScannerUtils.inputInt("ID phải là số nguyên. Nhập lại:");
        System.out.println("Nhap name Group: ");
        name = ScannerUtils.inputString("Tên không được để trống. Nhập lại:");

        System.out.print("Bạn có muốn thêm account không? (yes/no): ");
        String isAdd = ScannerUtils.inputString("Không hợp lệ. Nhập lại:");

        if (isAdd.equalsIgnoreCase("yes")) {
            int count = ScannerUtils.inputInt("Bạn muốn thêm bao nhiêu account?");
            accounts = new Account[count];
            for (int i = 0; i < count; i++) {
                System.out.println("Nhập account thứ " + (i + 1));
                accounts[i] = new Account();
            }
        }
    }

    public String toString() {
        String result = "Group: ID=" + id + ", Name=" + name + "\nAccounts:\n";
        if (accounts != null) {
            for (Account acc : accounts) {
                result += acc + "\n";
            }
        } else {
            result += "Không có account nào.";
        }
        return result;
    }
}
