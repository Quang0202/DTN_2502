package com.programming.nhatanh.lesson8.entity;

import java.util.Map;
import java.util.Set;

public class Phone<T> extends MyMap<T, String>{

    private Map<T, String> staffMap;


    public Phone(T id, String name) {
        put(id, name);
    }

    public Set<T> getId() {
        return getKey();
    }

    public String getPhoneNumber(T id) {
        return getValue(id);
    }

}
