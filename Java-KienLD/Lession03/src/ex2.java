import java.time.LocalDateTime;

public class ex2 {
    public static void main(String[] args) {
        class Account {
            int accountid;
            String Username;
            String Fullname;
            LocalDateTime CreateDateTime;
            @Override
            public String toString() {
                return "Account{" +
                        "accountid=" + accountid +
                        ", Username='" + Username + '\'' +
                        ", Fullname='" + Fullname + '\'' +
                        ", CreateDateTime=" + CreateDateTime +
                        '}';
            }
        }

        Account[] accounts = new Account[5];
        for( int i =0; i < accounts.length; i++ ) {
            accounts[i] = new Account();
            accounts[i].accountid = i;
            accounts[i].Username = "username"+i;
            accounts[i].Fullname = "Fullname"+i;
            accounts[i].CreateDateTime = LocalDateTime.now();
        }

        for ( Account account : accounts ) {
            System.out.println(account.accountid);
            System.out.println(account.Username);
            System.out.println(account.Fullname);
            System.out.println(account.CreateDateTime);
        }
    }
}
