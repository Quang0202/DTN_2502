package frontend.Exception;

import entity.Account;
import entity.InvalidAgeInputingException;

public class Question11 {
    public static void main(String[] args) {
        try {
            int age = Account.inputAge();
            System.out.println("Tuổi bạn vừa nhập là: " + age);
        } catch (InvalidAgeInputingException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

}
