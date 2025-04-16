package model;

import java.util.ArrayList;
import java.util.Arrays;

public class VietnamesePhone extends Phone{
    ArrayList<Contact> contacts = new ArrayList<>();
    @Override
    public void insertContact(String name, String phone) {
        contacts.add(new Contact(name,phone));
    }

    @Override
    public void removeContact(String name) {
        contacts.removeIf(contact -> contact.getName().equalsIgnoreCase(name));
    }

    @Override
    public void updateContact(String name, String newPhone) {
        for(Contact contact : contacts){
            if(contact.getName().equalsIgnoreCase(name)){
                contact.setNumber(newPhone);
            }
        }
    }

    @Override
    public void searchContact(String name) {
        for(Contact contact : contacts){
            if(contact.getName().equalsIgnoreCase(name)){
                System.out.println(contact);
            }
        }
    }
}
