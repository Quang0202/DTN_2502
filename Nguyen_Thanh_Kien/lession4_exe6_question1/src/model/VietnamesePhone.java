package model;

import java.util.stream.Collectors;

public class VietnamesePhone extends Phone {
    public VietnamesePhone() {
    }

    @Override
    public void insertContact(String name, String phone) {
        super.getContacts().add(new Contact(name, phone));
    }

    @Override
    public void removeContact(String name) {
        super.setContacts(
                (java.util.ArrayList<Contact>) super.getContacts().stream()
                        .filter(e -> !e.getName().equalsIgnoreCase(name))
                        .collect(Collectors.toList())
        );
    }

    @Override
    public void updateContact(String name, String newPhone) {
        super.getContacts().forEach(e -> {
            if (e.getName().equalsIgnoreCase(name)) {
                e.setNumber(newPhone);
            }
        });
    }

    @Override
    public void searchContacts(String name) {
        super.getContacts().forEach(e -> {
            if (e.getName().equalsIgnoreCase(name)) {
                System.out.println(e.toString());
            }
        });
    }

    @Override
    public String toString() {
        return "VietnamesePhone{" +
                "contacts=" + super.getContacts() +
                '}';
    }
}
