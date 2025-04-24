package Exercise2;

import java.util.Date;

public class Group {
    private int id;
    private String name;
    private Account creator;
    private Account[] accounts;
    private Date createDate;

    public Group() {
        System.out.println("Please input group ID:");
        this.id = ScannerUtils.inputInt("Please input a valid group ID as an integer!");

        System.out.println("Please input group name:");
        this.name = ScannerUtils.inputString();

        System.out.println("Please create the group creator account:");
        this.creator = new Account();

        System.out.println("Do you want to add accounts to this group? (Y/N)");
        String answer = ScannerUtils.inputString();
        if (answer.equalsIgnoreCase("Y")) {
            System.out.println("How many accounts do you want to add?");
            int numberOfAccounts = ScannerUtils.inputInt("Please input a valid number as an integer!");

            this.accounts = new Account[numberOfAccounts];
            for (int i = 0; i < numberOfAccounts; i++) {
                System.out.println("Please input information for account " + (i+1) + ":");
                this.accounts[i] = new Account();
            }
        }

        this.createDate = new Date();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Group{id=" + id + ", name='" + name + "', creator=" + creator + ", createDate=" + createDate);

        if (accounts != null) {
            result.append(", accounts=[");
            for (int i = 0; i < accounts.length; i++) {
                result.append(accounts[i]);
                if (i < accounts.length - 1) {
                    result.append(", ");
                }
            }
            result.append("]");
        }

        result.append("}");
        return result.toString();
    }
}
