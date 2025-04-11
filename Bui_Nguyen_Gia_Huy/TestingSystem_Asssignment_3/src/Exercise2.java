import java.time.LocalDate;

public class Exercise2 {
    public void question1() {
        Account[] accounts = new Account[5];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account("Email " + (i + 1), "User name " + (i + 1), "Full name " + (i + 1), LocalDate.now());
        }

        for (Account acc : accounts) {
            System.out.println(acc);
        }
    }
}
