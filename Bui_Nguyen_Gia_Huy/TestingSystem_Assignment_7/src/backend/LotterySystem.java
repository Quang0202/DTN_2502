package backend;

import entity.Account;
import entity.BetRecord;
import entity.LotteryResult;
import utils.IOManager;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class LotterySystem {
    private static final String DATA_PATH = "C:\\TestFile\\LotterySystem";
    private static final String ACCOUNTS_FILE = DATA_PATH + File.separator + "accounts.ser";
    private static final String LOTTERY_RESULTS_FILE = DATA_PATH + File.separator + "lottery_results.ser";
    private static final String BET_RECORDS_FILE = DATA_PATH + File.separator + "bet_records.ser";

    private List<Account> accounts;
    private List<LotteryResult> lotteryResults;
    private List<BetRecord> betRecords;
    private Account currentUser;
    private int nextAccountId = 1;
    private int nextBetId = 1;

    public LotterySystem() {
        // Initialize data directory
        initializeDataDirectory();

        // Load existing data if available
        loadData();
    }

    private void initializeDataDirectory() {
        File dataDir = new File(DATA_PATH);
        if (!dataDir.exists()) {
            dataDir.mkdirs();
        }
    }

    @SuppressWarnings("unchecked")
    private void loadData() {
        try {
            // Load accounts
            if (new File(ACCOUNTS_FILE).exists()) {
                accounts = (List<Account>) IOManager.readObject(ACCOUNTS_FILE);
                // Find the next account ID
                for (Account account : accounts) {
                    if (account.getId() >= nextAccountId) {
                        nextAccountId = account.getId() + 1;
                    }
                }
            } else {
                accounts = new ArrayList<>();
                // Create default admin account
                accounts.add(new Account(nextAccountId++, "admin", "admin123", "System Admin", "admin@lottery.com", Account.AccountType.ADMIN));
            }

            // Load lottery results
            if (new File(LOTTERY_RESULTS_FILE).exists()) {
                lotteryResults = (List<LotteryResult>) IOManager.readObject(LOTTERY_RESULTS_FILE);
            } else {
                lotteryResults = new ArrayList<>();
            }

            // Load bet records
            if (new File(BET_RECORDS_FILE).exists()) {
                betRecords = (List<BetRecord>) IOManager.readObject(BET_RECORDS_FILE);
                // Find the next bet ID
                for (BetRecord record : betRecords) {
                    if (record.getId() >= nextBetId) {
                        nextBetId = record.getId() + 1;
                    }
                }
            } else {
                betRecords = new ArrayList<>();
            }

        } catch (Exception e) {
            System.out.println("Error loading data: " + e.getMessage());
            e.printStackTrace();

            // Initialize with empty lists if loading fails
            accounts = new ArrayList<>();
            lotteryResults = new ArrayList<>();
            betRecords = new ArrayList<>();

            // Create default admin account
            accounts.add(new Account(nextAccountId++, "admin", "admin123", "System Admin", "admin@lottery.com", Account.AccountType.ADMIN));
        }
    }

    private void saveData() {
        try {
            IOManager.writeObject(accounts, DATA_PATH, "accounts.ser");
            IOManager.writeObject(lotteryResults, DATA_PATH, "lottery_results.ser");
            IOManager.writeObject(betRecords, DATA_PATH, "bet_records.ser");
        } catch (Exception e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    // a) Register account
    public void registerAccount(String username, String password, String fullName, String email, boolean isAdmin) throws Exception {
        // Check if username already exists
        for (Account account : accounts) {
            if (account.getUsername().equals(username)) {
                throw new Exception("Username already exists");
            }
        }

        // Create and add new account
        Account.AccountType type = isAdmin ? Account.AccountType.ADMIN : Account.AccountType.USER;
        Account newAccount = new Account(nextAccountId++, username, password, fullName, email, type);
        accounts.add(newAccount);

        // Save data
        saveData();

        System.out.println("Account registered successfully!");
    }

    // b) Login
    public boolean login(String username, String password) {
        for (Account account : accounts) {
            if (account.getUsername().equals(username) && account.getPassword().equals(password)) {
                currentUser = account;
                System.out.println("Login successful! Welcome, " + currentUser.getFullName());
                return true;
            }
        }
        System.out.println("Invalid username or password");
        return false;
    }

    // c) Logout
    public void logout() {
        if (currentUser != null) {
            System.out.println("Goodbye, " + currentUser.getFullName() + "!");
            currentUser = null;
        } else {
            System.out.println("No user is currently logged in");
        }
    }

    // d) Deposit money
    public void deposit(double amount) {
        if (currentUser == null) {
            System.out.println("Please login first");
            return;
        }

        if (amount <= 0) {
            System.out.println("Amount must be positive");
            return;
        }

        currentUser.deposit(amount);
        saveData();

        System.out.println("Deposit successful. New balance: " + currentUser.getBalance());
    }

    // e) Generate and save lottery result for today
    public void generateLotteryResult() {
        if (currentUser == null || currentUser.getType() != Account.AccountType.ADMIN) {
            System.out.println("Only admin can generate lottery results");
            return;
        }

        // Generate a random number between 0 and 99
        Random random = new Random();
        int winningNumber = random.nextInt(100);

        // Create new lottery result
        Date today = new Date();
        LotteryResult result = new LotteryResult(today, winningNumber);
        lotteryResults.add(result);

        // Process bets for today
        processBetsForDate(today, winningNumber);

        // Save data
        saveData();

        System.out.println("Lottery result for today: " + winningNumber);
    }

    // Process bets for a specific date
    private void processBetsForDate(Date date, int winningNumber) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String targetDate = sdf.format(date);

        for (BetRecord bet : betRecords) {
            String betDate = sdf.format(bet.getDate());
            if (betDate.equals(targetDate)) {
                if (bet.getNumber() == winningNumber) {
                    bet.setWin(true);
                    // Winner gets 80 times their bet
                    bet.getAccount().deposit(bet.getAmount() * 80);
                    System.out.println("User " + bet.getAccount().getUsername() + " won with number " + winningNumber + "!");
                }
            }
        }
    }

    // f) Place a bet
    public void placeBet(int number, double amount) {
        if (currentUser == null) {
            System.out.println("Please login first");
            return;
        }

        if (number < 0 || number > 99) {
            System.out.println("Number must be between 0 and 99");
            return;
        }

        if (amount <= 0) {
            System.out.println("Amount must be positive");
            return;
        }

        if (currentUser.getBalance() < amount) {
            System.out.println("Insufficient balance");
            return;
        }

        // Withdraw the bet amount
        if (!currentUser.withdraw(amount)) {
            System.out.println("Failed to place bet");
            return;
        }

        // Create new bet record
        BetRecord bet = new BetRecord(nextBetId++, currentUser, number, amount, new Date());
        betRecords.add(bet);

        // Save data
        saveData();

        System.out.println("Bet placed successfully. Remaining balance: " + currentUser.getBalance());
    }

    // g1) Admin views all accounts
    public void viewAllAccounts() {
        if (currentUser == null || currentUser.getType() != Account.AccountType.ADMIN) {
            System.out.println("Only admin can view all accounts");
            return;
        }

        System.out.println("\n--- All Accounts ---");
        System.out.println("+-------+-----------------+----------------------+---------------------------+------------+------------+");
        System.out.println("| ID    | Username        | Full Name            | Email                     | Type       | Balance    |");
        System.out.println("+-------+-----------------+----------------------+---------------------------+------------+------------+");

        for (Account account : accounts) {
            System.out.println(account.getDisplayInfo());
        }

        System.out.println("+-------+-----------------+----------------------+---------------------------+------------+------------+");
    }

    // g2) View lottery results by date range
    public void viewLotteryResults(Date fromDate, Date toDate) {
        if (currentUser == null) {
            System.out.println("Please login first");
            return;
        }

        System.out.println("\n--- Lottery Results ---");
        System.out.println("+--------------+---------------+");
        System.out.println("| Date         | Winning Number|");
        System.out.println("+--------------+---------------+");

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        for (LotteryResult result : lotteryResults) {
            Date resultDate = result.getDate();
            if ((fromDate == null || !resultDate.before(fromDate)) &&
                    (toDate == null || !resultDate.after(toDate))) {
                System.out.println(result);
            }
        }

        System.out.println("+--------------+---------------+");
    }

    // View user's bet history
    public void viewBetHistory() {
        if (currentUser == null) {
            System.out.println("Please login first");
            return;
        }

        System.out.println("\n--- Bet History ---");
        System.out.println("+-------+-----------------+----------+------------+--------------+----------+");
        System.out.println("| ID    | Username        | Number   | Amount     | Date         | Result   |");
        System.out.println("+-------+-----------------+----------+------------+--------------+----------+");

        for (BetRecord bet : betRecords) {
            if (bet.getAccount().getId() == currentUser.getId() || currentUser.getType() == Account.AccountType.ADMIN) {
                System.out.println(bet);
            }
        }

        System.out.println("+-------+-----------------+----------+------------+--------------+----------+");
    }

    // Check if user is logged in
    public boolean isLoggedIn() {
        return currentUser != null;
    }

    // Get current user
    public Account getCurrentUser() {
        return currentUser;
    }
}
