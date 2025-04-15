package Exercise2.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Group {
    private int id;
    private String name;
    private Account creator;
    private ArrayList<Account> accounts;

    Scanner scanner = new Scanner(System.in);
    ScannerUtils scannerUtils = new ScannerUtils();

    public Group(Account creator) {
        id = scannerUtils.inputInt("Vui long nhap lai");
        name = scannerUtils.inputString();
        this.creator = creator;
        System.out.println("Bạn có muốn thêm accounts hay không? (y/n)");
        if (scanner.nextLine().equals("y")) {
            System.out.println("So account ban muon them: ");
            int x = scanner.nextInt();
            for (int i = 1; i <= x; i++) {
                Account account = new Account();
                accounts.add(account);
            }
        }
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", creator=" + creator +
                '}';
    }
}
