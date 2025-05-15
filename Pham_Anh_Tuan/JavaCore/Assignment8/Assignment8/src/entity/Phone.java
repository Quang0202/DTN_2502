package entity;

public class Phone<K> extends MyMap<K, String> {
    public Phone(K key, String phoneNumber) {
        super(key, phoneNumber);
    }

    public String getPhoneNumber() {
        return getValue();
    }
}