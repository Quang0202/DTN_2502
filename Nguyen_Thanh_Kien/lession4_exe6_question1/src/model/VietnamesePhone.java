package model;

import java.util.stream.Collectors;

public class VietnamesePhone extends Phone {
    public VietnamesePhone() {
    }

    @Override
    public void insertContact(String name, String phone) {
        this.contacts.add(new Contact(name, phone));
    }

    @Override
    public void removeContact(String name) {
        this.contacts = (java.util.ArrayList<Contact>) this.contacts.stream().filter(e -> !e.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
    }

    @Override
    public void updateContact(String name, String newPhone) {
        this.contacts.forEach(e -> {
            if (e.getName().equalsIgnoreCase(name)) {
                e.setNumber(newPhone);
            }
        });
    }

    @Override
    public void searchContacts(String name) {
        this.contacts.forEach(e -> {
            if (e.getName().equalsIgnoreCase(name)) {
                System.out.println(e.toString());
            }
        });
    }

    @Override
    public String toString() {
        return "VietnamesePhone{" +
                "contacts=" + contacts +
                '}';
    }
}
