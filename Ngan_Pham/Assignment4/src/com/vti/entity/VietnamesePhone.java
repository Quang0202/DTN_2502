package com.vti.entity;

import java.util.ArrayList;

public class VietnamesePhone extends Phone{
    ArrayList<Contact> contacts = new ArrayList<Contact>();

    @Override
    public void insertContact(String name, String phone) {
        contacts.add(new Contact(name, phone));
    }

    @Override
    public void removeContact(String name) {
        contacts.removeIf(contact -> contact.getName().equals(name));
    }

    @Override
    public void updateContact(String name, String newPhone) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                contact.setNumber(newPhone);
            }
        }
    }

    @Override
    public void searchContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                System.out.println(contact);
            }
        }
    }
}

