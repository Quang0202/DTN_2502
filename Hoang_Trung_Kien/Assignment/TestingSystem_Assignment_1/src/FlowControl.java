public class FlowControl {
    //If
    public String ques1(Account account) {
        if (account.department == null) {
            return "Nhân viên này chưa có phòng ban";
        }
        else return "Phòng ban của nhân viên này là " + account.department.departmentName;
    }

    public String ques2(Account account) {
        if (account.groups == null)
            return "Nhân viên này chưa có group";
        else if (account.groups.length == 1)
            return "Group của nhân viên này là " + account.groups[0].groupName;
        else if (account.groups.length == 2)
            return "Group của nhân viên này là " + account.groups[0].groupName + ", " + account.groups[1].groupName;
        else if (account.groups.length == 3)
            return  "Nhân viên này là người quan trọng, tham gia nhiều group";
        else
            return "Nhân viên này là người hóng chuyện, tham gia tất cả các group";
    }

    public String ques3(Account account) {
        return account.department == null ? "Nhân viên này chưa có phòng ban" : "Phòng ban của nhân viên này là " + account.department.departmentName;
    }

    public String ques4(Account account) {
        return account.position.positionName.equals("Dev") ? "Đây là Developer" : "Người này không phải là Developer";
    }

    //Switch case
    public String ques5(Group group) {
        switch (group.accounts.length) {
            case 1:
                return "Nhóm có một thành viên";
            case 2:
                return "Nhóm có hai thành viên";
            case 3:
                return "Nhóm có ba thành viên";
            default:
                return "Nhóm có nhiều thành viên";
        }
    }

    public String ques6(Account account) {
        if (account.groups == null)
            return "Nhân viên này chưa có group";
        switch (account.groups.length) {
            case 1:
                return "Group của nhân viên này là " + account.groups[0].groupName;
            case 2:
                return "Group của nhân viên này là " + account.groups[0].groupName + " " + account.groups[1].groupName;
            case 3:
                return "Nhân viên này là người quan trọng, tham gia nhiều group";
            default:
                return "Nhân viên này là người hóng chuyện, tham gia tất cả các group";
        }
    }

    public String ques7(Account account) {
        switch (account.position.positionName) {
            case "Dev":
                return "Đây là Developer";
            default:
                return "Người này không phải là Developer";
        }
    }

    public void ques8(Account[] account) {
        for (Account acc : account)
            System.out.println(acc.email + " " + acc.fullName + " " + acc.department.departmentName);
    }

    public void ques9(Department[] department) {
        for (Department dpm : department)
            System.out.println(dpm);
    }

    public void ques10(Account[] accounts) {
        for (int i = 0; i < accounts.length; i++) {
            int k = i+1;
            System.out.println("Thông tin account thứ " + k + " là:");
            System.out.println("Email: " + accounts[i].email);
            System.out.println("Full name: " + accounts[i].fullName);
            System.out.println("Phòng ban:" + accounts[i].department.departmentName);
        }
    }

    public void ques11(Department[] department) {
        for (int i = 0; i < department.length; i++) {
            int k = i +1;
            System.out.println("Thông tin department thứ " + k + " là:");
            System.out.println("ID: " + department[i].departmentId);
            System.out.println("Name: " + department[i].departmentName);
        }
    }

    public void ques12(Department[] department) {
        for (int i = 0; i < department.length; i++) {
            if (i>=2) break;
            int k = i +1;
            System.out.println("Thông tin department thứ " + k + " là:");
            System.out.println("ID: " + department[i].departmentId);
            System.out.println("Name: " + department[i].departmentName);
        }
    }

    public void ques13(Account[] accounts) {
        for (int i = 0; i < accounts.length; i++) {
            int k = i+1;
            if (i == 1) continue;
            System.out.println("Thông tin account thứ " + k + " là:");
            System.out.println("Email: " + accounts[i].email);
            System.out.println("Full name: " + accounts[i].fullName);
            System.out.println("Phòng ban:" + accounts[i].department.departmentName);
        }
    }

    public void ques14(Account[] accounts) {
        for (int i = 0; i < accounts.length; i++) {
            int k = i+1;
            if (accounts[i].accountId >= 4) continue;
            System.out.println("Thông tin account thứ " + k + " là:");
            System.out.println("Email: " + accounts[i].email);
            System.out.println("Full name: " + accounts[i].fullName);
            System.out.println("Phòng ban:" + accounts[i].department.departmentName);
        }
    }

    public void ques15() {
        for(int i = 0; i <= 20; i++)
            if (i % 2 == 0)
                System.out.println(i);
    }

    public void ques16(Account[] accounts) {
        int i = 0;
        while (i < accounts.length) {
            int k = i+1;
            if (accounts[i].accountId >= 4) {
                i++;
                continue;
            }
            System.out.println("Thông tin account thứ " + k + " là:");
            System.out.println("Email: " + accounts[i].email);
            System.out.println("Full name: " + accounts[i].fullName);
            System.out.println("Phòng ban:" + accounts[i].department.departmentName);
            i++;
        }
    }

    public void ques17(Account[] accounts) {
        int i = 0;
        do {
            int k = i+1;
            if (accounts[i].accountId >= 4) {
                i++;
                continue;
            }
            System.out.println("Thông tin account thứ " + k + " là:");
            System.out.println("Email: " + accounts[i].email);
            System.out.println("Full name: " + accounts[i].fullName);
            System.out.println("Phòng ban:" + accounts[i].department.departmentName);
            i++;
        } while (i < accounts.length);
    }
}
