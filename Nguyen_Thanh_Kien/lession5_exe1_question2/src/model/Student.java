package model;

public class Student {
    private String registrationNumber;
    private String fullName;
    private String address;
    private String priority;
    private Group group;

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public Student(String registrationNumber, String fullName, String address, String priority) {
        this.registrationNumber = registrationNumber;
        this.fullName = fullName;
        this.address = address;
        this.priority = priority;
    }

    public void display(){
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Full Name: " + fullName);
        System.out.println("Address: " + address);
        System.out.println("Priority: " + priority);
        System.out.println("Group: " + group);
    }

    public Student() {
    }
}
