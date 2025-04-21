package Assigment4_Q6;


import java.util.ArrayList;

class Contact {

    private String name;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public void display() {
        System.out.println("Name: " + name + " Phone: " + phone);
    }
}
abstract class Phone {
 protected ArrayList<Contact> contacts = new ArrayList<Contact>();

 public abstract void insertContact(String name, String phone);
 public abstract void removeContact(String name);
 public abstract void updateContact(String name,String newPhone);
 public abstract void searchContact(String name);

}
