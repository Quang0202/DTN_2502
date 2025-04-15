package MaiTienThanh.src.com.vti.backend.Lesson4;

public class AccountL4 {
    private String id;
    private String name;
    private int balance;

    public AccountL4(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getBalance() {
        return balance;
    }
    public void credit(int amount) {
        balance += amount;
    }
    public void debit(int amount) {
        if(amount <= balance){
            balance -= amount;
        }else{
            System.out.println("Insufficient balance");
        }
    }
    public void transferTo(AccountL4 account, int amount) {
        if(amount <= balance){
            this.debit(amount);
            account.credit(amount);
        }else{
            System.out.println("Insufficient balance");
        }
    }

}
