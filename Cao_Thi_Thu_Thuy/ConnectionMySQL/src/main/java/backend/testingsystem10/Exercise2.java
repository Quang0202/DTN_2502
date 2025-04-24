package backend.testingsystem10;

import entity.Account;
import repositories.AccountRepository;
import repositories.DepartmentRepository;

import java.util.List;
import java.util.Scanner;

public class Exercise2 {
    public AccountRepository accountRepository = new AccountRepository();
    public DepartmentRepository departmentRepository = new DepartmentRepository();
    public void q1(){
        List<Account> accounts = accountRepository.getAccounts();
        for (Account a : accounts){
            System.out.println(a);
        }
    }
    public void q2(){
        Account account = accountRepository.getAccountByID(5);
        if (account != null){
            System.out.println(account);
        }
        else {
            System.out.println("Cannot find account which has id = 5");
        }
    }
    public void q3(){
        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("Nhập account id cần tìm: ");
            int id = scanner.nextInt();
            Account account = accountRepository.getAccountByID(id);
            if (account != null){
                System.out.println(account);
            }
            else {
                System.out.println("Cannot find account which has id = " + id);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public void q4(){
        System.out.println(accountRepository.isUsernameExists("quanganh"));
    }
    public void q5(){
        accountRepository.createAccount();
    }
    public void q6(){
        accountRepository.updateUsername();
    }
    public void q7(){
        accountRepository.deleteAccountById();
    }
}
