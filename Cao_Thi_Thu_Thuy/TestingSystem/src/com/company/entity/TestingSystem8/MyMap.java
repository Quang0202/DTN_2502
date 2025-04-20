package com.company.entity.TestingSystem8;

public class MyMap <K,V>{
    private K key;
    private V value;
    public MyMap(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void printInfo() {
        System.out.println("Key (Student ID): " + key + ", Value (Student Name): " + value);
    }
}
