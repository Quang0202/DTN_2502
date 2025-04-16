package com.vti.entity;

import com.vti.exception.InvalidAgeInputingException;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Account {
    private int accountId;
    private String userName;
    private String email;
    private String fullName;
    private Gender gender;
    private int age;
    private Department department;
    private Position position;
    private LocalDateTime createDate;
    private Group[] groups;
    private LocalDateTime[] joinDate;

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    public LocalDateTime[] getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDateTime[] joinDate) {
        this.joinDate = joinDate;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", username='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", fullName='" + fullName + '\'' +
                ", gender=" + gender +
                ", department=" + (department != null ? department.getDepartmentName() : "Nhân viên này chưa có phòng ban") +
                ", position=" + position +
                ", createDate=" + createDate +
                '}';
    }

    public String AccountInfo(){
        return "Email: " + email + "\n" +
                "Username: '" + userName + "\n" +
                "FullName: '" + fullName + "\n" +
                "CreateDate: '" + createDate + "\n";
    }

    public Account() {
    }

    public Account(int accountId, String email, String firstName, String lastName) {
        this.accountId = accountId;
        this.email = email;
        this.fullName = firstName + " "  + lastName;
    }

    public Account(int accountId, String email, String firstName, String lastName, Position position) {
        this.accountId = accountId;
        this.email = email;
        this.fullName = firstName + " "  + lastName;
        this.position = position;
        this.createDate = LocalDateTime.now();
    }

    public Account(int accountId, String email, String firstName, String lastName, Position position, LocalDateTime createDate) {
        this.accountId = accountId;
        this.email = email;
        this.fullName = firstName + " "  + lastName;
        this.position = position;
        this.createDate = createDate;
    }

    public int getAge() {
        return age;
    }


    public void inputAge() {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        try {
            age = Integer.parseInt(input);
            if (age > 0) {
                System.out.println(age);
            } else {
                throw new InvalidAgeInputingException("The age must be greater than 0");
            }
        } catch (NumberFormatException e) {
            System.out.println("Wrong inputting! Please input an age as int, input again.");
        } catch (InvalidAgeInputingException e) {
            throw new RuntimeException(e);
        }
    }

    public void inputAccountAge() throws InvalidAgeInputingException {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        try {
            age = Integer.parseInt(input);
            if (age > 18) {
                System.out.println(age);
            } else {
                throw new InvalidAgeInputingException("The age must be greater than 18");
            }
        } catch (NumberFormatException e) {
            System.out.println("Wrong inputting! Please input an age as int, input again.");
        } catch (InvalidAgeInputingException e) {
            throw new InvalidAgeInputingException("The age must be greater than 18");
        }
    }
}
