package entity;

public interface Phone {
    void insertContact(String name, String phone);
    void removeContact(String name);
    void updateContact(String name, String newPhone);
    void searchContact(String name);
}
