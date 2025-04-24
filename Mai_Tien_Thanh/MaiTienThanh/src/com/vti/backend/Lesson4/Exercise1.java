package MaiTienThanh.src.com.vti.backend.Lesson4;

import MaiTienThanh.src.com.vti.entity.*;

import java.time.LocalDate;

public class Exercise1 {
    public void question1(){
        Department department2 = new Department();
        System.out.println("Câu b: " + department2.toString());
    }
    public void question2(){
        Account accountb = new Account(1, "b@gmail.com", "Accountb", "Mai","Thanh");
        Account accountc = new Account(2, "c@gmail.com", "Accountc", "Mai","Thanh", new Position(1, EPositionName.Dev));
        Account accountd = new Account(3, "d@gmail.com", "Accountd", "Mai", "Ha", new Position(2, EPositionName.Dev), LocalDate.of(1990, 1, 1));
        System.out.println(accountb.toString());
        System.out.println(accountc.toString());
        System.out.println(accountd.toString());
    }
    public void question3(){
        Group groupb = new Group("groupB", new Account(), LocalDate.of(2022, 3, 4), new Account[2]);
        String[] usernames = {"account1", "account2"};
        Group groupc = new Group("groupC", new Account(), LocalDate.of(2023, 3, 4), usernames);
        System.out.println("Cau b" + groupb.toString());
        System.out.println("Cau c" + groupc.toString());
    }
}
