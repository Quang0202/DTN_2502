import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Exercise5 {

    private Scanner scanner = new Scanner(System.in);

    // Question 1: Prompt user to enter 3 integers
    public void question1() {
        System.out.println("Please enter three integers:");
        int[] integers = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Integer " + (i + 1) + ": ");
            while (!scanner.hasNextInt()) {
                System.out.print("That's not a valid integer. Please enter an integer: ");
                scanner.next();
            }
            integers[i] = scanner.nextInt();
        }
        System.out.println("You entered: " + integers[0] + ", " + integers[1] + ", " + integers[2]);
    }

    // Question 2: Prompt user to enter 2 floating-point numbers
    public void question2() {
        System.out.println("Please enter two floating-point numbers:");
        double[] floats = new double[2];
        for (int i = 0; i < 2; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            while (!scanner.hasNextDouble()) {
                System.out.print("That's not a valid number. Please enter a floating-point number: ");
                scanner.next(); // discard invalid input
            }
            floats[i] = scanner.nextDouble();
        }
        System.out.println("You entered: " + floats[0] + " and " + floats[1]);
    }

    // Question 3: Prompt user to enter their full name
    public void question3() {
        scanner.nextLine(); // consume the leftover newline
        System.out.print("Please enter your full name: ");
        String fullName = scanner.nextLine();
        System.out.println("Hello, " + fullName + "!");
    }

    // Question 4: Prompt user to enter their birthdate in the format dd/MM/yyyy
    public void question4() {
        System.out.print("Please enter your birthdate (dd/MM/yyyy): ");
        String dateInput = scanner.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            LocalDate birthdate = LocalDate.parse(dateInput, formatter);
            System.out.println("Your birthdate is: " + birthdate);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format. Please use dd/MM/yyyy.");
        }
    }

    // Question 5:
    public void question5(Position[] positions) {
        System.out.print("Enter Account ID: ");
        int accountId = scanner.nextInt();
        scanner.nextLine(); // consume the leftover newline
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter Username: ");
        String username = scanner.nextLine();
        System.out.print("Enter Full Name: ");
        String fullName = scanner.nextLine();
        System.out.println("Select Position (1: Dev, 2: Test, 3: Scrum Master, 4: PM): ");
        int positionChoice = scanner.nextInt();
        Position position = null;
        switch (positionChoice) {
            case 1:
                position = positions[0];
                break;
            case 2:
                position = positions[1];
                break;
            case 3:
                position = positions[2];
                break;
            case 4:
                position = positions[3];
                break;
            default:
                System.out.println("Invalid position selected.");
                return;
        }
        Department dummyDep = new Department(99, "Default Department");
        Account newAcc = new Account(accountId, email, username, fullName, dummyDep, position, LocalDate.now());
        System.out.println("Account created: " + newAcc);
    }

    // Question 6
    public void question6(List<Department> departments) {
        System.out.print("Enter Department ID: ");
        int departmentId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Department Name: ");
        String departmentName = scanner.nextLine();
        Department newDepartment = new Department(departmentId, departmentName);
        System.out.println("Department created: " + newDepartment);
    }

    // Question 7
    public void question7() {
        System.out.print("Please enter an even number: ");
        while (true) {
            while (!scanner.hasNextInt()) {
                System.out.print("That's not a valid number. Please enter an even number: ");
                scanner.next(); // discard invalid input
            }
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                System.out.println("Thank you! You entered the even number: " + number);
                break;
            } else {
                System.out.print("That's not an even number. Please enter an even number: ");
            }
        }
    }

    // Question 8
    public void question8(Position[] positions, List<Department> departments) {
        while (true) {
            System.out.println("Please choose an option:");
            System.out.println("1: Create Account");
            System.out.println("2: Create Department");
            System.out.print("Your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    question5(positions);
                    break;
                case 2:
                    question6(departments);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }
            scanner.nextLine(); // consume the leftover newline
            System.out.print("Do you want to perform another operation? (yes/no): ");
            String continueChoice = scanner.nextLine();
            if (!continueChoice.equalsIgnoreCase("yes")) {
                System.out.println("Exiting program.");
                break;
            }
        }
    }

    // Question 9
    public void question9(Account[] accounts, Group[] groups) {
        System.out.println("Available usernames:");
        for (Account acc : accounts) {
            System.out.println(acc.getUserName());
        }
        scanner.nextLine();
        System.out.print("Enter the username of the account to add to a group: ");
        String username = scanner.nextLine();
        Account selectedAccount = null;
        for (Account acc : accounts) {
            if (acc.getUserName().equals(username)) {
                selectedAccount = acc;
                break;
            }
        }
        if (selectedAccount == null) {
            System.out.println("Username not found.");
            return;
        }

        System.out.println("Available groups:");
        for (Group grp : groups) {
            System.out.println(grp.getGroupName());
        }
        System.out.print("Enter the name of the group to add the account to: ");
        String groupNameInput = scanner.nextLine();
        Group selectedGroup = null;
        for (Group group : groups) {
            if (group.getGroupName().equalsIgnoreCase(groupNameInput)) {
                selectedGroup = group;
                break;
            }
        }
        if (selectedGroup ==  null) {
            System.out.println("Group not found");
            return;
        }

        selectedGroup.addMember(selectedAccount);
        System.out.println("Account " + selectedAccount.getUserName() + " has been added to group " + selectedGroup.getGroupName());
    }

    public void question10(Account[] accounts, List<Department> departments, Position[] positions, Group[] groups) {
        boolean menuOptions = true;

        while (menuOptions) {
            // Display menu options
            System.out.println("Please choose an option:");
            System.out.println("1: Create Account");
            System.out.println("2: Create Department");
            System.out.println("3: Add Account to Group");
            System.out.print("Your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    question5(positions);
                    break;
                case 2:
                    question6(departments);
                    break;
                case 3:
                    question9(accounts, groups);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }

            // Ask if the user wants to perform another operation
            System.out.print("Do you want to perform another operation? (yes/no): ");
            String continueChoice = scanner.nextLine();
            if (!continueChoice.equalsIgnoreCase("yes")) {
                menuOptions = false;
                System.out.println("Exiting program.");
            }
        }
    }

    public void question11(Account[] accounts, Group[] groups) {
        Random random = new Random();

        System.out.println("List of usernames: ");
        for (Account account : accounts) {
            System.out.println("- " + account.getUserName());
        }

        System.out.print("Enter the username of the account to add to a random group: ");
        String usernameInput = scanner.nextLine();
        Account selectedAccount = null;
        for (Account account : accounts) {
            if (account.getUserName().equalsIgnoreCase(usernameInput)) {
                selectedAccount = account;
                break;
            }
        }
        if (selectedAccount == null) {
            System.out.println("Username not found");
            return;
        }

        int randomGroupIndex = random.nextInt(groups.length);
        Group randomGroup = groups[randomGroupIndex];

        randomGroup.addMember(selectedAccount);
        System.out.println("Account " + selectedAccount.getUserName() + " has been randomly added to group " + randomGroup.getGroupName());
    }
}
