package com.vti.backend;

public class Contact {
    private String name;
    private String number;

    public Contact(String name, String number ) {
        this.number = number;
        this.name = name;
    }

    public Contact() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
