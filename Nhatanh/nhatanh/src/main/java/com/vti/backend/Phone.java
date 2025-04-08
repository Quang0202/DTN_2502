package com.vti.backend;

import java.util.ArrayList;

public abstract class Phone {
    ArrayList<Contact> Contacts = new ArrayList<>();

    abstract void insertContact(String name, String phone);
    abstract void removeContact(String name);
    abstract void updateContact(String name, String newPhone);
    abstract void searchContact(String name);

}
