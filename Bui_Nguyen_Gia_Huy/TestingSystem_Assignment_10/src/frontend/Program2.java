package frontend;

import backend.Exercise2;
import entity.Department;
import entity.Account;
import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        try {
            Exercise2 exercise2 = new Exercise2();
            Scanner scanner = new Scanner(System.in);
            int choice;

            do {
                System.out.println("\n--- EXERCISE 2 MENU ---");
                System.out.println("1. Get all departments");
                System.out.println("2. Get department by ID 5");
                System.out.println("3. Get department by ID (user input)");
                System.out.println("4. Check if department name exists");
                System.out.println("5. Create new department");
                System.out.println("6. Update department name");
                System.out.println("7. Delete department");
                System.out.println("8. Get all accounts");
                System.out.println("9. Get account by ID");
                System.out.println("10. Create new account");
                System.out.println("11. Update account username");
                System.out.println("12. Delete account");
                System.out.println("0. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        // Get all departments
                        List<Department> departments = exercise2.getDepartmentDao().getDepartments();
                        System.out.println("\n--- All Departments ---");
                        for (Department dept : departments) {
                            System.out.println(dept);
                        }
                        break;

                    case 2:
                        // Get department with ID 5
                        try {
                            Department dept5 = exercise2.getDepartmentDao().getDepartmentById(5);
                            System.out.println("\n--- Department with ID 5 ---");
                            System.out.println(dept5);
                        } catch (Exception e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;

                    case 3:
                        // Get department by ID (user input)
                        System.out.print("Enter department ID: ");
                        int deptId = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        try {
                            Department dept = exercise2.getDepartmentDao().getDepartmentById(deptId);
                            System.out.println("\n--- Department with ID " + deptId + " ---");
                            System.out.println(dept);
                        } catch (Exception e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;

                    case 4:
                        // Check if department name exists
                        System.out.print("Enter department name to check: ");
                        String deptName = scanner.nextLine();
                        try {
                            boolean exists = exercise2.getDepartmentDao().isDepartmentNameExists(deptName);
                            System.out.println("Department name '" + deptName + "' exists: " + exists);
                        } catch (Exception e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;

                    case 5:
                        // Create new department
                        System.out.print("Enter new department name: ");
                        String newDeptName = scanner.nextLine();
                        try {
                            exercise2.getDepartmentDao().createDepartment(newDeptName);
                            System.out.println("Department created successfully!");
                        } catch (Exception e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;

                    case 6:
                        // Update department name
                        System.out.print("Enter department ID to update: ");
                        int updateDeptId = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        System.out.print("Enter new department name: ");
                        String updateDeptName = scanner.nextLine();
                        try {
                            exercise2.getDepartmentDao().updateDepartmentName(updateDeptId, updateDeptName);
                            System.out.println("Department updated successfully!");
                        } catch (Exception e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;

                    case 7:
                        // Delete department
                        System.out.print("Enter department ID to delete: ");
                        int deleteDeptId = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        try {
                            exercise2.getDepartmentDao().deleteDepartment(deleteDeptId);
                            System.out.println("Department deleted successfully!");
                        } catch (Exception e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;

                    case 8:
                        // Get all accounts
                        List<Account> accounts = exercise2.getAccountDao().getAccounts();
                        System.out.println("\n--- All Accounts ---");
                        for (Account acc : accounts) {
                            System.out.println(acc);
                        }
                        break;

                    case 9:
                        // Get account by ID
                        System.out.print("Enter account ID: ");
                        int accId = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        try {
                            Account acc = exercise2.getAccountDao().getAccountById(accId);
                            System.out.println("\n--- Account with ID " + accId + " ---");
                            System.out.println(acc);
                        } catch (Exception e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;

                    case 10:
                        // Create new account
                        System.out.print("Enter email: ");
                        String email = scanner.nextLine();
                        System.out.print("Enter username: ");
                        String username = scanner.nextLine();
                        System.out.print("Enter full name: ");
                        String fullName = scanner.nextLine();
                        System.out.print("Enter department ID: ");
                        int departmentId = scanner.nextInt();
                        System.out.print("Enter position ID: ");
                        int positionId = scanner.nextInt();
                        scanner.nextLine(); // Consume newline

                        try {
                            exercise2.getAccountDao().createAccount(email, username, fullName, departmentId, positionId);
                            System.out.println("Account created successfully!");
                        } catch (Exception e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;

                    case 11:
                        // Update account username
                        System.out.print("Enter account ID to update: ");
                        int updateAccId = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        System.out.print("Enter new username: ");
                        String newUsername = scanner.nextLine();

                        try {
                            exercise2.getAccountDao().updateAccountUsername(updateAccId, newUsername);
                            System.out.println("Account username updated successfully!");
                        } catch (Exception e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;

                    case 12:
                        // Delete account
                        System.out.print("Enter account ID to delete: ");
                        int deleteAccId = scanner.nextInt();
                        scanner.nextLine(); // Consume newline

                        try {
                            exercise2.getAccountDao().deleteAccount(deleteAccId);
                            System.out.println("Account deleted successfully!");
                        } catch (Exception e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;

                    case 0:
                        System.out.println("Exiting Program2...");
                        break;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }

            } while (choice != 0);

            scanner.close();

        } catch (Exception e) {
            System.out.println("Error initializing Program2: " + e.getMessage());
        }
    }
}