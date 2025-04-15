import java.time.LocalDate;

public class Exercise1 {
    public void question1() {
        Department d1 = new Department();
        Department d2 = new Department("HR");
        System.out.println(d1);
        System.out.println(d2);
    }

    public void question2() {
        Account a1 = new Account();
        Account a2 = new Account(1, "a@gmail.com", "acc1", "John", "Doe");
        Account a3 = new Account(2, "b@gmail.com", "acc2", "Jane", "Smith", new Position("Dev"));
        Account a4 = new Account(3, "c@gmail.com", "acc3", "Alice", "Lee", new Position("Test"), LocalDate.of(2024, 12, 25));
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
    }

    public void question3() {
        Group g1 = new Group();
        Group g2 = new Group("Java Group", "Admin", new Account[]{new Account("user1"), new Account("user2")}, LocalDate.now());
        Group g3 = new Group("Python Group", "Admin", new String[]{"acc1", "acc2"}, LocalDate.now());
        System.out.println(g1);
        System.out.println(g2);
        System.out.println(g3);
    }
}