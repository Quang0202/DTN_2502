package entity;

import java.util.ArrayList;

public class VietnamesePhone implements Phone,SmartPhone{
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

    @Override
    public void LuotWeb() {
        System.out.println("luot web");
    }

    @Override
    public void VideoCall() {
        System.out.println("video call");
    }
}
