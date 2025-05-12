package com.vti.abstraction;

import java.util.ArrayList;

public class VietnamesePhone extends Phone {
    private ArrayList<Contact> contacts = new ArrayList<>();

    @Override
    public void insertContact(String name, String phone) {
        Contact contact = new Contact(name, phone);
        contacts.add(contact);
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
            }
        }
    }

    @Override
    public void searchContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                System.out.println(contact);
            }
        }
    }


}
