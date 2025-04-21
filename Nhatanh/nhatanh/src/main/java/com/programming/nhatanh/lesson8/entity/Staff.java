package com.programming.nhatanh.lesson8.entity;

import java.util.Map;
import java.util.Set;

public class Staff<T> extends MyMap<T, String>{

    private Map<T, String> staffMap;


    public void addStaff(T id, String name) {
        put(id, name);
    }

    public Set<T> getId() {
        return getKey();
    }

    public String getName(T id) {
        return getValue(id);
    }
}
