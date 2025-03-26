public class Exercise1 {

    // Question 1
    public void question1(Account account) {
        if (account.getDepartment() == null) {
            System.out.println("Nhân viên này chưa có phòng ban");
        } else {
            System.out.println("Phòng ban của nhân viên này là " + account.getDepartment().departmentName);
        }
    }

    // Question 2
    public void question2(Account account) {
        if (account.getGroups() == null || account.getGroups().length == 0) {
            System.out.println("Nhân viên này chưa có group");
        } else if (account.getGroups().length == 1 || account.getGroups().length == 2) {
            System.out.print("Group của nhân viên này là: ");
            for (Group g : account.getGroups()) {
                System.out.print(g.groupName + " ");
            }
            System.out.println();
        } else if (account.getGroups().length == 3) {
            System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
        } else {
            System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
        }
    }

    // Question 3
    public void question3(Account account) {
        String result = (account.getDepartment() == null) ? "Nhân viên này chưa có phòng ban" :
                "Phòng ban của nhân viên này là " + account.getDepartment().departmentName;
        System.out.println(result);
    }

    // Question 4
    public void question4(Account account) {
        String result = (account.getPosition().positionName.equals("Dev")) ? "Đây là Developer" :
                "Người này không phải là Developer";
        System.out.println(result);
    }

    // Question 5: Switch case - number of accounts in group 1
    public static void question5(Group group) {
        int accountCount = group.getAccounts().length;
        switch (accountCount) {
            case 1:
                System.out.println("Nhóm có một thành viên");
                break;
            case 2:
                System.out.println("Nhóm có hai thành viên");
                break;
            case 3:
                System.out.println("Nhóm có ba thành viên");
                break;
            default:
                System.out.println("Nhóm có nhiều thành viên");
        }
    }

    // Question 6
    public static void question6(Account account) {
        int groupCount = account.getGroups().length;
        switch (groupCount) {
            case 0:
                System.out.println("Nhân viên này chưa có group");
                break;
            case 1:
            case 2:
                System.out.println("Group của nhân viên này là:");
                for (Group g : account.getGroups()) {
                    System.out.println(g.groupName);
                }
                break;
            case 3:
                System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
                break;
            default:
                System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
        }
    }

    // Question 7
    public static void question7(Account account) {
        switch (account.getPosition().positionName) {
            case "Dev":
                System.out.println("Đây là Developer");
                break;
            default:
                System.out.println("Người này không phải là Developer");
        }
    }

    // Question 8
    public static void question8(Account[] accounts) {
        for (Account acc : accounts) {
            System.out.println("Email: " + acc.getEmail());
            System.out.println("Full name: " + acc.getFullName());
            System.out.println("Phòng ban: " + acc.getDepartment().departmentName);
            System.out.println("--------------------");
        }
    }

    // Question 9
    public static void question9(Department[] departments) {
        for (Department dep : departments) {
            System.out.println("Id: " + dep.getId() + ", Name: " + dep.departmentName);
        }
    }

    // Question 10
    public static void question10(Account[] accounts) {
        for (int i = 0; i < accounts.length; i++) {
            System.out.println("Thông tin account thứ " + (i + 1) + " là:");
            System.out.println("Email: " + accounts[i].getEmail());
            System.out.println("Full name: " + accounts[i].getFullName());
            System.out.println("Phòng ban: " + accounts[i].getDepartment().departmentName);
            System.out.println("--------------------");
        }
    }

    // Question 11
    public static void question11(Department[] departments) {
        for (int i = 0; i < departments.length; i++) {
            System.out.println("Thông tin department thứ " + (i + 1) + " là:");
            System.out.println("Id: " + departments[i].getId());
            System.out.println("Name: " + departments[i].departmentName);
        }
    }

    // Question 12
    public static void question12(Department[] departments) {
        for (int i = 0; i < 2 && i < departments.length; i++) {
            System.out.println("Thông tin department thứ " + (i + 1) + " là:");
            System.out.println("Id: " + departments[i].getId());
            System.out.println("Name: " + departments[i].departmentName);
        }
    }

    // Question 13
    public static void question13(Account[] accounts) {
        for (int i = 0; i < accounts.length; i++) {
            if (i == 1) continue;
            System.out.println("Account: " + accounts[i].getFullName());
        }
    }

    // Question 14
    public static void question14(Account[] accounts) {
        for (Account acc : accounts) {
            if (acc.getId() < 4) {
                System.out.println("Account: " + acc.getFullName());
            }
        }
    }

    // Question 15:
    public static void question15() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
    }

    // Question 16
    public static void question16(Account[] accounts, Department[] departments) {
        int i = 0;
        while (i < accounts.length) {
            System.out.println("Account: " + accounts[i].getFullName());
            i++;
        }

        i = 0;
        while (i < departments.length) {
            System.out.println("Department: " + departments[i].departmentName);
            if (i == 1) break; // Print first 2 only
            i++;
        }
    }

    // Question 17
    public static void question17(Account[] accounts, Department[] departments) {
        int i = 0;
        do {
            if (i == 1) {
                i++;
                continue;
            }
            System.out.println("Account: " + accounts[i].getFullName());
            i++;
        } while (i < accounts.length);

        i = 0;
        do {
            System.out.println("Department: " + departments[i].departmentName);
            i++;
        } while (i < 2);
    }
}
