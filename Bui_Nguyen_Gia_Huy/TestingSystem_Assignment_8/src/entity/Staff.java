package entity;

public class Staff<K extends Number, V> extends MyMap<K, V> {

    public Staff(K id, V name) {
        super(id, name);
    }

    public K getId() {
        return getKey();
    }

    public V getName() {
        return getValue();
    }
}
