import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class Main {
    public static void goToSchool(int a, int b){
        System.out.println(a + " "+ b);
    }
    public static void main(String[] args) {
        byte a;
        a = 12;
        float b = 12.3f;
        double c = 12.3456789;
        System.out.println(a);
        System.out.println(b);
        char ch = 97;
        String str = "Hello World";
        System.out.println(ch);
        System.out.println(str);
        boolean flag = false;
        System.out.println(flag);
        Date date = new Date();
        System.out.println(date);
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        Gender gender = Gender.MALE;
        System.out.println(gender);
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr[1]);
        System.out.println(arr.length);

        arr[1] = 10;
        String[] strArr = {"a", "b", "c"};
        LocalDate[] localDateArr = {LocalDate.now(), LocalDate.now()};
        Cat cat1 = new Cat();
        cat1.mauLong = "Brown";
        cat1.gender = Gender.MALE;
        cat1.loai = "Bengal";
        cat1.soTai = 1;
        cat1.soTuoi = 1;
        cat1.keu();
        Cat cat2 = new Cat();
        cat2.mauLong = "Black";
        System.out.println(cat1.mauLong);
        System.out.println(cat2.mauLong);
        cat2.keu();
        goToSchool(1, 2);

        Department department1 = new Department();
        department1.departmentId = 1;
        department1.departmentName = "sale";

        Department department2 = new Department();
        department2.departmentId = 2;
        department2.departmentName = "marketing";

        System.out.println(department1.departmentId + " " + department1.departmentName);
        System.out.println(department2.departmentId + " " + department2.departmentName);

        Position position1 = new Position();
        Account account1 = new Account();
        account1.accountId = 1;
        account1.department = department1;
        account1.position = new Position();
        Account account2 = new Account();
        account2.accountId = 1;
        account2.department = department2;
        account2.position = new Position();

        Group group1 = new Group();
        group1.groupId = 1;
        group1.groupName = "group1";
        Group group2 = new Group();
        group2.groupId = 1;
        group2.groupName = "group2";

        Group[] groups1 = {group1, group2};
        account1.groups = groups1;

        Account[] accounts1 = {account1};
        group1.accounts = accounts1;

        System.out.println(account1.groups[1].groupName);

    }
}