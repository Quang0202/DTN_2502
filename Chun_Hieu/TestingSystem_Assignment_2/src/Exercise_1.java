public class Exercise_1 {
    public static void main(String[] args) {
        Account account1 = new Account();
        Account account2 = new Account();
        Account[] accounts = {account1, account2};
        account1.department = "IT";
        account2.department = null;
        account1.id = 1;
        account2.id = 2;
        account1.groups = new String[]{"Java Fresher", "C# Fresher"};
        account2.groups = new String[]{"Java Fresher", "C# Fresher", "Python Fresher"};
        account1.position = "Dev";
        account2.position = null;

        // IF
        // Question 1
        if(account2.department == null){
            System.out.println("Nhân viên này chưa có phòng ban");
        } else {
            System.out.println("Phòng ban của nhân viên này là " + account2.department);
        }
        //Question 2
        if(account2.groups == null || account2.groups.length == 0){
            System.out.println("Nhân viên này chưa có group");
        }
        else if(account2.groups.length == 1 || account2.groups.length == 2){
            System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
        } else if (account2.groups.length == 3) {
           System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
        } else {
            System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
        }
        // Question 3
        System.out.println(account2.department == null ? "Nhân viên này chưa có phòng ban" : "Phòng ban của nhân viên này là ...");

        // Question 4
        System.out.println(account1.position == "Dev" ? "Đây là Developer" : "Người này không phải là Developer");

        // Swich case
        // Question 5
        int Slnhom1 = 2;
        switch(Slnhom1) {
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

        // Question 6
        int Slgroupaccount2 = account2.groups.length;

        switch(Slgroupaccount2) {
            case 0:
                System.out.println("Nhân viên này chưa có group");
                break;
            case 1:
            case 2:
                System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
                break;
            case 3:
                System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
                break;
            default:
                System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
        }

        // Question 7
        String kta = account1.position;
        switch(kta) {
            case "Dev":
                System.out.println("Đây là Developer");
                break;
            default:
                System.out.println("Người này không phải là Developer");
        }

        // Foreach
        // Question 8
        account1.email = "Nguyenvana@gmail.com";
        account2.email = "Nguyenvanb@gmail.com";
        account1.fullName = "Nguyenvana";
        account2.fullName = "Nguyenvanb";

        System.out.println(account1.email + " " + account1.fullName+ " " + account1.department);
        System.out.println(account2.email + " " + account2.fullName+ " " + account2.department);

        // Question 2
        Department department1 = new Department();
        Department department2 = new Department();
        department1.id = 1;
        department2.id = 2;
        Department[] departments = {department1, department2};

        System.out.println(department1.id + " " + account1.department);
        System.out.println(department2.id + " " + account2.department);

        // Question 10
//        for (int i = 0; i <= accounts.length - 1; i++ ) {
//            System.out.println("Thong tin account " + i + " la:");
//            System.out.println(accounts[i].email);
//            System.out.println(accounts[i].fullName);
//            System.out.println(accounts[i].department);
//        }
//
//        // Question 11
//        for(int i = 0; i <= accounts.length - 1; i++ ) {
//            System.out.println("Thong tin department " + i + " la:");
//            System.out.println(departments[i].id);
//            System.out.println(accounts[i].department);
//        }
//
//        // Question 12
//        for (int i = 0; i <= accounts.length - 1; i++ ) {
//            if(i == 2){
//                break;
//            }
//            System.out.println("Thong tin account " + i + " la:");
//            System.out.println(accounts[i].email);
//            System.out.println(accounts[i].fullName);
//            System.out.println(accounts[i].department);
//        }
//        // Question 13
//        for (int i = 0; i <= accounts.length - 1; i++ ) {
//            if(i == 1){
//                continue;
//            }
//            System.out.println("Thong tin account " + i + " la:");
//            System.out.println(accounts[i].email);
//            System.out.println(accounts[i].fullName);
//            System.out.println(accounts[i].department);
//        }
//
//        // Question 14
//        for (int i = 0; i < 4; i++ ) {
//            System.out.println("Thong tin account " + i + " la:");
//            System.out.println(accounts[i].email);
//            System.out.println(accounts[i].fullName);
//            System.out.println(accounts[i].department);
//        }
//
//        // Question 15
//        for (int i = 0; i % 2 == 0 && i <= 20; i++ ) {
//            System.out.println("Thong tin account " + i + " la:");
//            System.out.println(accounts[i].email);
//            System.out.println(accounts[i].fullName);
//            System.out.println(accounts[i].department);
//        }
//
//        // While
//        // question 16
        int i =0;
//        while (i < accounts.length){
//            System.out.println("Thong tin account " + i + " la:");
//            System.out.println(accounts[i].email);
//            System.out.println(accounts[i].fullName);
//            System.out.println(accounts[i].department);
//            i++;
//        }

//        while (i < accounts.length){
//            if(i == 2){
//                break;
//            }
//            System.out.println("Thong tin account " + i + " la:");
//            System.out.println(accounts[i].email);
//            System.out.println(accounts[i].fullName);
//            System.out.println(accounts[i].department);
//            i++;
//        }
//        while (i < accounts.length){
//            if(i == 1){
//                continue;
//            }
//            System.out.println("Thong tin account " + i + " la:");
//            System.out.println(accounts[i].email);
//            System.out.println(accounts[i].fullName);
//            System.out.println(accounts[i].department);
//            i++;
//        }
//        while (i < 4){
//            System.out.println("Thong tin account " + i + " la:");
//            System.out.println(accounts[i].email);
//            System.out.println(accounts[i].fullName);
//            System.out.println(accounts[i].department);
//            i++;
//        }

        // do while
//        do{
//            System.out.println("Thong tin account " + i + " la:");
//            System.out.println(accounts[i].email);
//            System.out.println(accounts[i].fullName);
//            System.out.println(accounts[i].department);
//        } while (i == 0);

        for(Account k : accounts){
            System.out.println("Thong tin account " + k.id + " la:");
            System.out.println(k.email);
            System.out.println(k.fullName);
            System.out.println(k.department);
        }




    }
}

