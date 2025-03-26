public class Exercise6 {
    // Question 1,
    public void question1() {
        System.out.println("Even positive numbers less than 10:");
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // New line after printing numbers
    }

    // Question 2
    public void question2(Account[] accounts) {
        System.out.println("Account information:");
        for (Account acc : accounts) {
            System.out.println("ID: " + acc.getId());
            System.out.println("Email: " + acc.getEmail());
            System.out.println("Username: " + acc.getUserName());
            System.out.println("Full Name: " + acc.getFullName());
            System.out.println("Department: " + acc.getDepartment().getDepartmentName());
            System.out.println("Position: " + acc.getPosition().getPositionName());
            System.out.println("Create Date: " + acc.getCreateDate());
            System.out.println("-----------------------");
        }
    }

    // Question 3
    public void question3() {
        System.out.println("Positive numbers less than 10:");
        for (int i = 1; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // New line after printing numbers
    }
}
