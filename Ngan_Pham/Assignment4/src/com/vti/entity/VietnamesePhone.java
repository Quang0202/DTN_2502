package com.vti.entity;

import java.util.ArrayList;

public class VietnamesePhone extends Phone{
    ArrayList<Contact> contacts = new ArrayList<Contact>();

    @Override
    public void insertContact(String name, String phone) {
        for (Contact c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                if (!c.getNumber().contains(phone)) {
                    c.setNumber(c.getNumber() + " | " + phone);
                }
                return;
            }
        }
        contacts.add(new Contact(name, phone));
    }

    @Override
    public void removeContact(String name) {
        contacts.removeIf(c -> c.getName().equalsIgnoreCase(name));
    }

    @Override
    public void updateContact(String name, String newPhone) {
        for (Contact c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                c.setNumber(newPhone);
                return;
            }
        }
        System.out.println("Không tìm thấy tên để cập nhật.");
    }

    @Override
    public void searchContact(String name) {
        for (Contact c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                System.out.println(c);
                return;
            }
        }
        System.out.println("Không tìm thấy tên trong danh bạ.");
    }

    public void showAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Danh bạ trống.");
        } else {
            for (Contact c : contacts) {
                System.out.println(c);
            }
        }
    }
}

