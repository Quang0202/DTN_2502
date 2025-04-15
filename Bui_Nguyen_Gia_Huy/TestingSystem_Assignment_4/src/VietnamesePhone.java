public class VietnamesePhone extends Phone {
    @Override
    public void insertContact(String name, String phone) {
        for (Contact c : contacts) {
            if (c.name.equals(name)) {
                c.number = phone;
                return;
            }
        }
        contacts.add(new Contact(name, phone));
    }

    @Override
    public void removeContact(String name) {
        contacts.removeIf(c -> c.name.equals(name));
    }

    @Override
    public void updateContact(String name, String newPhone) {
        for (Contact c : contacts) {
            if (c.name.equals(name)) {
                c.number = newPhone;
            }
        }
    }

    @Override
    public void searchContact(String name) {
        for (Contact c : contacts) {
            if (c.name.equals(name)) {
                System.out.println("Found: " + c.name + " - " + c.number);
                return;
            }
        }
        System.out.println("Contact not found.");
    }
}