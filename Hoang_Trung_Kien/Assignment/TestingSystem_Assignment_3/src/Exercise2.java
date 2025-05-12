import java.time.LocalDateTime;

public class Exercise2 {
    public void createAccount() {
        for (int i=1; i <= 5; i++) {
            Account account = new Account();
            account.email = "Email " + i;
            account.userName = "User name " + i;
            account.fullName = "Full name " + i;
            account.createDate = LocalDateTime.now();
            System.out.println(account);
        }
    }
}
