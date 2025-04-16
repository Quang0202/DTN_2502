package com.programming.nhatanh.entity;


import com.programming.nhatanh.lesson6.exercise2.entity.ScannerUtils;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class Group {
    public int groupId;
    public String groupName;
    public Account creator;
    public LocalDateTime createDate;
    public List<Account> accounts;

    public Group() {
        Scanner scanner = new Scanner(System.in);
        ScannerUtils scannerUtils = new ScannerUtils();
        groupId = scannerUtils.inputInt("Invalid input");
        groupName = scannerUtils.inputString();
        String inputDate = scannerUtils.inputString();
        LocalDateTime newLocalDateTime = LocalDateTime.parse(inputDate);
        creator = new Account();
        System.out.print("Bạn muốn add bao nhiêu account: ");
        int x = scanner.nextInt();
        if(x == 0){
            return;
        }
        for (int i = 0; i < x; i++) {
            Account newAccount = new Account();
            accounts.add(newAccount);
        }

    }

    public Group(String groupName, Account creator, LocalDateTime createDate, List<Account> accounts) {
        this.groupName = groupName;
        this.creator = creator;
        this.createDate = createDate;
        this.accounts = accounts;
    }

    public Group(String groupName, Account creator, LocalDateTime createDate, String[] usernames) {
        this.groupName = groupName;
        this.creator = creator;
        this.createDate = createDate;
        for (String i : usernames) {
            Account newAccount = new Account();
            newAccount.userName = i;
            accounts.add(newAccount);
        }

    }

    @Override
    public String toString() {
        return "Group{" +
                "groupId=" + groupId +
                ", groupName='" + groupName + '\'' +
                ", creator=" + creator +
                ", createDate=" + createDate +
                ", accounts=" + accounts +
                '}';
    }


}
