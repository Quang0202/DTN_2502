package frontend;

import backend.LotterySystem;
import utils.ScannerUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LotteryProgram {
    private static LotterySystem lotterySystem;

    public static void main(String[] args) {
        lotterySystem = new LotterySystem();

        boolean exit = false;
        while (!exit) {
            printMainMenu();
            int choice = ScannerUtils.inputInt("Invalid choice. Please enter a number.");

            switch (choice) {
                case 1:
                    registerAccount();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    if (lotterySystem.isLoggedIn()) {
                        logout();
                    } else {
                        System.out.println("You are not logged in!");
                    }
                    break;
                case 4:
                    if (lotterySystem.isLoggedIn()) {
                        deposit();
                    } else {
                        System.out.println("Please login first!");
                    }
                    break;
                case 5:
                    if (lotterySystem.isLoggedIn()) {
                        placeBet();
                    } else {
                        System.out.println("Please login first!");
                    }
                    break;
                case 6:
                    if (lotterySystem.isLoggedIn() && lotterySystem.getCurrentUser().getType().toString().equals("ADMIN")) {
                        generateLotteryResult();
                    } else {
                        System.out.println("Only admin can generate lottery results!");
                    }
                    break;
                case 7:
                    if (lotterySystem.isLoggedIn()) {
                        viewLotteryResults();
                    } else {
                        System.out.println("Please login first!");
                    }
                    break;
                case 8:
                    if (lotterySystem.isLoggedIn()) {
                        viewBetHistory();
                    } else {
                        System.out.println("Please login first!");
                    }
                    break;
                case 9:
                    if (lotterySystem.isLoggedIn() && lotterySystem.getCurrentUser().getType().toString().equals("ADMIN")) {
                        viewAllAccounts();
                    } else {
                        System.out.println("Only admin can view all accounts!");
                    }
                    break;
                case 0:
                    System.out.println("Thank you for using the Lottery System. Goodbye!");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void printMainMenu() {
        System.out.println("\n====== LOTTERY SYSTEM ======");
        System.out.println("1. Register Account");
        System.out.println("2. Login");
        System.out.println("3. Logout");
        System.out.println("4. Deposit Money");
        System.out.println("5. Place a Bet");
        System.out.println("6. Generate Lottery Result (Admin only)");
        System.out.println("7. View Lottery Results");
        System.out.println("8. View Bet History");
        System.out.println("9. View All Accounts (Admin only)");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void registerAccount() {
        System.out.println("\n--- Register Account ---");

        System.out.print("Username: ");
        String username = ScannerUtils.inputString();

        System.out.print("Password: ");
        String password = ScannerUtils.inputString();

        System.out.print("Full Name: ");
        String fullName = ScannerUtils.inputString();

        System.out.print("Email: ");
        String email = ScannerUtils.inputString();

        boolean isAdmin = false;
        if (lotterySystem.isLoggedIn() &&
                lotterySystem.getCurrentUser().getType().toString().equals("ADMIN")) {
            System.out.print("Is this an admin account? (Y/N): ");
            String adminChoice = ScannerUtils.inputString();
            isAdmin = adminChoice.equalsIgnoreCase("Y");
        }

        try {
            lotterySystem.registerAccount(username, password, fullName, email, isAdmin);
        } catch (Exception e) {
            System.out.println("Registration failed: " + e.getMessage());
        }
    }

    private static void login() {
        if (lotterySystem.isLoggedIn()) {
            System.out.println("You are already logged in. Please logout first.");
            return;
        }

        System.out.println("\n--- Login ---");

        System.out.print("Username: ");
        String username = ScannerUtils.inputString();

        System.out.print("Password: ");
        String password = ScannerUtils.inputString();

        lotterySystem.login(username, password);
    }

    private static void logout() {
        lotterySystem.logout();
    }

    private static void deposit() {
        System.out.println("\n--- Deposit Money ---");

        System.out.print("Enter amount to deposit: ");
        double amount = ScannerUtils.inputDouble("Invalid amount. Please enter a valid number.");

        lotterySystem.deposit(amount);
    }

    private static void placeBet() {
        System.out.println("\n--- Place a Bet ---");

        System.out.print("Enter number (0-99): ");
        int number = ScannerUtils.inputInt("Invalid number. Please enter a number between 0 and 99.");

        System.out.print("Enter bet amount: ");
        double amount = ScannerUtils.inputDouble("Invalid amount. Please enter a valid number.");

        lotterySystem.placeBet(number, amount);
    }

    private static void generateLotteryResult() {
        System.out.println("\n--- Generate Lottery Result ---");
        lotterySystem.generateLotteryResult();
    }

    private static void viewLotteryResults() {
        System.out.println("\n--- View Lottery Results ---");

        System.out.print("Do you want to filter by date range? (Y/N): ");
        String filterChoice = ScannerUtils.inputString();

        Date fromDate = null;
        Date toDate = null;

        if (filterChoice.equalsIgnoreCase("Y")) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

            System.out.print("From date (dd/MM/yyyy): ");
            String fromDateStr = ScannerUtils.inputString();
            try {
                fromDate = dateFormat.parse(fromDateStr);
            } catch (ParseException e) {
                System.out.println("Invalid date format. Using no start date filter.");
            }

            System.out.print("To date (dd/MM/yyyy): ");
            String toDateStr = ScannerUtils.inputString();
            try {
                toDate = dateFormat.parse(toDateStr);
            } catch (ParseException e) {
                System.out.println("Invalid date format. Using no end date filter.");
            }
        }

        lotterySystem.viewLotteryResults(fromDate, toDate);
    }

    private static void viewBetHistory() {
        System.out.println("\n--- View Bet History ---");
        lotterySystem.viewBetHistory();
    }

    private static void viewAllAccounts() {
        lotterySystem.viewAllAccounts();
    }
}
