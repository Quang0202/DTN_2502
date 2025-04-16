public class Program6_1 {
    public static void main(String[] args) {
        VietnamesePhone phone = new VietnamesePhone();
        phone.insertContact("Nam", "0123456789");
        phone.insertContact("Linh", "0987654321");
        phone.updateContact("Nam", "1111111111");
        phone.searchContact("Nam");
        phone.removeContact("Linh");
        phone.searchContact("Linh");
    }
}
