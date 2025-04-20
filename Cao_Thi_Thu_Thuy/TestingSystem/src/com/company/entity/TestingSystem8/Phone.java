package com.company.entity.TestingSystem8;

public class Phone <K,V>{
    private K key;
    private V value;

    public Phone(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public V getPhoneNumber(){
        return value;
    }

    public K getKey() {
        return key;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "key=" + key +
                ", number=" + value +
                '}';
    }
}
