import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Bai_9 {
    public static
    class Account {
        String username;
        List<String> groups;

        public Account(String username) {
            this.username = username;
            this.groups = new ArrayList<>();
        }

        public void addGroup(String groupName) {
            if (!groups.contains(groupName)) {
                groups.add(groupName);
                System.out.println("Đã thêm group '" + groupName + "' vào tài khoản '" + username + "'.");
            } else {
                System.out.println("Tài khoản '" + username + "' đã thuộc group '" + groupName + "' rồi.");
            }
        }
    }

    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account("Alice"));
        accounts.add(new Account("Bob"));
        accounts.add(new Account("Charlie"));

        List<String> groups = Arrays.asList("Group A", "Group B", "Group C");

        addGroupToAccount(accounts, groups);
    }

    public static void addGroupToAccount(List<Account> accounts, List<String> groups) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Danh sách tài khoản:");
        for (Account acc : accounts) {
            System.out.println("- " + acc.username);
        }


        System.out.print("Nhập username của account cần thêm vào group: ");
        String username = scanner.nextLine();


        Account selectedAccount = null;
        for (Account acc : accounts) {
            if (acc.username.equals(username)) {
                selectedAccount = acc;
                break;
            }
        }

        if (selectedAccount == null) {
            System.out.println("Tài khoản không tồn tại.");
            return;
        }


        System.out.println("Danh sách group:");
        for (String group : groups) {
            System.out.println("- " + group);
        }


        System.out.print("Nhập tên group cần thêm vào account: ");
        String groupName = scanner.nextLine();


        if (!groups.contains(groupName)) {
            System.out.println("Group không tồn tại.");
            return;
        }


        selectedAccount.addGroup(groupName);
    }
}
