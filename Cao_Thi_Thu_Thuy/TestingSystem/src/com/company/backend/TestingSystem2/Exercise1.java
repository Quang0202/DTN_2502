package com.company.backend.TestingSystem2;

import com.company.entity.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Exercise1 {
    public void q1(Account account){
//        if (account.getDepartment() == null){
//            System.out.println("Nhân viên này chưa có phòng ban");
//        } else {
//            System.out.println("Phòng ban của nhân viên này là " + account.getDepartment().getDepartmentName());
//        }
        System.out.println(account.getDepartment() == null ? "Nhân viên này chưa có phòng ban" : "Phòng ban của nhân viên này là " + account.getDepartment().getDepartmentName());
    }

    public void q2(Account account, ArrayList<GroupAccount> list){
        int count = 0;
        for (GroupAccount g: list) {
            if(account.getAccountId() == g.getAccount().getAccountId()){
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Nhân viên này chưa có group");
        } else if (count == 1 || count == 2) {
            System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
        } else if (count == 3) {
            System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
        } else {
            System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
        }
    }

    public void q4(Account account){
        System.out.println(account.getPosition().getPositionName() == EPositionName.Dev ? "Đây là Developer" : "Người này không phải là Developer");
    }
    public void q5(Group group, ArrayList<GroupAccount> groupAccounts){
        int count = 0;
        for (GroupAccount g: groupAccounts){
            if (g.getGroup().getGroupId() == group.getGroupId()){
                count++;
            }
        }
        switch (count){
            case 0:
                System.out.println("Nhóm không có thành viên");
                break;
            case 1:
                System.out.println("Nhóm có một thành viên");
                break;
            case 2:
                System.out.println("Nhóm có hai thành viên");
                break;
            case 3:
                System.out.println("Nhóm có ba thành viên");
                break;
            default:
                System.out.println("Nhóm có nhiều thành viên");
        }
    }
    public void q6(Account account, ArrayList<GroupAccount> list){
        int count = 0;
        for (GroupAccount g: list) {
            if(account.getAccountId() == g.getAccount().getAccountId()){
                count++;
            }
        }
        switch (count){
            case 0:
                System.out.println("Nhân viên này chưa có group");
                break;
            case 1:
            case 2:
                System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
                break;
            case 3:
                System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
                break;
            default:
                System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
        }
    }
    public void q8(ArrayList<Account> accounts){
        for(Account a: accounts){
            System.out.println("email='" + a.getEmail() + '\'' +
                    ", fullName='" + a.getFullName() + '\'' +
                    ", department=" + a.getDepartment().getDepartmentName());
        }
    }
    public void q10(ArrayList<Account> accounts){
        for(int i = 0; i < accounts.size(); i++){
            System.out.println(String.format("Thông tin account thứ %d là:", i + 1));
            System.out.println(String.format("Email: %s", accounts.get(i).getEmail()));
            System.out.println(String.format("Full name: %s", accounts.get(i).getFullName()));
            System.out.println(String.format("Phòng ban: %s", accounts.get(i).getDepartment().getDepartmentName()));
            System.out.println();
        }
    }
    public void q13(ArrayList<Account> accounts){
        for(int i = 0; i < accounts.size(); i++){
            if (accounts.get(i).getAccountId() != 2){
                System.out.println(String.format("Thông tin account thứ %d là:", i + 1));
                System.out.println(String.format("Email: %s", accounts.get(i).getEmail()));
                System.out.println(String.format("Full name: %s", accounts.get(i).getFullName()));
                System.out.println(String.format("Phòng ban: %s", accounts.get(i).getDepartment().getDepartmentName()));
                System.out.println();
            }
        }
    }
    public void q15(){
        for(int i = 0; i <= 20; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
    public void q16_10(ArrayList<Account> accounts){
        int i = 0;
        while(i < accounts.size()){
            System.out.println(String.format("Thông tin account thứ %d là:", i + 1));
            System.out.println(String.format("Email: %s", accounts.get(i).getEmail()));
            System.out.println(String.format("Full name: %s", accounts.get(i).getFullName()));
            System.out.println(String.format("Phòng ban: %s", accounts.get(i).getDepartment().getDepartmentName()));
            System.out.println();
            i++;
        }
    }
    public void q16_13(ArrayList<Account> accounts){
        int i = 0;
        while(i < accounts.size()){
            if (accounts.get(i).getAccountId() == 2){
                i++;
                continue;
            }
            System.out.println(String.format("Thông tin account thứ %d là:", i + 1));
            System.out.println(String.format("Email: %s", accounts.get(i).getEmail()));
            System.out.println(String.format("Full name: %s", accounts.get(i).getFullName()));
            System.out.println(String.format("Phòng ban: %s", accounts.get(i).getDepartment().getDepartmentName()));
            System.out.println();
            i++;
        }
    }
    public void q16_15(){
        int i = 0;
        while(i <= 20){
            if(i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
    }

    public void q17_10(ArrayList<Account> accounts){
        int i = 0;
        do{
            System.out.println(String.format("Thông tin account thứ %d là:", i + 1));
            System.out.println(String.format("Email: %s", accounts.get(i).getEmail()));
            System.out.println(String.format("Full name: %s", accounts.get(i).getFullName()));
            System.out.println(String.format("Phòng ban: %s", accounts.get(i).getDepartment().getDepartmentName()));
            System.out.println();
            i++;
        }
        while(i < accounts.size());
    }
    public void q17_13(ArrayList<Account> accounts){
        int i = 0;
        do{
            if (accounts.get(i).getAccountId() == 2){
                i++;
                continue;
            }
            System.out.println(String.format("Thông tin account thứ %d là:", i + 1));
            System.out.println(String.format("Email: %s", accounts.get(i).getEmail()));
            System.out.println(String.format("Full name: %s", accounts.get(i).getFullName()));
            System.out.println(String.format("Phòng ban: %s", accounts.get(i).getDepartment().getDepartmentName()));
            System.out.println();
            i++;
        }
        while(i < accounts.size());
    }
    public void q17_15(){
        int i = 0;
        do{
            if(i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
        while(i <= 20);
    }
}
