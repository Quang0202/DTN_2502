import java.util.List;
import java.util.Scanner;

public class Ex_6 {
    public static void inAccount(List<Account> accounts) {
        if(accounts.isEmpty()){
            System.out.println("Không có tài khoản nào");
            return;
        }
        System.out.println("Danh sách tài khoản: ");
        for(Account a : accounts){
            System.out.println(a);
        }
    }
    public static void main(String[] args) {

        // Question 1
        Scanner sc = new Scanner(System.in);
        System.out.println("Các số nguyên dương nhỏ hơn 10: ");
        for (int i = 2; i < 10; i+=2) {
            System.out.println(i);
        }
        // Question 2

    }
}
