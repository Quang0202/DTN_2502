package com.vti.backend;

import java.util.Objects;

public class VietnamesePhone extends Phone{


    @Override
    void insertContact(String name, String phone) {
        Contact newContact = new Contact(name, phone);
        super.Contacts.add(newContact);
    }

    @Override
    void removeContact(String name) {
        super.Contacts.removeIf(e -> Objects.equals(e.getName(), name));
    }

    @Override
    void updateContact(String name, String newPhone) {
        for(Contact item : super.Contacts) {
            if(Objects.equals(item.getName(), name)) {
                item.setNumber(newPhone);
            }
        }
    }

    @Override
    void searchContact(String name) {
        var result = super.Contacts.stream().filter(e -> Objects.equals(e.getName(), name))
                .findAny()
                .orElse(null);
        System.out.println(result);
    }
}
