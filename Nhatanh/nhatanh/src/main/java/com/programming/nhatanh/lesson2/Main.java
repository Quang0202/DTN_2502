package com.programming.nhatanh.lesson2;

import com.programming.nhatanh.entity.Account;
import com.programming.nhatanh.entity.Department;
import com.programming.nhatanh.entity.Exam;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // EXERCISE 2:
        //Q1:

        int a = 5;
        System.out.println("");
        System.out.printf("%d", a);
        //Q2:
        int b = 100000000;
        System.out.println("");
        System.out.printf("%,d", b);
        // Q3
        float c = 5.567098f;
        System.out.println("");
        System.out.printf("%5.2f%n", c);
        //Q3
        String d = "Nguyễn Văn A";
        System.out.println("");
        System.out.printf("Tên tôi là %s và tôi đang độc thân.", d);
        //Q5
        Date date = new Date();
        System.out.println("");
        System.out.printf("%1$td/%1$tm/%1$tY %1$tHh:%1$tMp:%1$tSs", date);
        //Q6
        Account newAccount = new Account();
        Department newDepartment = new Department();
        newAccount.accountId = 1;
        newAccount.email = "abc@gmail.com";
        newAccount.fullName = "Nguyễn Văn A";
        newDepartment.departmentName = "Dev";
        newAccount.department = newDepartment;
        System.out.println("");
        System.out.printf("%s\n%s\n%s", newAccount.email, newAccount.fullName, newAccount.department.departmentName);

        // EXERCISE 3:

        Exam newExam = new Exam();
        LocalDateTime da = LocalDateTime.now();
        System.out.println("");
        newExam.CreateDate = da;

        //Q1:

        Locale locale = new Locale.Builder()
                .setLanguage("vi")
                .setRegion("VN")
                .build();
        DateTimeFormatter q1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss", locale);
//        ZonedDateTime zonedDateTime = da.atZone(ZoneId.of("Asia/Ho_chi_Minh"));
//        DateTimeFormatter q1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).withLocale(locale);
        System.out.println(q1.format(newExam.CreateDate));
        //Q2:
        DateTimeFormatter q2 = DateTimeFormatter.ofPattern("yyyy-MM-dd-kk-mm-ss");
        System.out.println(q2.format(newExam.CreateDate));

        //Q3
        DateTimeFormatter q3 = DateTimeFormatter.ofPattern("yyyy");
        System.out.println(q3.format(newExam.CreateDate));
        //Q3
        DateTimeFormatter q4 = DateTimeFormatter.ofPattern("MM");
        System.out.println(q4.format(newExam.CreateDate));
        //Q5
        DateTimeFormatter q5 = DateTimeFormatter.ofPattern("MM-dd");
        System.out.println(q5.format(newExam.CreateDate));
    }
}
