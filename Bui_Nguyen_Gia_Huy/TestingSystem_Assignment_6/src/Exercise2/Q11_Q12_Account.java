package Exercise2;

public class Q11_Q12_Account {
    private int id;
    private String email;
    private String username;
    private String fullName;
    private int age;

    public Q11_Q12_Account() {
        System.out.println("Please input account ID:");
        this.id = ScannerUtils.inputInt("Please input a valid account ID as an integer!");

        System.out.println("Please input email:");
        this.email = ScannerUtils.inputString();

        System.out.println("Please input username:");
        this.username = ScannerUtils.inputString();

        System.out.println("Please input full name:");
        this.fullName = ScannerUtils.inputString();

        this.age = inputAccountAge();
    }

    public static int inputAge() throws InvalidAgeInputingException {
        int age = ScannerUtils.inputInt("Please input a valid age as an integer!");
        if (age <= 0) {
            throw new InvalidAgeInputingException("The age must be greater than 0");
        }
        return age;
    }

    public int inputAccountAge() {
        while (true) {
            try {
                System.out.println("Please input age:");
                int age = inputAge();
                if (age < 18) {
                    System.out.println("Your age must be greater than 18");
                    continue;
                }
                return age;
            } catch (InvalidAgeInputingException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public String toString() {
        return "Account{id=" + id + ", email='" + email + "', username='" + username + "', fullName='" + fullName + "', age=" + age + "}";
    }
}
