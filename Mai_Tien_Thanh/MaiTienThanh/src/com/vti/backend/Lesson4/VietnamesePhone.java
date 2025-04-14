package MaiTienThanh.src.com.vti.backend.Lesson4;



import java.util.ArrayList;
import java.util.List;

public class VietnamesePhone extends Phone implements SmartPhone{
    List<Contact> contacts = new ArrayList<>();
    @Override
    public void insertContact(String name, String phone) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                if (!contact.getNumber().equals(phone)) {
                    contact.setNumber(contact.getNumber() + " / " + phone);
                }
                return;
            }
        }
        contacts.add(new Contact(name, phone));
    }

    @Override
    public void removeContact(String name) {
        contacts.removeIf(contact -> contact.getName().equals(name));
    }

    @Override
    public void updateContact(String name, String newPhone) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                contact.setNumber(newPhone);
                return;
            }
        }
    }

    @Override
    public void searchContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                System.out.println("Found: " + contact.getName() + " - " + contact.getNumber());
                return;
            }
        }
        System.out.println("Contact not found: " + name);
    }
    void showAllContacts() {
        System.out.println("----- Danh bạ -----");
        for (Contact contact : contacts) {
            System.out.println(contact.getName() + ": " + contact.getNumber());
        }
    }

    @Override
    public void videoCall() {

    }
}

