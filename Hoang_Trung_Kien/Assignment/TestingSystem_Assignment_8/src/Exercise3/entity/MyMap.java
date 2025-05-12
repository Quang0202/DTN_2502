package Exercise3.entity;

import java.util.HashMap;
import java.util.Map;

public class MyMap <K, V>{
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

    @Override
    public String toString() {
        return "MyMap{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
