package com.vti.abstraction;

public abstract class Phone {

    public abstract void insertContact(String name, String number);
    public abstract void removeContact(String name);
    public abstract void updateContact(String name, String newPhone);
    public abstract void searchContact(String name);
}
