package Exercise2;

public class Account {
    private int id;
    private String email;
    private String username;
    private String fullName;
    private int age;

    public Account() {
        System.out.println("Please input account ID:");
        this.id = ScannerUtils.inputInt("Please input a valid account ID as an integer!");

        System.out.println("Please input email:");
        this.email = ScannerUtils.inputString();

        System.out.println("Please input username:");
        this.username = ScannerUtils.inputString();

        System.out.println("Please input full name:");
        this.fullName = ScannerUtils.inputString();

        System.out.println("Please input age:");
        this.age = ScannerUtils.inputInt("Please input a valid age as an integer!");
    }

    @Override
    public String toString() {
        return "Account{id=" + id + ", email='" + email + "', username='" + username + "', fullName='" + fullName + "', age=" + age + "}";
    }
}
