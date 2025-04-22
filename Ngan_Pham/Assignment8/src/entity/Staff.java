package entity;

public class Staff<K extends Number> extends MyMap<K, String> {
    public Staff(K id, String name) {
        super(id, name);
    }

    public K getId() {
        return getKey();
    }

    public String getName() {
        return getValue();
    }
}