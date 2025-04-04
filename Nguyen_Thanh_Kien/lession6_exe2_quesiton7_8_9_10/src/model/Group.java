package model;

import java.time.LocalDate;
import java.util.Scanner;

public class Group {
    private int groupId;
    private String groupName;
    private Account creator;
    private LocalDate createDate;
    private Account[] accounts;
    private LocalDate[] joinDate;

    public LocalDate[] getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDate[] joinDate) {
        this.joinDate = joinDate;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }

    public Account getCreator() {
        return creator;
    }

    public void setCreator(Account creator) {
        this.creator = creator;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public Group() {
        System.out.println("Enter Id: ");
        this.groupId = ScannerUtils.inputInt("Please input a number as int");
        System.out.println("Enter Name: ");
        this.groupName = ScannerUtils.inputString();
        System.out.println("Do you want add account? (Y/N)");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("Y")) {
            System.out.println("How many accounts?");
            int length = scanner.nextInt();
            accounts = new Account[length];
            for (int i = 0; i < length; i++) {
                System.out.println("Enter account number: " + (i + 1));
                accounts[i] = new Account();
            }
        }
    }
}
