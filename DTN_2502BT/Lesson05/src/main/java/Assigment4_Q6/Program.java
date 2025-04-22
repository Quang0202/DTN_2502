package Assigment4_Q6;

public class Program {
    public static void main(String[] args) {
        Question2();
//        VietnamesePhone vph = new VietnamesePhone();
//        vph.insertContact("Alice", "0123456789");
//        vph.insertContact("Tai", "0388041623");
//
//        vph.updateContact("Tai","0122121212");
//                vph.searchContact("Tai");

    }
    public static void Question2() {
        User emp = new Employee("tai",1);
        User emp2 = new Manager("Huy",2);
        User emp3 = new Waiter("tai",3);
        System.out.println("------------------------------");
        emp.displayInfor();
        System.out.println("------------------------------");
        emp2.displayInfor();
        System.out.println("------------------------------");
        emp3.displayInfor();
    }
}
