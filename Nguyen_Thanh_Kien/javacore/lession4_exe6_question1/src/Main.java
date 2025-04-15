import model.VietnamesePhone;

public class Main {
    public static void main(String[] args) {
        VietnamesePhone vietnamesePhone = new VietnamesePhone();
        vietnamesePhone.insertContact("Kien", "0123");
        vietnamesePhone.insertContact("Trung", "5555");
        vietnamesePhone.insertContact("Hoang", "4444");

        System.out.println("Test insert: \n" + vietnamesePhone.toString());

        vietnamesePhone.removeContact("Trung");
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("After remove Trung: \n" + vietnamesePhone.toString());
        System.out.println("-------------------------------------------------------------------------------------");

        vietnamesePhone.updateContact("Kien", "9999999999");
        System.out.println("Update number kien from 0123 to 9999999999: \n" + vietnamesePhone.toString());
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("Search by name is kien:");
        vietnamesePhone.searchContacts("kien");
    }
}