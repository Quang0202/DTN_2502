package MaiTienThanh.src.com.vti.entity;

import MaiTienThanh.src.com.vti.backend.Lesson6.Exercise1.Question2.InvalidAgeInputingException;
import MaiTienThanh.src.com.vti.entity.Lesson6.ScannerUtils;
import java.time.LocalDate;
public class Account {
    private int accountId;
    private String email;
    private String username;
    private String fullName;
    private Department department;
    private Position position;
    private LocalDate createDate;
    private ScannerUtils scannerUtils = new ScannerUtils();

    public Account(){

    }
    public Account(String username){
        this.username = username;
    }
    public Account(int accountId, String email, String username, String fullName, Department department, Position position, LocalDate createDate) {
        this.accountId = accountId;
        this.email = email;
        this.username = username;
        this.fullName = fullName;
        this.department = department;
        this.position = position;
        this.createDate = createDate;
    }

    public Account(int accountID, String email, String username, String firstName, String lastName){
        this.accountId = accountID;
        this.email = email;
        this.username = username;
        fullName = firstName + " " + lastName;
    }

    public Account(int accountID, String email, String username, String firstName, String lastName, Position position, LocalDate createDate) {
        this.accountId = accountID;
        this.email = email;
        this.username = username;
        fullName = firstName + " " + lastName;
        this.position = position;
        this.createDate = createDate;
    }

    public Account(int accountId, String email, String username, String firstName, String lastName, Position position) {
        this.accountId = accountId;
        this.email = email;
        this.username = username;
        fullName = firstName + " " + lastName;
        this.position = position;

    }


    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", fullName='" + fullName + '\'' +
                ", department=" + department +
                ", position=" + position +
                ", createDate=" + createDate +
                '}';
    }
    public int inputAge() throws InvalidAgeInputingException {
        System.out.print("Enter your age: ");
        int inputAge = scannerUtils.inputInt("Age have to be integer");

        if (inputAge <= 0) {
            throw new InvalidAgeInputingException("The age must be greater than 0");
        }
        return inputAge;
    }
    public int inputAccountAge() {
        int age = -1;
        while (true) {
            try {
                age = inputAge();
                if (age < 18) {
                    System.out.println("Your age must be greater than 18");
                    continue;
                }
                break;
            } catch (InvalidAgeInputingException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
        return age;
    }
}
