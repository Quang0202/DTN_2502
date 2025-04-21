package Exercise3.entity;

public class Staff<K, V> extends MyMap{
    public Staff(K key, V value) {
        super(key, value);
    }

    public Object getId() {
        return getKey();
    }

    public Object getName() {
        return getValue();
    }
}
