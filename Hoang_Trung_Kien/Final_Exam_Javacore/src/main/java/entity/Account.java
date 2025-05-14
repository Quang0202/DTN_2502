package entity;

import java.time.LocalDateTime;

public class Account {
    private int accountId;
    private String email;
    private String username;
    private String fullName;
    private String avatarImageName;
    private String address;
    private LocalDateTime createDate;
    private String password;
    private byte status = 0;

    public Account(int accountId, String password, LocalDateTime createDate, String address, String avatarImageName, String fullName, String username, String email) {
        this.accountId = accountId;
        this.password = password;
        this.createDate = createDate;
        this.address = address;
        this.avatarImageName = avatarImageName;
        this.fullName = fullName;
        this.username = username;
        this.email = email;
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

    public String getAvatarImageName() {
        return avatarImageName;
    }

    public void setAvatarImageName(String avatarImageName) {
        this.avatarImageName = avatarImageName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", fullName='" + fullName + '\'' +
                ", avatarImageName='" + avatarImageName + '\'' +
                ", address='" + address + '\'' +
                ", createDate=" + createDate +
                ", password='" + password + '\'' +
                ", status=" + status +
                '}';
    }
}
