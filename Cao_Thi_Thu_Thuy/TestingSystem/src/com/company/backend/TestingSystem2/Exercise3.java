package com.company.backend.TestingSystem2;

import com.company.entity.Account;
import com.company.entity.Department;
import com.company.entity.EPositionName;
import com.company.entity.Position;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Exercise3 {
    public void q1(Account account){
        Locale locale = new Locale("vn", "VN");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", new Locale("vi", "VN"));
        String createDate = account.getCreateDate().format(formatter);
        System.out.printf("Id = %d, Email = %s, Username = %s, Fullname = %s, Department = %s, Create date = %s", account.getAccountId(), account.getEmail(),
                account.getUsername(), account.getFullName(), account.getDepartment().getDepartmentName(), createDate);
    }
    // question 2 tuong tu
    public void q3(Account account){
        Locale locale = new Locale("vn", "VN");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy", new Locale("vi", "VN"));
        String year = account.getCreateDate().format(formatter);
        System.out.printf("Năm tạo account %s", year);
    }
    public void q4(Account account){
        Locale locale = new Locale("vn", "VN");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/yyyy", new Locale("vi", "VN"));
        String dateCreate = account.getCreateDate().format(formatter);
        System.out.printf("Tháng/năm tạo account: %s", dateCreate);
    }
    public void q5(Account account){
        Locale locale = new Locale("vn", "VN");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/DD", new Locale("vi", "VN"));
        String dateCreate = account.getCreateDate().format(formatter);
        System.out.printf("Ngày tạo account: %s", dateCreate);
    }
}
