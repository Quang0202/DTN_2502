package Exercise3.entity;

public class Phone <K, V> extends MyMap {
    public Phone(K key, V phoneNumber) {
        super(key, phoneNumber);
    }

    public Object getPhoneNumber() {
        return getValue();
    }

    @Override
    public String toString() {
        return "Phone{} " + super.toString();
    }
}
