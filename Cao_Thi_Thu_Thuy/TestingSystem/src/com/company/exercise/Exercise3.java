package com.company.exercise;

import com.company.model.Account;
import com.company.model.Department;
import com.company.model.EPositionName;
import com.company.model.Position;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Exercise3 {
    public static void main(String[] args) {
        Department department1 = new Department(1, "IT");
        Position position1 = new Position(1, EPositionName.PM);
        Account account1 = new Account(1, "acc1@gmail.com", "ac1", "ac1", department1, position1, LocalDate.of(2022, 1, 5));
        q5(account1);
    }
    private static void q1(Account account){
        Locale locale = new Locale("vn", "VN");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", new Locale("vi", "VN"));
        String createDate = account.getCreateDate().format(formatter);
        System.out.printf("Id = %d, Email = %s, Username = %s, Fullname = %s, Department = %s, Create date = %s", account.getAccountId(), account.getEmail(),
                account.getUsername(), account.getFullName(), account.getDepartment().getDepartmentName(), createDate);
    }
    // question 2 tuong tu
    private static void q3(Account account){
        Locale locale = new Locale("vn", "VN");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy", new Locale("vi", "VN"));
        String year = account.getCreateDate().format(formatter);
        System.out.printf("Năm tạo account %s", year);
    }
    private static void q4(Account account){
        Locale locale = new Locale("vn", "VN");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/yyyy", new Locale("vi", "VN"));
        String dateCreate = account.getCreateDate().format(formatter);
        System.out.printf("Tháng/năm tạo account: %s", dateCreate);
    }
    private static void q5(Account account){
        Locale locale = new Locale("vn", "VN");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/DD", new Locale("vi", "VN"));
        String dateCreate = account.getCreateDate().format(formatter);
        System.out.printf("Ngày tạo account: %s", dateCreate);
    }

}
