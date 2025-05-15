package com.vti.entity;

public class VietnamesePhone extends Phone {
    @Override
    public void insertContact(String name, String phone) {
        for (String[] contact : contacts) {
            if (contact[0].equals(name)) {
                // Nếu tên đã tồn tại và số chưa có
                if (!contact[1].contains(phone)) {
                    contact[1] = contact[1] + " : " + phone;
                }
                return;
            }
        }
        contacts.add(new String[]{name, phone});
    }

    @Override
    public void removeContact(String name) {
        contacts.removeIf(contact -> contact[0].equals(name));
    }

    @Override
    public void updateContact(String name, String newPhone) {
        for (String[] contact : contacts) {
            if (contact[0].equals(name)) {
                contact[1] = newPhone;
                return;
            }
        }
    }

    @Override
    public void searchContact(String name) {
        for (String[] contact : contacts) {
            if (contact[0].equals(name)) {
                System.out.println("Found: " + contact[0] + " - " + contact[1]);
                return;
            }
        }
        System.out.println("Contact not found: " + name);
    }

    public void printContacts() {
        System.out.println("=== Danh bạ hiện tại ===");
        for (String[] contact : contacts) {
            System.out.println(contact[0] + " - " + contact[1]);
        }
    }
}
