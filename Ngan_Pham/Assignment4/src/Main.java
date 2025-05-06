import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Department department = new Department();
        Department department1 = new Department("Sale");
        System.out.println(department);
        System.out.println(department1);

        Account account1 = new Account();
        Account account2 = new Account(1,"ethan@gmail.com","Ethan Pham","Ethan","Pham");
        Account account3 = new Account(2,"orm@gmail.com","Orm Korn","Orm","Korn","Admin");
        Account account4 = new Account(3,"tho@gmail.com","Tho Huynh","Tho","Huynh", LocalDate.of(2025, 10,10),"Member");
        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3);
        System.out.println(account4);

        Account creator = new Account(4, "porche@gmail.com", "porche", "Por", "che");
        Account[] member = {
                new Account(5, "aston@gmail.com", "aston", "as", "ton"),
                new Account(6, "lexus@gmail.com", "lexus", "le", "xus")
        };
        String[] usernames = {"Chun", "Pes"};

        Group group1 = new Group();
        Group group2 = new Group("Group2",creator,member,LocalDate.of(2020,10,10));
        Group group3 = new Group("Group3",creator,usernames,LocalDate.of(2020,10,10));
        System.out.println(group1);
        System.out.println(group2);
        System.out.println(group3);
    }
}