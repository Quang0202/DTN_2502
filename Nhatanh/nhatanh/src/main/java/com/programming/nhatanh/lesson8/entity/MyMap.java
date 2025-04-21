package com.programming.nhatanh.lesson8.entity;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMap<K, V> {
    private Map<K, V> map;

    public MyMap() {
        map = new HashMap<>();
    }

    public void put(K key, V value) {
        map.put(key, value);
    }

    public V getValue(K key) {
        return map.get(key);
    }

    public Set<K> getKey() {
        return map.keySet();
    }
}
