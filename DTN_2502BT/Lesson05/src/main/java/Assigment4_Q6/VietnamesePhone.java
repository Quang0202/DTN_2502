package Assigment4_Q6;

public class VietnamesePhone extends Phone {
    @Override
    public void insertContact(String name, String phone) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                System.out.println("Liên hệ đã tồn tại.");
                return;
            }
        }
        contacts.add(new Contact(name, phone));
        System.out.println("Đã thêm liên hệ.");
    }

    @Override
    public void removeContact(String name) {
        contacts.removeIf(contact -> contact.getName().equalsIgnoreCase(name));
        System.out.println("Đã xóa liên hệ (nếu tồn tại).");
    }

    @Override
    public void updateContact(String name, String newPhone) {
for (Contact c : contacts) {
    if (c.getName().equalsIgnoreCase(name)) {
        c.setPhone(newPhone);
        System.out.println("Đã cập nhật số điện thoại.");
        return;
    }
}
        System.out.println("khong tim thay so dien thoai");
    }

    @Override
    public void searchContact(String name) {
        System.out.println("Kết quả tìm kiếm:");
        for (Contact contact : contacts) {
            if (contact.getName().toLowerCase().contains(name.toLowerCase())) {
                contact.display();
            }
        }
    }
}
