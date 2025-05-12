import java.util.Scanner;

public class Exercise5 {
    public Department createDepartment() {
        Department department = new Department();
        Scanner scanner = new Scanner(System.in);
        department.departmentId = scanner.nextInt();
        department.departmentName = scanner.next();
        return department;
    }

    public Account createAccount() {
        Account account = new Account();
        Scanner scanner = new Scanner(System.in);
        account.accountId = scanner.nextInt();
        scanner.next();
        account.fullName = scanner.nextLine();
        scanner.next();
        account.email = scanner.nextLine();
        account.position.positionId = scanner.nextInt();
        switch (account.position.positionId) {
            case 1:
                account.position.positionName = "Position.Dev";
                break;
            case 2:
                account.position.positionName = "Position.Test";
                break;
            case 3:
                account.position.positionName = "Position.PM";
                break;
            case 4:
                account.position.positionName = "Position.ScrumMaster";
                break;

        }
        return account;
    }

    public void addGroup(Account[] accounts, Group[] groups) {
        for (Account account : accounts) {
            System.out.println(account.userName);
        }
        System.out.println("Nhap username muon them group");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.next();
        for (Group group : groups) {
            System.out.println(group.groupName);
        }
        System.out.println("Nhap group muon duoc them");
        String groupname = scanner.next();
        Account tempa = new Account();
        for (Account account : accounts) {
            if (account.userName.equals(username))
                tempa = account;
        }
        Group tempg = new Group();
        for (Group group : groups) {
            if (group.groupName.equals(groupname))
                tempg = group;
        }
        Group[] groups1 = new Group[tempa.groups.length + 1];
        for (int i = 0; i < tempa.groups.length; i++) {
            groups1[i] = tempa.groups[i];
        }
        groups1[tempa.groups.length + 1] = tempg;

        tempa.groups = groups1;
    }
}
